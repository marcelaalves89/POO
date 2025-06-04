public class Conta {
    private double saldo;
    private double limite;

    public Conta(double saldoInicial, double limite) {
        this.saldo = saldoInicial;
        this.limite = limite;
    }

    //Tenta realizar um depósito e retorna uma mensagem com o resultado.
    public String deposita(double valor) {
        if (valor <= 0) {
            return "Valor de depósito inválido: " + valor + ". O valor deve ser positivo.";
        }
        this.saldo += valor;
        return "Depósito de R$" + valor + " realizado com sucesso.";
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }
}