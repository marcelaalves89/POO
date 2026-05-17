package atv07_HashMap_Produto_Estoque;
import java.util.HashMap;
import java.util.Map;

class Estoque {
    private HashMap<Integer, Produto> produtos;

    public Estoque() {
        produtos = new HashMap<>();
    }
    // put() -> adiciona elementos
    public void adicionarProduto(Integer codigo, Produto produto) {
        produtos.put(codigo, produto);
    }
    // get() -> busca produto pela chave
    public void buscarProduto(Integer codigo) {
        System.out.println(produtos.get(codigo));
    }
    // remove() -> remove elemento
    public void removerProduto(Integer codigo) {
        produtos.remove(codigo);
    }
    // containsKey() -> verifica chave
    public void verificarCodigo(Integer codigo) {
        System.out.println(produtos.containsKey(codigo));
    }
    // size() -> quantidade
    public void quantidadeProdutos() {
        System.out.println(produtos.size());
    }
    // isEmpty() -> verifica vazio
    public void verificarEstoqueVazio() {
        System.out.println(produtos.isEmpty());
    }
    // for-each para percorrer HashMap
    public void listarProdutos() {
        //o metodo entrySet transforma o HashMap em conjunto de pares
        for (Map.Entry<Integer, Produto> item : produtos.entrySet()) {
            System.out.println(
                    "Código: " + item.getKey()
                            + " | " + item.getValue()
            );
        }
    }
}
