package Teste4;

import javax.swing.*;
import java.awt.*;

public class ExemploBorderLayout extends JFrame {
    public ExemploBorderLayout(){
        super("ExemploBoderLayout");

        this.setLayout(new BorderLayout());

        JButton norte  = new JButton("NORTE");
        JButton sul  = new JButton("SUL");
        JButton leste  = new JButton("LESTE");
        JButton oeste  = new JButton("OESTE");
        JButton centro  = new JButton("CENTRO");

        this.setSize(400,300);

        this.setVisible(true);



    }
}
