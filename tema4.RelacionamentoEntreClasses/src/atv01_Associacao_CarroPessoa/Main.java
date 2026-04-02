package atv01_Associacao_CarroPessoa;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fiat Uno");
        Pessoa joao = new Pessoa("João");

        joao.usarCarro(meuCarro);  // a Associação acontece bem aqui
    }
}
