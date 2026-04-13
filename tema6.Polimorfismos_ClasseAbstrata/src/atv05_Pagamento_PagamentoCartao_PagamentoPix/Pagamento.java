package atv05_Pagamento_PagamentoCartao_PagamentoPix;

abstract class Pagamento {

    double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract void processarPagamento();
}