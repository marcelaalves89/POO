package atv09_HashSet_Cliente_Loja;

public class Main {

    public static void main(String[] args) {
        Loja loja = new Loja();

        loja.adicionarCliente(new Cliente("Ana"));
        loja.adicionarCliente(new Cliente("Carlos"));
        loja.adicionarCliente(new Cliente("Marina"));

        // Tentando adicionar repetido
        loja.adicionarCliente(new Cliente("Ana"));
        System.out.println("=== LISTA DE CLIENTES ===");
        loja.listarClientes();
        System.out.println("\n=== QUANTIDADE DE CLIENTES ===");
        loja.quantidadeClientes();
        System.out.println("\n=== CLIENTE ANA EXISTE? ===");
        loja.verificarCliente(new Cliente("Ana"));
        System.out.println("\n=== REMOVENDO CLIENTE CARLOS ===");
        loja.removerCliente(new Cliente("Carlos"));
        System.out.println("\n=== LISTA APÓS REMOÇÃO ===");
        loja.listarClientes();
        System.out.println("\n=== A LOJA ESTÁ VAZIA? ===");
        loja.verificarLojaVazia();
    }
}