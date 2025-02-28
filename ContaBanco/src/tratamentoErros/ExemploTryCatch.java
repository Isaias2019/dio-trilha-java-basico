package tratamentoerros;

import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            // Exemplo 1: Tratamento básico de divisão por zero
            System.out.println("=== Exemplo 1: Divisão por Zero ===");
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero!");
        }

        try {
            // Exemplo 2: Múltiplos catches
            System.out.println("\n=== Exemplo 2: Múltiplos Catches ===");
            String texto = null;
            System.out.println(texto.length());

        } catch (NullPointerException e) {
            System.out.println("Erro: Tentativa de acessar objeto null!");
        }

        try {
            // Exemplo 3: Try-catch com finally
            System.out.println("\n=== Exemplo 3: Try-Catch com Finally ===");
            scanner = new Scanner(System.in);
            System.out.println("Digite um número inteiro:");
            int numero = scanner.nextInt();
            System.out.println("Número digitado: " + numero);

        } catch (Exception e) {
            System.out.println("Erro na leitura do número: " + e.getMessage());
        } finally {
            System.out.println("Executando bloco finally...");
            if (scanner != null) {
                scanner.close();
            }
        }

        // Exemplo 4: Lançando exceção personalizada
        System.out.println("\n=== Exemplo 4: Exceção Personalizada ===");
        try {
            validarIdade(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de validação: " + e.getMessage());
        }

        System.out.println("\nPrograma finalizado com sucesso!");
    }

    private static void validarIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa!");
        }
        System.out.println("Idade válida: " + idade);
    }
} 