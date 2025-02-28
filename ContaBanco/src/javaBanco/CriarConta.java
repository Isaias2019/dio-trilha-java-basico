package javaBanco;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CriarConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Leitura dos dados da conta
            System.out.print("Digite o saldo da conta: ");
            double saldo = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Digite a agencia da conta: ");
            int agencia = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Digite o numero da conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Digite o nome do titular da conta: ");
            String nome = scanner.nextLine();

            Conta conta = new Conta(saldo, agencia, numero, nome);
            System.out.println("Conta criada com sucesso!");

            // Loop para garantir um valor de saque válido
            double valor = 0;
            boolean valorValido = false;
            while (!valorValido) {
                try {
                    System.out.print("Digite o valor para saque: ");
                    String entrada = scanner.nextLine().replace(",", "."); // Permite vírgula como separador
                    valor = Double.parseDouble(entrada);
                    valorValido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Valor inválido! Use números (ex: 50.0 ou 50,0).");
                }
            }

            conta.sacar(valor);
            System.out.println("Saque realizado! Saldo atual: " + conta.saldo);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida! Certifique-se de usar números nos campos corretos.");
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}