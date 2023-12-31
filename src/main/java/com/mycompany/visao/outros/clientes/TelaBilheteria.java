/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.outros.clientes;

import com.mycompany.dao.DaoCompra;
import com.mycompany.dao.DaoFilme;
import com.mycompany.dao.DaoIngresso;
import com.mycompany.ferramentas.DadosTemporarios;
import com.mycompany.ferramentas.Formularios;
import com.mycompany.modelo.ModCompra;
import com.mycompany.modelo.ModFilme;
import com.mycompany.modelo.ModSala;
import com.mycompany.modelo.ModSessao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author elymar.8221
 */
public class TelaBilheteria extends javax.swing.JFrame {

    /**
     * Creates new form TelaBilheteria
     */
    public TelaBilheteria() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        carregarTiposIngressos();
        recuperaIdTipoIngresso();
        
        tfIdCliente.setText(String.valueOf(DadosTemporarios.idUsuarioLogado));
        
        existeDadosTemporarios();
        
//        labelQuantidadeCompra.setText("1");
        
//        labelPreco.setText("20.0");
//        labelQuantidadeCompra.setText("1");
        
//        calculaTotalCompra(Double.parseDouble(labelPreco.getText()), Integer.parseInt(labelQuantidadeCompra.getText()));
        
        
//        calculaTotalCompra(Double.parseDouble(labelPreco.getText()), Integer.parseInt(labelQuantidadeCompra.getText()));
        
