package view;

import database.Conexao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanelaVisualiza extends JFrame {

    JFrame parentFrame;

    public JanelaVisualiza(JFrame parentFrame) {
        initComponents();
        atualizaTabela();
        this.parentFrame = parentFrame;
        this.setTitle("Consulta");
        this.setLocationRelativeTo(parentFrame);

    }

    public void atualizaTabela() {

        String tabela = "alunos";
        DefaultTableModel tableModel = new DefaultTableModel();

        try {
            Connection conn = Conexao.getConnection();
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM " + tabela + ";";
            ResultSet rs = stmt.executeQuery(query);

            int nColunas = rs.getMetaData().getColumnCount();

            for(int i = 1; i <= nColunas; i++)
                tableModel.addColumn(rs.getMetaData().getColumnName(i));

            while (rs.next()) {
                Object[] rowData = new Object[nColunas];
                for (int i = 1; i <= nColunas; i++)
                    rowData[i - 1] = rs.getObject(i);
                tableModel.addRow(rowData);
            }

            jTable1.setModel(tableModel);


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão ao banco!");
        }


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setDragEnabled(true);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(291, 291, 291))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        parentFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
