package atv07_Rotulos;

import java.awt.*;
import javax.swing.*;

public class Teste07 extends JFrame {
    private final JLabel label;
    //Teste07.class é um jeito de referenciar a classe Teste07 como objeto Class.
        //Serve para procurar recursos “relativos” àquela classe.
    //getResource("borbo1.jpg"), procura um arquivo chamado borbo1.jpg dentro do classpath, no mesmo pacote da classe Teste07 (forma relativa)
    private final Icon icone = new ImageIcon(Teste07.class.getResource("borbo1.jpg"));

    public Teste07() {
        super("Testando JLabel");
        // Cria um container e define o layout (FlowLayout)
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        // JLabel sem argumentos no construtor
        label = new JLabel();
        label.setText("Label com ícone e texto com alinhamento inferior (BOTTOM)");
        label.setIcon(icone);

        // Define posição do texto em relação ao ícone
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);

        label.setToolTipText("Este é o label");

        container.add(label);

        setSize(500, 300);
        setVisible(true);
    }

    // Metodo principal da aplicação
    public static void main(String[] args) {
        Teste07 application = new Teste07();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
