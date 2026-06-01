package atv06_SpringLayout;

import javax.swing.*;
import java.awt.*;

public class Teste06 extends JFrame {
    public Teste06() {
        super("Exemplo SpringLayout");

        // Criando o layout
        SpringLayout layout = new SpringLayout();
        Container c = getContentPane();
        c.setLayout(layout);

        // Criando componentes
        JButton botao1 = new JButton("Botão 1");
        JButton botao2 = new JButton("Botão 2");

        c.add(botao1);
        c.add(botao2);

        // Definindo restrições (relações entre bordas)

        // Botão 1:
        // 20px da borda superior e 30px da borda esquerda do container
        layout.putConstraint(SpringLayout.NORTH, botao1,
                20, SpringLayout.NORTH, c);

        layout.putConstraint(SpringLayout.WEST, botao1,
                30, SpringLayout.WEST, c);

        // Botão 2:
        // 20px abaixo do Botão 1
        layout.putConstraint(SpringLayout.NORTH, botao2,
                20, SpringLayout.SOUTH, botao1);

        // Alinhado à esquerda com o Botão 1
        layout.putConstraint(SpringLayout.WEST, botao2,
                0, SpringLayout.WEST, botao1);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Teste06();
    }
}