        tfIdCompra.setVisible(false);
        tfIdFilme.setVisible(false);
        tfIdCliente.setVisible(false);
        tfIdSala.setVisible(false);
        tfIdSessao.setVisible(false);
        tfIdIngresso.setVisible(false);
        
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
    }
    
    private Boolean existeDadosTemporarios(){        
        try{
////            if(DadosTemporarios.temObject instanceof ModCompra){
//    //            int id = ((ModCompra) DadosTemporarios.temObject).getId();
//    //            Double preco = ((ModCompra) DadosTemporarios.temObject).getPreco();
//    //            String horario = ((ModCompra) DadosTemporarios.temObject).getHorario();
//    //            String cliente = DadosTemporarios.clienteCompraBilheteria;
//                String filme = DadosTemporarios.filmeCompraBilheteria;
//                
//                String sala = DadosTemporarios.salaCompraBilheteria;
//                String sessao = DadosTemporarios.sessaoCompraBilheteria;
//    //            String ingresso = DadosTemporarios.ingressoCompraBilheteria;
//                int idCliente = DadosTemporarios.idUsuarioLogado;
//
//                int proximoId = new DaoCompra().buscarProximoId();
//
//                ResultSet resultSet = new DaoFilme().listarPorNome(filme);
//                resultSet.next();
//                int idFilme = resultSet.getInt("ID");
//                tfIdFilme.setText(String.valueOf(idFilme));
//                
////                tfIdSala.setText(String.valueOf(idSala));
////                tfIdCliente.setText(String.valueOf(idCliente));
////                tfIdSessao.setText(String.valueOf(idSessao));
////                tfIdIngresso.setText(String.valueOf(idIngresso));
//
////                labelNomeFilme.setText(filme);
//    //            labelPreco.setText(String.valueOf(preco));
//                labelSala.setText(sala);
//                labelSessao.setText(sessao);
//
//                DadosTemporarios.temObjectFilme = null;
//                DadosTemporarios.filmeCompraBilheteria = null;
//                DadosTemporarios.salaCompraBilheteria = null;
//                DadosTemporarios.sessaoCompraBilheteria = null;

                labelNomeFilme.setText(((ModFilme) DadosTemporarios.temObjectFilme).getNome());
                labelNomeSala.setText(((ModSala) DadosTemporarios.tempObjectSala).getNome());
                labelSessaoHorario.setText(((ModSessao) DadosTemporarios.tempObjectSessao).getHorario());
                
                return true;
//            }else
//                return false;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    private void calculaTotalCompra(Double preco, int quantidade){
        try{
            Double total = preco * quantidade;

            labelTotalCompra.setText(String.valueOf(total));
        }catch(Exception e){}
    }
    
    private void adicionaUnidade(){
        int qtdeAtual = Integer.parseInt(labelQuantidadeAtual.getText());
        
        qtdeAtual++;
        
        labelQuantidadeAtual.setText(String.valueOf(qtdeAtual));
        labelQuantidadeCompra.setText(String.valueOf(qtdeAtual));
        
        calculaTotalCompra(Double.parseDouble(labelPreco.getText()), qtdeAtual);
    }
    
    private void diminuirUnidade() {
        int qtdeAtual = Integer.parseInt(labelQuantidadeAtual.getText());
        
        if(qtdeAtual > 1){
            qtdeAtual--;

            labelQuantidadeAtual.setText(String.valueOf(qtdeAtual));
            labelQuantidadeCompra.setText(String.valueOf(qtdeAtual));
        
            calculaTotalCompra(Double.parseDouble(labelPreco.getText()), qtdeAtual);
        }
    }
    
    public void carregarTiposIngressos(){
        try{
            DaoIngresso daoIngresso = new DaoIngresso();

            ResultSet resultSet = daoIngresso.listarTodos();

            while(resultSet.next())
                jcbTipoDeIngresso.addItem(resultSet.getString("TIPO"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void recuperaIdTipoIngresso(){
        try{
            DaoIngresso daoIngresso = new DaoIngresso();
            ResultSet resultSet = daoIngresso.listarPorTipo(jcbTipoDeIngresso.getSelectedItem().toString());
            
            resultSet.next();
            tfIdIngresso.setText(resultSet.getString("ID"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void recuperaPrecoTipoIngresso(){
        try{
            DaoIngresso daoIngresso = new DaoIngresso();
            ResultSet resultSet = daoIngresso.listarPorTipo(jcbTipoDeIngresso.getSelectedItem().toString());
            
            resultSet.next();
            labelPreco.setText(resultSet.getString("PRECO"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelTotalCompra = new javax.swing.JLabel();
        labelQuantidadeCompra = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnComprar = new javax.swing.JButton();
        tfIdCliente = new javax.swing.JTextField();
        tfIdIngresso = new javax.swing.JTextField();
        tfIdSessao = new javax.swing.JTextField();
        labelSala = new javax.swing.JLabel();
        jcbTipoDeIngresso = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        labelSessaoHorario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        labelQuantidadeAtual = new javax.swing.JLabel();
        labelSessao = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        tfIdSala = new javax.swing.JTextField();
        tfIdCompra = new javax.swing.JTextField();
        tfIdFilme = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        labelNomeFilme = new javax.swing.JLabel();
        labelNomeSala = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BILHETERIA");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel2.setText("Filme");

        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel3.setText("Tipo de ingresso");

        jLabel5.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel5.setText("Horário");

        jLabel7.setFont(new java.awt.Font("Sitka Display", 1, 36)); // NOI18N
        jLabel7.setText("Total da Compra");

        jLabel8.setFont(new java.awt.Font("Sitka Display", 1, 36)); // NOI18N
        jLabel8.setText("Quantidade");

        labelTotalCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTotalCompra.setText("TotalCompra");

        labelQuantidadeCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelQuantidadeCompra.setText("1");

        btnComprar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        tfIdCliente.setText("IdCliente");

        tfIdIngresso.setText("idIngresso");

        tfIdSessao.setText("idSessao");

        labelSala.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        labelSala.setText("Sala");

        jcbTipoDeIngresso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTipoDeIngressoItemStateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel12.setText("Preço");

        labelPreco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPreco.setText("20");

        labelSessaoHorario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSessaoHorario.setText("sessaoHorário");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        labelQuantidadeAtual.setText("1");

        labelSessao.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        labelSessao.setText("Sessão");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "19:00", "21:00" }));

        tfIdSala.setText("idSala");

        tfIdCompra.setText("idCompra");

        tfIdFilme.setText("idFilme");

        labelNomeFilme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelNomeFilme.setText("nomeFilme");

        labelNomeSala.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelNomeSala.setText("nomeSala");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(labelSessaoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSala)
                            .addComponent(jLabel12)
                            .addComponent(labelPreco)
                            .addComponent(labelSessao)
                            .addComponent(labelTotalCompra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelQuantidadeCompra)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(labelNomeFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addComponent(tfIdFilme)))
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcbTipoDeIngresso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelNomeSala, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfIdSala, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfIdIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfIdSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(61, 61, 61)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfIdCompra)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addComponent(labelQuantidadeAtual)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfIdCliente)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addComponent(jSeparator2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(labelQuantidadeAtual))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIdFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNomeFilme))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbTipoDeIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfIdIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(labelSala)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIdSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeSala))
                .addGap(18, 18, 18)
                .addComponent(labelSessao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSessaoHorario)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPreco)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotalCompra)
                    .addComponent(labelQuantidadeCompra))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        try{    
            DaoCompra daoCompra = new DaoCompra();
            
            int id = Integer.parseInt(tfIdCompra.getText());
            int idCliente = Integer.parseInt(tfIdCliente.getText());
            int idFilme = Integer.parseInt(tfIdFilme.getText());
            int idSala = Integer.parseInt(tfIdSala.getText());
            int idSessao = Integer.parseInt(tfIdSessao.getText());
            int idIngresso = Integer.parseInt(tfIdIngresso.getText());
//            String horario = Integer.parseInt(labelSessaoHorario.getText());
//            String tipodeingresso = 
//            String preco =        
            
//            daoCompra.inserir(id, idCliente, idFilme, idSala, idSessao, idIngresso, horario, tipodeingresso, preco);
            
            JOptionPane.showMessageDialog(null, "Obrigado, " + DadosTemporarios.usuarioLogado + ", pela sua compra, seu ingresso foi comprado exitosamente!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Houve um problema ao tentar salvar a compra!");
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Formularios.telaBilheteria = null;
    }//GEN-LAST:event_formWindowClosed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        adicionaUnidade();
        calculaTotalCompra(Double.parseDouble(labelPreco.getText()), Integer.parseInt(labelQuantidadeCompra.getText()));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        diminuirUnidade();
        calculaTotalCompra(Double.parseDouble(labelPreco.getText()), Integer.parseInt(labelQuantidadeCompra.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbTipoDeIngressoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTipoDeIngressoItemStateChanged
        recuperaIdTipoIngresso();
        recuperaPrecoTipoIngresso();
        
        calculaTotalCompra(Double.parseDouble(labelPreco.getText()), Integer.parseInt(labelQuantidadeCompra.getText()));
        
    }//GEN-LAST:event_jcbTipoDeIngressoItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaBilheteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBilheteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBilheteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBilheteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBilheteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcbTipoDeIngresso;
    private javax.swing.JLabel labelNomeFilme;
    private javax.swing.JLabel labelNomeSala;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQuantidadeAtual;
    private javax.swing.JLabel labelQuantidadeCompra;
    private javax.swing.JLabel labelSala;
    private javax.swing.JLabel labelSessao;
    private javax.swing.JLabel labelSessaoHorario;
    private javax.swing.JLabel labelTotalCompra;
    private javax.swing.JTextField tfIdCliente;
    private javax.swing.JTextField tfIdCompra;
    private javax.swing.JTextField tfIdFilme;
    private javax.swing.JTextField tfIdIngresso;
    private javax.swing.JTextField tfIdSala;
    private javax.swing.JTextField tfIdSessao;
    // End of variables declaration//GEN-END:variables
}
