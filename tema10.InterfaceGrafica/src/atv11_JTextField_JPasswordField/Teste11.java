package atv11_JTextField_JPasswordField;

// Exemplo de JTextField

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Teste11 extends JFrame {

    private JTextField campoTexto1, campoTexto2, campoTexto3;
    private JPasswordField campoSenha;

    // Configuração da GUI
    public Teste11() {

        super("Testando JTextField e JPasswordField");

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        // 1º campo de texto (10 colunas)
        campoTexto1 = new JTextField(10);
        container.add(campoTexto1);

        // 2º campo com texto padrão
        campoTexto2 = new JTextField("Digite seu texto aqui:");
        container.add(campoTexto2);

        // 3º campo com texto padrão e 20 colunas (não editável)
        campoTexto3 = new JTextField("Campo de texto não editável", 20);
        campoTexto3.setEditable(false);
        container.add(campoTexto3);

        // Campo de senha
        campoSenha = new JPasswordField("Texto oculto");
        container.add(campoSenha);

        // Registrando os tratadores de evento
        GerenciadorTextField gerenteTexto = new GerenciadorTextField();

        campoTexto1.addActionListener(gerenteTexto);
        campoTexto2.addActionListener(gerenteTexto);
        campoTexto3.addActionListener(gerenteTexto);
        campoSenha.addActionListener(gerenteTexto);

        setSize(360, 120);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        Teste11 programaTexto = new Teste11();
        programaTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Classe interna para tratamento de eventos
    private class GerenciadorTextField implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {

            String texto = "";

            // ENTER no campoTexto1
            if (evento.getSource() == campoTexto1) {
                texto = "campoTexto1: " + evento.getActionCommand();
            }

            // ENTER no campoTexto2
            else if (evento.getSource() == campoTexto2) {
                texto = "campoTexto2: " + evento.getActionCommand();
            }

            // ENTER no campoTexto3
            else if (evento.getSource() == campoTexto3) {
                texto = "campoTexto3: " + evento.getActionCommand();
            }

            // ENTER no campoSenha
            else if (evento.getSource() == campoSenha) {

                JPasswordField senha =
                        (JPasswordField) evento.getSource();

                texto = "campoSenha: "
                        + new String(senha.getPassword());
            }

            JOptionPane.showMessageDialog(null, texto);
        }
    }
}

