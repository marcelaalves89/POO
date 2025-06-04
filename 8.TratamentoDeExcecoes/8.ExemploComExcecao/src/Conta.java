public class Conta {
    private double saldo;
    private double limite;

    public Conta(double saldoInicial, double limite) {
        this.saldo = saldoInicial;
        this.limite = limite;
    }

    public void deposita(double valor) {
        if (valor <= 0) {//verificação de regra de negócio
            throw new IllegalArgumentException("Valor de depósito inválido: " + valor + ". O valor deve ser positivo.");
        }
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }
}