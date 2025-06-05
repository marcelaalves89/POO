package view;

import java.awt.Desktop;
import java.io.IOException;
import static java.lang.System.exit;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

public class JanelaPrincipal extends javax.swing.JFrame {

    public JanelaPrincipal() {
        initComponents();
        this.setTitle("CRUDzinho 1.0");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMensagem = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        botaoConsultar = new javax.swing.JButton();
        barraMenuJanelaPrincipal = new javax.swing.JMenuBar();
        itemMenuArquivo = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        itemMenuAjuda = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMensagem.setText("Olá, o que deseja fazer?");
        getContentPane().add(labelMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        botaoConsultar.setText("Consultar");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        itemMenuArquivo.setText("Arquivo");

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        itemMenuArquivo.add(jMenuItem3);

        barraMenuJanelaPrincipal.add(itemMenuArquivo);

        itemMenuAjuda.setText("Ajuda");

        jMenuItem2.setText("Guia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        itemMenuAjuda.add(jMenuItem2);

        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        itemMenuAjuda.add(jMenuItem1);

        barraMenuJanelaPrincipal.add(itemMenuAjuda);

        setJMenuBar(barraMenuJanelaPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "Desenvolvido por\nClaudio Coutinho\nUnifesspa\nMarabá-Pará-Brasil","Sobre",DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String url = "https://www.javaguides.net/2018/10/jdbc-crud-example-tutorial.html";

        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();

                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    URI uri = new URI(url);
                    desktop.browse(uri);
                } else {
                    System.out.println("Nao e possivel abrir paginas neste sistema.");
                }
            } else {
                System.out.println("A classe java.awt.Desktop nao e suportada nesta plataforma.");
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        this.setVisible(false);
        new JanelaCadastro(this).setVisible(true);
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        this.setVisible(false);
        new JanelaVisualiza(this).setVisible(true);
    }//GEN-LAST:event_botaoConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenuJanelaPrincipal;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JMenu itemMenuAjuda;
    private javax.swing.JMenu itemMenuArquivo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel labelMensagem;
    // End of variables declaration//GEN-END:variables
}
