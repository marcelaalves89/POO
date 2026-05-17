package atv05_Stack_Mercadoria;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Criando a pilha
        Stack<Mercadoria> pilhaMercadorias = new Stack<>();

        // push() -> adiciona elementos
        pilhaMercadorias.push(new Mercadoria("Mouse"));
        pilhaMercadorias.push(new Mercadoria("Teclado"));
        pilhaMercadorias.push(new Mercadoria("Monitor"));

        System.out.println("=== ELEMENTOS DA PILHA ===");

        // for-each (enhanced for)
        for (Mercadoria produto : pilhaMercadorias) {
            System.out.println(produto);
        }

        System.out.println("\n=== TOPO DA PILHA ===");

        // peek() -> visualiza topo sem remover
        System.out.println(pilhaMercadorias.peek());

        System.out.println("\n=== REMOVENDO ELEMENTO ===");

        // pop() -> remove topo
        Mercadoria removido = pilhaMercadorias.pop();

        System.out.println("Removido: " + removido);

        System.out.println("\n=== PILHA APÓS REMOÇÃO ===");

        // for-each novamente
        for (Mercadoria produto : pilhaMercadorias) {
            System.out.println(produto);
        }

        System.out.println("\n=== QUANTIDADE DE ELEMENTOS ===");

        // size() -> quantidade
        System.out.println(pilhaMercadorias.size());

        System.out.println("\n=== PILHA ESTÁ VAZIA? ===");

        // empty() -> verifica se está vazia
        System.out.println(pilhaMercadorias.empty());
    }
}