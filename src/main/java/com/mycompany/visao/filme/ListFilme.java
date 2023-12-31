/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.filme;

import com.mycompany.dao.DaoFilme;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elymar.8221
 */
public class ListFilme extends javax.swing.JFrame {

    /**
     * Creates new form ListFilme
     */
    public ListFilme() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listarTodos();
    }
    
    public void listarTodos(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableFilme.getModel();
            
            tableFilme.setModel(defaultTableModel);

            DaoFilme daoFilme = new DaoFilme();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoFilme.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String idGenero = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String sinopse = resultSet.getString(4);
                String diretor = resultSet.getString(5);
                String datadelancamento = resultSet.getString(6);
                String duracao = resultSet.getString(7);
                String classificacao = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, idGenero, nome, sinopse, diretor, datadelancamento, duracao, classificacao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorId(int pId){
        try{
            
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableFilme.getModel();
            
            tableFilme.setModel(defaultTableModel);

            DaoFilme daoFilme = new DaoFilme();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoFilme.listarPorId(pId);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String idGenero = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String sinopse = resultSet.getString(4);
                String diretor = resultSet.getString(5);
                String datadelancamento = resultSet.getString(6);
                String duracao = resultSet.getString(7);
                String classificacao = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, idGenero, nome, sinopse, diretor, datadelancamento, duracao, classificacao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorIdGenero(int pIdGenero){
        try{
            
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableFilme.getModel();
            
            tableFilme.setModel(defaultTableModel);

            DaoFilme daoFilme = new DaoFilme();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoFilme.listarPorIdGenero(pIdGenero);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String idGenero = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String sinopse = resultSet.getString(4);
                String diretor = resultSet.getString(5);
                String datadelancamento = resultSet.getString(6);
                String duracao = resultSet.getString(7);
                String classificacao = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, idGenero, nome, sinopse, diretor, datadelancamento, duracao, classificacao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorNome(String pNome){
        try{
            
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableFilme.getModel();
            
            tableFilme.setModel(defaultTableModel);

            DaoFilme daoFilme = new DaoFilme();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoFilme.listarPorNome(pNome);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String idGenero = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String sinopse = resultSet.getString(4);
                String diretor = resultSet.getString(5);
                String datadelancamento = resultSet.getString(6);
                String duracao = resultSet.getString(7);
                String classificacao = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, idGenero, nome, sinopse, diretor, datadelancamento, duracao, classificacao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorSinopse(String pSinopse){
        try{
            
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableFilme.getModel();
            
            tableFilme.setModel(defaultTableModel);

            DaoFilme daoFilme = new DaoFilme();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoFilme.listarPorSinopse(pSinopse);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String idGenero = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String sinopse = resultSet.getString(4);
                String diretor = resultSet.getString(5);
                String datadelancamento = resultSet.getString(6);
                String duracao = resultSet.getString(7);
                String classificacao = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, idGenero, nome, sinopse, diretor, datadelancamento, duracao, classificacao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorDiretor(String pDiretor){
        try{
            
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableFilme.getModel();
            
            tableFilme.setModel(defaultTableModel);

            DaoFilme daoFilme = new DaoFilme();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoFilme.listarPorDiretor(pDiretor);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String idGenero = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String sinopse = resultSet.getString(4);
                String diretor = resultSet.getString(5);
                String datadelancamento = resultSet.getString(6);
                String duracao = resultSet.getString(7);
                String classificacao = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, idGenero, nome, sinopse, diretor, datadelancamento, duracao, classificacao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorDataDeLancamento(String pData){
        try{
            
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableFilme.getModel();
            
            tableFilme.setModel(defaultTableModel);

            DaoFilme daoFilme = new DaoFilme();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoFilme.listarPorDataDeLancamento(pData);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String idGenero = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String sinopse = resultSet.getString(4);
                String diretor = resultSet.getString(5);
                String datadelancamento = resultSet.getString(6);
                String duracao = resultSet.getString(7);
                String classificacao = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, idGenero, nome, sinopse, diretor, datadelancamento, duracao, classificacao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorDuracao(String pDuracao){
        try{
            
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableFilme.getModel();
            
            tableFilme.setModel(defaultTableModel);

            DaoFilme daoFilme = new DaoFilme();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoFilme.listarPorDuracao(pDuracao);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String idGenero = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String sinopse = resultSet.getString(4);
                String diretor = resultSet.getString(5);
                String datadelancamento = resultSet.getString(6);
                String duracao = resultSet.getString(7);
                String classificacao = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, idGenero, nome, sinopse, diretor, datadelancamento, duracao, classificacao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorClassificacao(String pClassificacao){
        try{
            
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableFilme.getModel();
            
            tableFilme.setModel(defaultTableModel);

            DaoFilme daoFilme = new DaoFilme();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoFilme.listarPorClassificacao(pClassificacao);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String idGenero = resultSet.getString(2);
                String nome = resultSet.getString(3);
                String sinopse = resultSet.getString(4);
                String diretor = resultSet.getString(5);
                String datadelancamento = resultSet.getString(6);
                String duracao = resultSet.getString(7);
                String classificacao = resultSet.getString(8);
                
                defaultTableModel.addRow(new Object[]{id, idGenero, nome, sinopse, diretor, datadelancamento, duracao, classificacao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcbTipoFiltro = new javax.swing.JComboBox<>();
        tfFiltro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFilme = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONSULTA DE FILMES");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "GENERO", "NOME", "SINOPSE", "DIRETOR DO FILME", "DATA DE LANÇAMENTO", "DURAÇÃO DO FILME", "CLASSIFICAÇÃO ETÁRIA" }));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tableFilme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "GENERO", "NOME", "SINOPSE", "DIRETOR ", "DATA DE LANÇAMENTO", "DURAÇÃO", "CLASSIFICAÇÃO ETÁRIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableFilme);
        if (tableFilme.getColumnModel().getColumnCount() > 0) {
            tableFilme.getColumnModel().getColumn(0).setResizable(false);
            tableFilme.getColumnModel().getColumn(1).setResizable(false);
            tableFilme.getColumnModel().getColumn(2).setResizable(false);
            tableFilme.getColumnModel().getColumn(3).setResizable(false);
            tableFilme.getColumnModel().getColumn(4).setResizable(false);
            tableFilme.getColumnModel().getColumn(5).setResizable(false);
            tableFilme.getColumnModel().getColumn(6).setResizable(false);
            tableFilme.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfFiltro))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorNome(tfFiltro.getText());
                break;
            case 2:
                listarPorSinopse(tfFiltro.getText());
                break;
            case 3:
                listarPorDiretor(tfFiltro.getText());
                break;
            case 4:
                listarPorDataDeLancamento(tfFiltro.getText());
                break;
            case 5:
                listarPorDuracao(tfFiltro.getText());
                break;
            case 6:
                listarPorClassificacao(tfFiltro.getText());
                break;
        }                    
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tableFilme;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
