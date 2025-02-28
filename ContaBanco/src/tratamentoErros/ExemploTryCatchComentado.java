package tratamentoerros;

/**
 * Exemplo didático de tratamento de exceções em Java
 * Demonstra diferentes cenários de uso do try-catch
 */
public class ExemploTryCatchComentado {
    public static void main(String[] args) {
        // EXEMPLO 1: Tratamento básico de divisão por zero
        /*
        try {
            int resultado = 10 / 0; // Isso vai gerar uma ArithmeticException
            System.out.println("Resultado: " + resultado); // Esta linha não será executada
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero!");
        }
        */

        // EXEMPLO 2: Múltiplos catches
        /*
        try {
            String texto = null;
            System.out.println(texto.length()); // Gera NullPointerException
            
            int[] numeros = new int[5];
            System.out.println(numeros[10]); // Gera ArrayIndexOutOfBoundsException
        } catch (NullPointerException e) {
            System.out.println("Erro: Tentativa de acessar objeto null!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice do array fora dos limites!");
        }
        */

        // EXEMPLO 3: Try-catch com finally
        /*
        try {
            // Simulando abertura de um recurso (como arquivo ou conexão)
            System.out.println("Abrindo recurso...");
            throw new Exception("Erro simulado!");
        } catch (Exception e) {
            System.out.println("Tratando o erro: " + e.getMessage());
        } finally {
            // O bloco finally SEMPRE é executado, independente de erro
            System.out.println("Fechando recurso...");
        }
        */

        // EXEMPLO 4: Try-catch com recursos (try-with-resources)
        /*
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            // O scanner será fechado automaticamente ao final
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Erro na leitura do número!");
        }
        */

        // EXEMPLO 5: Lançando exceções personalizadas
        /*
        try {
            validarIdade(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de validação: " + e.getMessage());
        }
        */
    }

    /*
    private static void validarIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa!");
        }
        System.out.println("Idade válida: " + idade);
    }
    */
} 