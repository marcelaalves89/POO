import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner;
    private ListaDeCompras lista;

    public InterfaceUsuario(Scanner scanner, ListaDeCompras lista) {
        this.scanner = scanner;
        this.lista = lista;
    }

    public void executar() {
        int opcao;
        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1 -> adicionar();
                case 2 -> remover();
                case 3 -> lista.exibirItens();
                case 4 -> verificar();
                case 5 -> lista.limparLista();
                case 0 -> System.out.println("Encerrando a aplicação...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void exibirMenu() {
        System.out.println("\n--- MENU LISTA DE COMPRAS ---");
        System.out.println("1 - Adicionar item");
        System.out.println("2 - Remover item");
        System.out.println("3 - Exibir lista");
        System.out.println("4 - Verificar item");
        System.out.println("5 - Limpar lista");
        System.out.println("0 - Sair");
    }

    private int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Tente novamente.");
            scanner.next();
            System.out.print(mensagem);
        }
        return scanner.nextInt();
    }

    private void adicionar() {
        System.out.print("Digite o item para adicionar: ");
        lista.adicionarItem(scanner.nextLine());
    }

    private void remover() {
        System.out.print("Digite o item para remover: ");
        lista.removerItem(scanner.nextLine());
    }

    private void verificar() {
        System.out.print("Digite o item para verificar: ");
        String item = scanner.nextLine();
        if (lista.contemItem(item)) {
            System.out.println("O item \"" + item + "\" está na lista.");
        } else {
            System.out.println("O item \"" + item + "\" não está na lista.");
        }
    }
}