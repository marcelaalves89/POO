import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<String> itens;

    public ListaDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        itens.add(item);
        System.out.println("Item adicionado com sucesso!");
    }

    public void removerItem(String item) {
        if (itens.remove(item)) {
            System.out.println("Item removido com sucesso!");
        } else {
            System.out.println("Item não encontrado na lista.");
        }
    }

    public void exibirItens() {
        if (itens.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("Itens na lista:");
            for (String item : itens) {
                System.out.println("- " + item);
            }
        }
    }

    public boolean contemItem(String item) {
        return itens.contains(item);
    }

    public void limparLista() {
        itens.clear();
        System.out.println("Lista limpa com sucesso!");
    }
}
