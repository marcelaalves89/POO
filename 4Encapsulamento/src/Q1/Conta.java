package Q1;

public class Conta {
    // Atributos públicos
    public int numero;
    private double saldo;
    private Cliente titular;

    // Construtor que inicializa todos os atributos
    public Conta(int numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }
    public Double getSaldo(){
        return this.saldo;
    }


    public void setTitular(Cliente novoTitular){
        this.titular = novoTitular;
    }
    public Cliente getTitular(){
        return this.titular;
    }
    // Metodo para sacar um valor da conta
    public boolean saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saque NÃO realizado com sucesso!");
            return false;
        }
    }
}

