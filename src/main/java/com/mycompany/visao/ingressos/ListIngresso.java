/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.ingressos;

import com.mycompany.dao.DaoIngresso;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elymar.8221
 */
public class ListIngresso extends javax.swing.JFrame {

    /**
     * Creates new form ListIngresso
     */
    public ListIngresso() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listarTodos();
    }
    
    public void listarTodos(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableIngresso.getModel();
            
            tableIngresso.setModel(defaultTableModel);

            DaoIngresso daoIngresso = new DaoIngresso();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoIngresso.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String regular = resultSet.getString(2);
                String meiaentrada = resultSet.getString(3);
                String criança = resultSet.getString(4);
                String idoso = resultSet.getString(5);
                String preço = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, regular, meiaentrada, criança, idoso, preço});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorId(int Id){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableIngresso.getModel();
            
            tableIngresso.setModel(defaultTableModel);

            DaoIngresso daoIngresso = new DaoIngresso();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoIngresso.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String regular = resultSet.getString(2);
                String meiaentrada = resultSet.getString(3);
                String criança = resultSet.getString(4);
                String idoso = resultSet.getString(5);
                String preço = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, regular, meiaentrada, criança, idoso, preço});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorIngressoRegular(String Regular){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableIngresso.getModel();
            
            tableIngresso.setModel(defaultTableModel);

            DaoIngresso daoIngresso = new DaoIngresso();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoIngresso.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String regular = resultSet.getString(2);
                String meiaentrada = resultSet.getString(3);
                String criança = resultSet.getString(4);
                String idoso = resultSet.getString(5);
                String preço = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, regular, meiaentrada, criança, idoso, preço});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorIngressoMeiaEntrada(String MeiaEntrada){
       try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableIngresso.getModel();
            
            tableIngresso.setModel(defaultTableModel);

            DaoIngresso daoIngresso = new DaoIngresso();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoIngresso.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String regular = resultSet.getString(2);
                String meiaentrada = resultSet.getString(3);
                String criança = resultSet.getString(4);
                String idoso = resultSet.getString(5);
                String preço = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, regular, meiaentrada, criança, idoso, preço});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
    
    public void listarPorIngressoCrianca(String Crianca){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableIngresso.getModel();
            
            tableIngresso.setModel(defaultTableModel);

            DaoIngresso daoIngresso = new DaoIngresso();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoIngresso.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String regular = resultSet.getString(2);
                String meiaentrada = resultSet.getString(3);
                String criança = resultSet.getString(4);
                String idoso = resultSet.getString(5);
                String preço = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, regular, meiaentrada, criança, idoso, preço});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
    
    public void listarPorIngressoIdoso(String Idoso){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableIngresso.getModel();
            
            tableIngresso.setModel(defaultTableModel);

            DaoIngresso daoIngresso = new DaoIngresso();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoIngresso.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String regular = resultSet.getString(2);
                String meiaentrada = resultSet.getString(3);
                String criança = resultSet.getString(4);
                String idoso = resultSet.getString(5);
                String preço = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, regular, meiaentrada, criança, idoso, preço});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
    
    public void listarPorPrecoMaiorQue(String Preco){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableIngresso.getModel();
            
            tableIngresso.setModel(defaultTableModel);

            DaoIngresso daoIngresso = new DaoIngresso();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoIngresso.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String regular = resultSet.getString(2);
                String meiaentrada = resultSet.getString(3);
                String criança = resultSet.getString(4);
                String idoso = resultSet.getString(5);
                String preço = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, regular, meiaentrada, criança, idoso, preço});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
    
    public void listarPorPrecoMenorQue(String Preco){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableIngresso.getModel();
            
            tableIngresso.setModel(defaultTableModel);

            DaoIngresso daoIngresso = new DaoIngresso();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoIngresso.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String regular = resultSet.getString(2);
                String meiaentrada = resultSet.getString(3);
                String criança = resultSet.getString(4);
                String idoso = resultSet.getString(5);
                String preço = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, regular, meiaentrada, criança, idoso, preço});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
    
    public void listarPorPrecoIgualA(String Preco){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableIngresso.getModel();
            
            tableIngresso.setModel(defaultTableModel);

            DaoIngresso daoIngresso = new DaoIngresso();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoIngresso.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String regular = resultSet.getString(2);
                String meiaentrada = resultSet.getString(3);
                String criança = resultSet.getString(4);
                String idoso = resultSet.getString(5);
                String preço = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, regular, meiaentrada, criança, idoso, preço});
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
        tfFiltro = new javax.swing.JTextField();
        jcbTipoFiltro = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableIngresso = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONSULTA DE INGRESSO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "REGULAR", "MEIA-ENTRADA", "CRIANÇAS", "IDOSOS" }));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tableIngresso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "REGULAR", "MEIA-ENTRADA", "CRIANÇA", "IDOSO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableIngresso);
        if (tableIngresso.getColumnModel().getColumnCount() > 0) {
            tableIngresso.getColumnModel().getColumn(0).setResizable(false);
            tableIngresso.getColumnModel().getColumn(1).setResizable(false);
            tableIngresso.getColumnModel().getColumn(2).setResizable(false);
            tableIngresso.getColumnModel().getColumn(3).setResizable(false);
            tableIngresso.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfFiltro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorIngressoRegular(tfFiltro.getText());
                break;
            case 2:
                listarPorIngressoMeiaEntrada(tfFiltro.getText());
                break;
            case 3:
                listarPorIngressoCrianca(tfFiltro.getText());
                break;
            case 4:
                listarPorIngressoIdoso(tfFiltro.getText());
                break;
            case 5:
                listarPorPrecoMaiorQue(tfFiltro.getText());
                break;
            case 6:
                listarPorPrecoMenorQue(tfFiltro.getText());
                break;
            case 7:
                listarPorPrecoIgualA(tfFiltro.getText());
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
            java.util.logging.Logger.getLogger(ListIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListIngresso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tableIngresso;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
