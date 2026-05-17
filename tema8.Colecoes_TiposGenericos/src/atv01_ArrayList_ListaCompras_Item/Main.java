package atv01_ArrayList_ListaCompras_Item;

public class Main {

    public static void main(String[] args) {

        ListaCompras lista = new ListaCompras();

        Item item1 = new Item("Arroz");
        Item item2 = new Item("Feijão");
        Item item3 = new Item("Leite");

        lista.adicionarItem(item1);
        lista.adicionarItem(item2);
        lista.adicionarItem(item3);

        lista.mostrarLista();
        lista.removerItem(item2);
        lista.mostrarLista();

    }

}
