import java.util.Scanner;

class Conta {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;
}

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Conta conta = new Conta();

        
        System.out.println("Por favor, digite o número da Agência:");
        conta.agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        conta.numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o seu nome:");
        conta.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        conta.saldo = scanner.nextDouble();

        
        System.out.println(String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.",
            conta.nomeCliente, conta.agencia, conta.numero, conta.saldo
        ));

        
        scanner.close();
    }
}
