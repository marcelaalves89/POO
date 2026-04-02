package atv05.Cliente_Conta_Encapsulamento;

public class Conta {
    private int numero;
    private double saldo;
    private Cliente titular;

    public Conta(int numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public Cliente getTitular(){
        return titular;
    }
    public void setTitular(Cliente novoTitular){
        this.titular = novoTitular;
    }
    public boolean saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
}