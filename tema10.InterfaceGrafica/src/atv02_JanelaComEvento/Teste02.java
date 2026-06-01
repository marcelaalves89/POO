package atv02_JanelaComEvento;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Teste02 extends JFrame {
    public Teste02() {

        // Define o título da janela
        super("Primeira janela");

        this.setSize(320, 240);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        Teste02 janela = new Teste02();

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
