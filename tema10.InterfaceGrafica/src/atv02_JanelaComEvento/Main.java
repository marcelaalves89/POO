package atv02_JanelaComEvento;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        JanelaEvento janela = new JanelaEvento();

        // Quando a janela é fechada, apenas se torna invisível.
        // Com os comandos a seguir, será chamado o metodo exit(),
        // que encerra a aplicação e libera a JVM.

        janela.addWindowListener(
                new WindowAdapter() { // classe do pacote java.awt.event

                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
    }
}
