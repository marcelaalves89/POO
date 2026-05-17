package atv09_HashSet_Cliente_Loja;
import java.util.HashSet;

class Loja {
    private HashSet<Cliente> clientes;

    public Loja() {
        clientes = new HashSet<>();
    }
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
    // contains() -> verifica existência
    public void verificarCliente(Cliente cliente) {
        System.out.println(clientes.contains(cliente));
    }
    public void quantidadeClientes() {
        System.out.println(clientes.size());
    }
    // isEmpty() -> verifica vazio
    public void verificarLojaVazia() {
        System.out.println(clientes.isEmpty());
    }
    // for-each para percorrer HashSet
    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}