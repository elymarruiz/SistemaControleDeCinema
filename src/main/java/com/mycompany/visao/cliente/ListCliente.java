/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.cliente;

import com.mycompany.dao.DaoCliente;
import com.mycompany.ferramentas.DadosTemporarios;
import com.mycompany.ferramentas.Formularios;
import com.mycompany.modelo.ModCliente;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elymar.8221
 */
public class ListCliente extends javax.swing.JFrame {

    /**
     * Creates new form ListCliente
     */
    public ListCliente() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listarTodos();
    }
    
    public void listarTodos(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCliente.getModel();
            
            tableCliente.setModel(defaultTableModel);

            DaoCliente daoCliente = new DaoCliente();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCliente.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String genero = resultSet.getString(4);
                String email = resultSet.getString(5);
                String cpf = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id,nome, sobrenome, genero, email, cpf});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorId(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCliente.getModel();
            
            tableCliente.setModel(defaultTableModel);

            DaoCliente daoCliente = new DaoCliente();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCliente.listarPorId(Integer.parseInt(tfFiltro.getText()));
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String genero = resultSet.getString(4);
                String email = resultSet.getString(5);
                String cpf = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id,nome, sobrenome, genero, email, cpf});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorNome(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCliente.getModel();
            
            tableCliente.setModel(defaultTableModel);

            DaoCliente daoCliente = new DaoCliente();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCliente.listarPorNome(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
            String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String genero = resultSet.getString(4);
                String email = resultSet.getString(5);
                String cpf = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id,nome, sobrenome, genero, email, cpf});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void listarPorSobrenome(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCliente.getModel();
            
            tableCliente.setModel(defaultTableModel);

            DaoCliente daoCliente = new DaoCliente();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCliente.listarPorSobrenome(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
            String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String genero = resultSet.getString(4);
                String email = resultSet.getString(5);
                String cpf = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id,nome, sobrenome, genero, email, cpf});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorGenero(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCliente.getModel();
            
            tableCliente.setModel(defaultTableModel);

            DaoCliente daoCliente = new DaoCliente();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCliente.listarPorGenero(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
            String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String genero = resultSet.getString(4);
                String email = resultSet.getString(5);
                String cpf = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id,nome, sobrenome, genero, email, cpf});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorEmail(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCliente.getModel();
            
            tableCliente.setModel(defaultTableModel);

            DaoCliente daoCliente = new DaoCliente();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCliente.listarPorEmail(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
            String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String genero = resultSet.getString(4);
                String email = resultSet.getString(5);
                String cpf = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id,nome, sobrenome, genero, email, cpf});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorCpf(){
        try{
        DefaultTableModel defaultTableModel = (DefaultTableModel) tableCliente.getModel();
            
            tableCliente.setModel(defaultTableModel);

            DaoCliente daoCliente = new DaoCliente();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCliente.listarPorCpf(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
            String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String genero = resultSet.getString(4);
                String email = resultSet.getString(5);
                String cpf = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id,nome, sobrenome, genero, email, cpf});
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCliente = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONSULTA DE CLIENTE");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "NOME", "SOBRENOME", "GENERO", "EMAIL", "CPF" }));
        jcbTipoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoFiltroActionPerformed(evt);
            }
        });

        tfFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFiltroActionPerformed(evt);
            }
        });

        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "SOBRENOME", "GENERO", "EMAIL", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCliente);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addContainerGap())
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

    private void tableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClienteMouseClicked
        try{
            if (evt.getClickCount() == 2){
                //Pega os dados da pessoa
                ModCliente modCliente = new ModCliente();

                modCliente.setId(Integer.parseInt(String.valueOf(tableCliente.getValueAt(tableCliente.getSelectedRow(), 0))));
//                modPessoa.setIdEndereco(Integer.parseInt(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 1))));
//                modPessoa.setIdEstadoCivil(Integer.parseInt(String.valueOf(tablePessoa.getValueAt(tablePessoa.getSelectedRow(), 2))));;;
                modCliente.setNome(String.valueOf(tableCliente.getValueAt(tableCliente.getSelectedRow(), 5)));
                modCliente.setSobrenome(String.valueOf(tableCliente.getValueAt(tableCliente.getSelectedRow(), 6)));
                modCliente.setGenero(String.valueOf(tableCliente.getValueAt(tableCliente.getSelectedRow(), 7)));
                modCliente.setEmail(String.valueOf(tableCliente.getValueAt(tableCliente.getSelectedRow(), 8)));
                modCliente.setCpf(String.valueOf(tableCliente.getValueAt(tableCliente.getSelectedRow(), 9)));

                
                DadosTemporarios.temObjectFilme = (ModCliente) modCliente;
                
                CadCliente cadCliente = new CadCliente();
                cadCliente.setVisible(true);
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }                                       
    }//GEN-LAST:event_tableClienteMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Formularios.listCliente = null;
    }//GEN-LAST:event_formWindowClosed

    private void jcbTipoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoFiltroActionPerformed
       
    }//GEN-LAST:event_jcbTipoFiltroActionPerformed

    private void tfFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFiltroActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorId();
                break;
            case 2:
                listarPorNome();
                break;
            case 3:
                listarPorSobrenome();
                break;
            case 4:
                listarPorGenero();
                break;
            case 5:
                listarPorEmail();
                break;
            case 6:
                listarPorCpf();
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
            java.util.logging.Logger.getLogger(ListCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tableCliente;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
