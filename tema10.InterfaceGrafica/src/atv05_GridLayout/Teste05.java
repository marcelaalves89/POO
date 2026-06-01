package atv05_GridLayout;

import javax.swing.*;
import java.awt.*;

public class Teste05 extends JFrame {
    public Teste05() {
        super("Exemplo GridLayout (linhas x colunas)");

        // GridLayout(linhas, colunas) -> divide a área em "retângulos" iguais
        this.setLayout(new GridLayout(2, 4)); // 2 linhas e 3 colunas

        // Cada add() ocupa a próxima “célula” da grade
        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));

        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        Teste05 grid = new Teste05();
    }
}
