package tratamentoerros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TratamentoErros01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> dados = new ArrayList<>();
        boolean dadosValidos = true;
        boolean fimLaco = false;

        while (!fimLaco) {
            System.out.println("Digite [1] para iniciar e [2] para encerrar");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // para limpar o buffer

            if (opcao == 1) {
                // Validação do nome
                System.out.println("Digite o nome: ");
                String nome = scanner.nextLine().trim();

                if (nome.isEmpty()) {
                    System.out.println("Erro: Nome não pode ser vazio");
                    dadosValidos = false;
                } else if (nome.matches(".*\\d+.*")) {
                    System.out.println("Erro: Nome não pode conter números");
                    dadosValidos = false;
                } else {
                    dados.add("Nome: " + nome);
                }

                // Validação da idade
                System.out.println("Digite a idade: ");
                try {
                    int idade = Integer.parseInt(scanner.nextLine().trim());
                    if (idade < 0 || idade > 150) {
                        System.out.println("Erro: Idade inválida. Deve estar entre 0 e 150 anos");
                        dadosValidos = false;
                    } else {
                        dados.add("Idade: " + idade);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Idade deve ser um número inteiro válido");
                    dadosValidos = false;
                }

                // Validação do email
                System.out.println("Digite o email: ");
                String email = scanner.nextLine().trim();

                if (email.isEmpty()) {
                    System.out.println("Erro: Email não pode ser vazio");
                    dadosValidos = false;
                } else if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)\\.com$")) {
                    System.out.println("Erro: Formato de email inválido");
                    dadosValidos = false;
                } else {
                    dados.add("Email: " + email);
                }

                // Salvando os dados se todas as validações passaram
                if (dadosValidos) {
                    try (FileWriter writer = new FileWriter("dados.txt", true)) {
                        for (String dado : dados) {
                            writer.write(dado + "\n");
                        }
                        writer.write("------------------------\n");
                        System.out.println("Dados salvos com sucesso!");
                        System.out.println("\nDados registrados:");
                        dados.forEach(System.out::println);
                    } catch (IOException e) {
                        System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
                    }
                    dados.clear();
                    dadosValidos = true;
                } else {
                    System.out.println("\nDados não foram salvos devido a erros de validação.");
                    dados.clear();
                    dadosValidos = true;
                }
            } else if (opcao == 2) {
                System.out.println("Encerrando o programa...");
                fimLaco = true;
                scanner.close();
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}