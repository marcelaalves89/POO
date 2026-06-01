package Teste3;

import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout extends JFrame {
    public ExemploFlowLayout(){
        super("Frame com FlowLayout");
        JButton b1 = new JButton("Botão 1");
        JButton b2 = new JButton("Botão 2");
        JButton b3 = new JButton("Botão 3");

        this.setSize(320,120);
        //Serve para obter a área interna da Janela
        Container container = this.getContentPane();

        container.add(b1);
        container.add(b2);
        container.add(b3);

        container.setLayout(new java.awt.FlowLayout(FlowLayout.RIGHT));
        this.setVisible(true);
    }
}
