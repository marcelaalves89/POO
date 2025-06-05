package view;

import java.sql.Connection;

import database.Conexao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JanelaCadastro extends JFrame {

    JFrame parentFrame;

    public JanelaCadastro(JFrame parentFrame) {
        initComponents();
        this.parentFrame = parentFrame;
        this.setTitle("Cadastrar");
        this.setLocationRelativeTo(this.parentFrame);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMatricula = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelCurso = new javax.swing.JLabel();
        labelIdade = new javax.swing.JLabel();
        campoMatricula = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoCurso = new javax.swing.JTextField();
        campoIdade = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(467, 203));
        setResizable(false);
        setSize(new java.awt.Dimension(467, 203));

        labelMatricula.setText("Matrícula:");

        labelNome.setText("Nome:");

        labelCurso.setText("Curso:");

        labelIdade.setText("Idade:");

        campoMatricula.setNextFocusableComponent(campoNome);

        campoNome.setNextFocusableComponent(campoCurso);

        campoCurso.setNextFocusableComponent(campoIdade);

        campoIdade.setNextFocusableComponent(botaoCadastrar);

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelMatricula)
                                        .addComponent(labelIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelNome)
                                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botaoCadastrar))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelCurso)
                                        .addComponent(campoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botaoLimpar))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelIdade)
                                        .addComponent(campoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botaoVoltar))
                                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
        parentFrame.setVisible(true);
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed

        Connection connection = Conexao.getConnection();

        try {
            int matricula = Integer.parseInt(campoMatricula.getText());
            String nome = campoNome.getText();
            String curso = campoCurso.getText();
            int idade = Integer.parseInt(campoIdade.getText());

            String tabela = "alunos";

            String query = "INSERT INTO " + tabela + " VALUES(?,?,?,?);";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, matricula);
            preparedStatement.setString(2, nome);
            preparedStatement.setString(3, curso);
            preparedStatement.setInt(4, idade);

            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Aluno(a) cadastrado!");
            botaoLimparActionPerformed(evt);

            preparedStatement.close();
            connection.close();

        }catch(IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Dados inválidos!");
            botaoLimparActionPerformed(evt);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de comando SQL!");
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        campoMatricula.setText("");
        campoNome.setText("");
        campoCurso.setText("");
        campoIdade.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoCurso;
    private javax.swing.JTextField campoIdade;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel labelCurso;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNome;
    // End of variables declaration//GEN-END:variables
}
