package atv05_GridLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploGridLayout extends JFrame {

    public ExemploGridLayout() {
        super("Exemplo GridLayout (linhas x colunas)");

        // GridLayout(linhas, colunas) -> divide a área em "retângulos" iguais
        this.setLayout(new GridLayout(2, 3)); // 2 linhas e 3 colunas

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
}

