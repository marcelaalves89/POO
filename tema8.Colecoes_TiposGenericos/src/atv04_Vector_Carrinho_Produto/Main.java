package atv04_Vector_Carrinho_Produto;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        Produto p1 = new Produto("Arroz", 25.90);
        Produto p2 = new Produto("Feijão", 8.50);

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);

        carrinho.listarProdutos();
    }
}
