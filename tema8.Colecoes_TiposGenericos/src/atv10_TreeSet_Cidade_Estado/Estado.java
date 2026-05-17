package atv10_TreeSet_Cidade_Estado;
import java.util.TreeSet;

class Estado {
    private TreeSet<Cidade> cidades;

    public Estado() {
        cidades = new TreeSet<>();
    }
    public void adicionarCidade(Cidade cidade) {
        cidades.add(cidade);
    }
    public void removerCidade(Cidade cidade) {
        cidades.remove(cidade);
    }
    // contains() -> verifica cidade
    public void verificarCidade(Cidade cidade) {
        System.out.println(cidades.contains(cidade));
    }
    // first() -> primeira cidade
    public void primeiraCidade() {
        System.out.println(cidades.first());
    }
    // last() -> última cidade
    public void ultimaCidade() {
        System.out.println(cidades.last());
    }
    // size() -> quantidade
    public void quantidadeCidades() {
        System.out.println(cidades.size());
    }
    // isEmpty() -> verifica se está vazio
    public void verificarEstadoVazio() {
        System.out.println(cidades.isEmpty());
    }
    // for-each para percorrer TreeSet
    public void listarCidades() {
        for (Cidade cidade : cidades) {
            System.out.println(cidade);
        }
    }
}
