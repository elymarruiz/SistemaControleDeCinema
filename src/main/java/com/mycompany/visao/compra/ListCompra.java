/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.compra;

import com.mycompany.dao.DaoCompra;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elymar.8221
 */
public class ListCompra extends javax.swing.JFrame {

    /**
     * Creates new form listCompra
     */
    public ListCompra() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listarTodos();
    }
    
    public void listarTodos(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCompra.getModel();
            
            tableCompra.setModel(defaultTableModel);

            DaoCompra daoCompra = new DaoCompra();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCompra.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cliente = resultSet.getString(2);
                String filme = resultSet.getString(3);
                String sala = resultSet.getString(4);
                String sessao = resultSet.getString(5);
                String horario = resultSet.getString(6);
                String ingresso = resultSet.getString(7);
                Double preco = resultSet.getDouble(8);
                
                defaultTableModel.addRow(new Object[]{id, cliente, filme, sala, sessao, horario, ingresso, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }     
    
    public void listarPorId(int pId){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCompra.getModel();
            
            tableCompra.setModel(defaultTableModel);

            DaoCompra daoCompra = new DaoCompra();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCompra.listarPorId(pId);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cliente = resultSet.getString(2);
                String filme = resultSet.getString(3);
                String sala = resultSet.getString(4);
                String sessao = resultSet.getString(5);
                String horario = resultSet.getString(6);
                String ingresso = resultSet.getString(7);
                Double preco = resultSet.getDouble(8);
                
                defaultTableModel.addRow(new Object[]{id, cliente, filme, sala, sessao, horario, ingresso, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorCliente(String pCliente){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCompra.getModel();
            
            tableCompra.setModel(defaultTableModel);

            DaoCompra daoCompra = new DaoCompra();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCompra.listarPorCliente(pCliente);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cliente = resultSet.getString(2);
                String filme = resultSet.getString(3);
                String sala = resultSet.getString(4);
                String sessao = resultSet.getString(5);
                String horario = resultSet.getString(6);
                String ingresso = resultSet.getString(7);
                Double preco = resultSet.getDouble(8);
                
                defaultTableModel.addRow(new Object[]{id, cliente, filme, sala, sessao, horario, ingresso, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorFilme(String pFilme){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCompra.getModel();
            
            tableCompra.setModel(defaultTableModel);

            DaoCompra daoCompra = new DaoCompra();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCompra.listarPorFilme(pFilme);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cliente = resultSet.getString(2);
                String filme = resultSet.getString(3);
                String sala = resultSet.getString(4);
                String sessao = resultSet.getString(5);
                String horario = resultSet.getString(6);
                String ingresso = resultSet.getString(7);
                Double preco = resultSet.getDouble(8);
                
                defaultTableModel.addRow(new Object[]{id, cliente, filme, sala, sessao, horario, ingresso, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorSala(String pSala){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCompra.getModel();
            
            tableCompra.setModel(defaultTableModel);

            DaoCompra daoCompra = new DaoCompra();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCompra.listarPorSala(pSala);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cliente = resultSet.getString(2);
                String filme = resultSet.getString(3);
                String sala = resultSet.getString(4);
                String sessao = resultSet.getString(5);
                String horario = resultSet.getString(6);
                String ingresso = resultSet.getString(7);
                Double preco = resultSet.getDouble(8);
                
                defaultTableModel.addRow(new Object[]{id, cliente, filme, sala, sessao, horario, ingresso, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public void listarPorSessao(String pSessao){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCompra.getModel();
            
            tableCompra.setModel(defaultTableModel);

            DaoCompra daoCompra = new DaoCompra();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCompra.listarPorSessao(pSessao);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cliente = resultSet.getString(2);
                String filme = resultSet.getString(3);
                String sala = resultSet.getString(4);
                String sessao = resultSet.getString(5);
                String horario = resultSet.getString(6);
                String ingresso = resultSet.getString(7);
                Double preco = resultSet.getDouble(8);
                
                defaultTableModel.addRow(new Object[]{id, cliente, filme, sala, sessao, horario, ingresso, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public void listarPorHorario(String pHorario){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCompra.getModel();
            
            tableCompra.setModel(defaultTableModel);

            DaoCompra daoCompra = new DaoCompra();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCompra.listarPorHorario(pHorario);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cliente = resultSet.getString(2);
                String filme = resultSet.getString(3);
                String sala = resultSet.getString(4);
                String sessao = resultSet.getString(5);
                String horario = resultSet.getString(6);
                String ingresso = resultSet.getString(7);
                Double preco = resultSet.getDouble(8);
                
                defaultTableModel.addRow(new Object[]{id, cliente, filme, sala, sessao, horario, ingresso, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorTipoDeIngresso(String pIngresso){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCompra.getModel();
            
            tableCompra.setModel(defaultTableModel);

            DaoCompra daoCompra = new DaoCompra();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCompra.listarPorTipoDeIngresso(pIngresso);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cliente = resultSet.getString(2);
                String filme = resultSet.getString(3);
                String sala = resultSet.getString(4);
                String sessao = resultSet.getString(5);
                String horario = resultSet.getString(6);
                String ingresso = resultSet.getString(7);
                Double preco = resultSet.getDouble(8);
                
                defaultTableModel.addRow(new Object[]{id, cliente, filme, sala, sessao, horario, ingresso, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorPrecoMaiorQue(Double pPrecoMaior){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCompra.getModel();
            
            tableCompra.setModel(defaultTableModel);

            DaoCompra daoCompra = new DaoCompra();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCompra.listarPorPrecoMaiorQue(pPrecoMaior);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cliente = resultSet.getString(2);
                String filme = resultSet.getString(3);
                String sala = resultSet.getString(4);
                String sessao = resultSet.getString(5);
                String horario = resultSet.getString(6);
                String ingresso = resultSet.getString(7);
                Double preco = resultSet.getDouble(8);
                
                defaultTableModel.addRow(new Object[]{id, cliente, filme, sala, sessao, horario, ingresso, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorPrecoMenorQue(Double pPrecoMenor){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCompra.getModel();
            
            tableCompra.setModel(defaultTableModel);

            DaoCompra daoCompra = new DaoCompra();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCompra.listarPorPrecoMaiorQue(pPrecoMenor);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cliente = resultSet.getString(2);
                String filme = resultSet.getString(3);
                String sala = resultSet.getString(4);
                String sessao = resultSet.getString(5);
                String horario = resultSet.getString(6);
                String ingresso = resultSet.getString(7);
                Double preco = resultSet.getDouble(8);
                
                defaultTableModel.addRow(new Object[]{id, cliente, filme, sala, sessao, horario, ingresso, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorPrecoIgualA(Double pPrecoIgual){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCompra.getModel();
            
            tableCompra.setModel(defaultTableModel);

            DaoCompra daoCompra = new DaoCompra();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoCompra.listarPorPrecoIgualA(pPrecoIgual);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String cliente = resultSet.getString(2);
                String filme = resultSet.getString(3);
                String sala = resultSet.getString(4);
                String sessao = resultSet.getString(5);
                String horario = resultSet.getString(6);
                String ingresso = resultSet.getString(7);
                Double preco = resultSet.getDouble(8);
                
                defaultTableModel.addRow(new Object[]{id, cliente, filme, sala, sessao, horario, ingresso, preco});
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
        tableCompra = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONSULTA DE COMPRA");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "FILME", "CLIENTE", "SALA", "SESSÃO", "HORÁRIO", "INGRESSO", "PREÇO" }));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tableCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CLIENTE", "FILME", "SALA", "SESSÃO", "HORÁRIO", "INGRESSO", "PREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCompra);
        if (tableCompra.getColumnModel().getColumnCount() > 0) {
            tableCompra.getColumnModel().getColumn(0).setResizable(false);
            tableCompra.getColumnModel().getColumn(1).setResizable(false);
            tableCompra.getColumnModel().getColumn(2).setResizable(false);
            tableCompra.getColumnModel().getColumn(3).setResizable(false);
            tableCompra.getColumnModel().getColumn(4).setResizable(false);
            tableCompra.getColumnModel().getColumn(5).setResizable(false);
            tableCompra.getColumnModel().getColumn(6).setResizable(false);
            tableCompra.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfFiltro))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorCliente(tfFiltro.getText());
                break;
            case 2:
                listarPorFilme(tfFiltro.getText());
                break;
            case 3:
                listarPorSala(tfFiltro.getText());
                break;
            case 4:
                listarPorSessao(tfFiltro.getText());
                break;
            case 5:
                listarPorHorario(tfFiltro.getText());
                break;
            case 6:
                listarPorTipoDeIngresso(tfFiltro.getText());
                break;
            case 7:
                listarPorPrecoMaiorQue(Double.parseDouble(tfFiltro.getText()));
                break;
            case 8:
                listarPorPrecoMenorQue(Double.parseDouble(tfFiltro.getText()));
                break;
            case 9:
                listarPorPrecoIgualA(Double.parseDouble(tfFiltro.getText()));
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
            java.util.logging.Logger.getLogger(ListCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tableCompra;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
