package tratamentoErros;

import java.util.InputMismatchException;
import java.util.Scanner;

// vou fazer uma aplicaçao que vai tratar os dados de usuarios via terminal
// e vou fazer um tratamento de erro para que o usuario nao consiga digitar um valor que nao seja um numero
public class TratandoDadosViaTerminalUsuarios {


    public static void main(String[] args) {
        try (// vou criar um objeto da classe Scanner para poder pegar os dados do usuario
        Scanner scanner = new Scanner(System.in)) {
            // vou criar uma variavel para armazenar o valor que o usuario digitar
            int valor = 0;
            // vou criar um loop para que o usuario digite um valor valido
            while (true) {
                // vou tentar pegar o valor que o usuario digitar
                try {
                    System.out.println("Digite um valor: ");
                    // vou pegar o valor que o usuario digitar
                    valor = scanner.nextInt();
                    // se o usuario digitar um valor valido, eu vou sair do loop
                    break;
                } catch (InputMismatchException e) {
                    // se o usuario digitar um valor invalido, eu vou mostrar uma mensagem de erro
                    System.out.println("Digite um valor valido!");
                    // e vou limpar o buffer do scanner
                    scanner.nextLine();
                }
            }
            // vou mostrar o valor que o usuario digitou
            System.out.println("O valor digitado foi: " + valor);
        }
    }
}
