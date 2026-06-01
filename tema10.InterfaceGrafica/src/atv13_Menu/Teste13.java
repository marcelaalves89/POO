package atv13_Menu;

import java.awt.event.*;
import javax.swing.*;

public class Teste13 extends JFrame {

    private JMenuBar barraMenu;
    private JMenu mCad, mRel, mAjuda;
    private JMenuItem iPac, iMed, iFim, iSobre;

    private String sistema = "Sistema de Gerenciamento de Clínicas";
    private String versao = "Versão 1.0";
    private String build = "(build 20030626)";

    //Configura a GUI
    public Teste13() {

        // Define o título da janela
        setTitle(sistema);

        //Cria a barra de menus
        barraMenu = new JMenuBar();

        //Cria os menus
        mCad = new JMenu("Cadastro");
        mCad.setMnemonic('C');

        mRel = new JMenu("Relatórios");
        mRel.setMnemonic('R');

        mAjuda = new JMenu("Ajuda");
        mAjuda.setMnemonic('A');

        //Adiciona menus à barra
        barraMenu.add(mCad);
        barraMenu.add(mRel);
        barraMenu.add(mAjuda);

        //Cria os itens de menu
        iPac = new JMenuItem("Paciente");
        iPac.setMnemonic('P');

        iMed = new JMenuItem("Médico");
        iMed.setMnemonic('M');

        iFim = new JMenuItem("Finaliza");
        iFim.setMnemonic('F');

        iSobre = new JMenuItem("Sobre");
        iSobre.setMnemonic('S');

        //Adiciona itens ao menu Cadastro
        mCad.add(iPac);
        mCad.add(iMed);
        mCad.addSeparator();
        mCad.add(iFim);

        //Adiciona item ao menu Ajuda
        mAjuda.add(iSobre);

        //Registra os tratadores de evento
        Gerenciador gerente = new Gerenciador();

        iPac.addActionListener(gerente);
        iFim.addActionListener(gerente);
        iSobre.addActionListener(gerente);

        //Anexa a barra de menu à janela
        setJMenuBar(barraMenu);

        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);

        // Permite fechar a aplicação ao fechar a janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //Classe interna para tratamento de eventos
    private class Gerenciador implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {

            if (evento.getSource() == iPac) {
                // ExemploGridBagLayout cadastro = new ExemploGridBagLayout();
            }

            else if (evento.getSource() == iFim) {
                System.exit(0);
            }

            else if (evento.getSource() == iSobre) {

                JOptionPane.showMessageDialog(
                        null,
                        sistema + "\n\n" + versao + " " + build + "\n\n",
                        "Sobre o sistema",
                        JOptionPane.PLAIN_MESSAGE
                );
            }
        }
    }

    //Metodo principal
    public static void main(String[] args) {

        new Teste13();
    }
}

