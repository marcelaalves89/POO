package atv10_TreeSet_Cidade_Estado;

public class Main {

    public static void main(String[] args) {
        Estado estado = new Estado();

        estado.adicionarCidade(new Cidade("Marabá"));
        estado.adicionarCidade(new Cidade("Parauapebas"));
        estado.adicionarCidade(new Cidade("Ipixuna"));

        // Tentando adicionar repetido
        estado.adicionarCidade(new Cidade("Marabá"));
        System.out.println("=== LISTA DE CIDADES ===");
        estado.listarCidades();
        System.out.println("\n=== PRIMEIRA CIDADE ===");
        estado.primeiraCidade();
        System.out.println("\n=== ÚLTIMA CIDADE ===");
        estado.ultimaCidade();
        System.out.println("\n=== A CIDADE MARABÁ EXISTE? ===");
        estado.verificarCidade(new Cidade("Marabá"));
        System.out.println("\n=== REMOVENDO CIDADE PARAUAPEBAS ===");
        estado.removerCidade(new Cidade("Parauapebas"));
        System.out.println("\n=== LISTA APÓS REMOÇÃO ===");
        estado.listarCidades();
        System.out.println("\n=== QUANTIDADE DE CIDADES ===");
        estado.quantidadeCidades();
        System.out.println("\n=== O ESTADO ESTÁ VAZIO? ===");
        estado.verificarEstadoVazio();
    }
}
