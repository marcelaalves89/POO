import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDeCompras lista = new ListaDeCompras();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario(new Scanner(System.in), lista);
        interfaceUsuario.executar();
    }
}