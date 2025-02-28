package javaBanco;

public class Conta {

    double saldo;
    int agencia;
    int numero;
    String nome;

    //metodo construtor sem geters e seters
    public Conta(double saldo, int agencia, int numero, String nome) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.nome = nome;
    }

    //metodo sacar com class SaldoInsuficienteException

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque de: " + valor + " saldo atual: " + saldo);
        }
        saldo -= valor;
    }

}

// agora fazer a chamada do metodo sacar na classe CriarConta com try e catch
