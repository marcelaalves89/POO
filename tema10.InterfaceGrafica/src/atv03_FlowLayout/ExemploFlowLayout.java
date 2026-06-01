package atv03_FlowLayout;

import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout extends JFrame {
    public ExemploFlowLayout() {

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
}
