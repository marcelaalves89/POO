package atv03_FlowLayout;

import javax.swing.*;
import java.awt.*;

public class Teste03 extends JFrame{
    public Teste03() {

        // Define o título da janela
        super("Frame com FlowLayout");

        JButton b1 = new JButton("Botão 1");
        JButton b2 = new JButton("Botão 2");
        JButton b3 = new JButton("Botão 3");

        // Define o tamanho da janela (largura, altura)
        this.setSize(320, 120);

        // Obtém a área interna da janela
        Container c = this.getContentPane();

        // Adiciona os botões na janela
        c.add(b1);
        c.add(b2);
        c.add(b3);

        // Define o tipo de organização (layout)
        // FlowLayout organiza em linha (esquerda → direita)
        // RIGHT significa alinhado à direita
        c.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        // Torna a janela visível
        this.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Teste03();
            }
        });
    }
}
