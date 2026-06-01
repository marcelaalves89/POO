package atv04_BorderLayout;

import javax.swing.*;
import java.awt.*;

public class Teste04 extends JFrame {
    public Teste04() {

        super("Exemplo BorderLayout");

        // Define o layout da janela
        this.setLayout(new BorderLayout());

        // Criando componentes
        JButton norte  = new JButton("NORTH");
        JButton sul    = new JButton("SOUTH");
        JButton leste  = new JButton("EAST");
        JButton oeste  = new JButton("WEST");
        JButton centro = new JButton("CENTER");

        // Adicionando nas 5 regiões
        this.add(norte, BorderLayout.NORTH);//Norte
        this.add(sul, BorderLayout.SOUTH);//Sul
        this.add(leste, BorderLayout.EAST);//Leste
        this.add(oeste, BorderLayout.WEST);//Oeste
        this.add(centro, BorderLayout.CENTER);//Centro

        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Teste04();
    }
}
