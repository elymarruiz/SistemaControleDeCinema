/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.ferramentas.BancoDeDadosMySql;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getConexao;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getResultado;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getStatement;
import static com.mycompany.ferramentas.BancoDeDadosMySql.setResultado;
import static com.mycompany.ferramentas.BancoDeDadosMySql.setStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elymar.8221
 */
public class DaoIngresso extends BancoDeDadosMySql{
    private String sql;
    
    public Boolean inserir(int id, String regular, String meiaentrada , String crianca, String idoso, Double preco){
        try{
            sql = "INSERT INTO INGRESSO (ID, REGULAR, MEIAENTRADA, CRIANÇA, IDOSO, PREÇO) VALUES (?, ?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setString(2, regular);
            getStatement().setString(3, meiaentrada);
            getStatement().setString(4, crianca);
            getStatement().setString(5, idoso);
            getStatement().setDouble(6, preco);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, String regular, String meiaentrada , String crianca, String idoso, Double preco){
        try{
            sql = "UPDATE INGRESSO SET REGULAR = ?, MEIA ENTRADA = ?, CRIANÇA = ?, IDOSO = ?, PREÇO = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(6, id);
            getStatement().setString(1, regular);
            getStatement().setString(2, meiaentrada);
            getStatement().setString(3, crianca);
            getStatement().setString(4, idoso);
            getStatement().setDouble(6, preco);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM INGRESSO WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public ResultSet listarTodos(){
        try{
            sql = 
                " SELECT                              " +
                "   I.ID AS ID,                       " +
                "   I.NOME AS TIPO,                   " +
                "   I.PRECO_INGRESSO AS PRECO         " +
                " FROM                                " +
                "   INGRESSOS I                       " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    public ResultSet listarPorId(int id){
        try{
            sql = 
                " SELECT                              " +
                "   I.ID AS ID,                       " +
                "   REG.NOME AS REGULAR               " +
                "   MEI.NOME AS MEIAENTRADA,          " +
                "   CRI.NOME AS CRIANÇA               " +
                "   IDO.NOME AS IDOSO                 " +
                "   PRE.PREÇO AS PREÇO                " +
                " FROM                                " +
                "   INGRESSO I                        " +
                " JOIN INGRESSO I ON                  " +
                "   I.ID = I.ID_INGRESSO              " +
                " WHERE                               " +
                "   I.ID = ?                          " ;
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorTipo(String tipo){
        try{
            sql = 
                " SELECT                              " +
                "   I.ID AS ID,                       " +
                "   I.NOME AS TIPO,                   " +
                "   I.PRECO_INGRESSO AS PRECO         " +
                " FROM                                " +
                "   INGRESSOS I                       " +
                " WHERE I.NOME LIKE ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, tipo + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorIngressoMeiaEntrada(String meiaentrada){
        try{
            sql = 
                " SELECT                              " +
                "   I.ID AS ID,                       " +
                "   REG.NOME AS REGULAR               " +
                "   MEI.NOME AS MEIAENTRADA,          " +
                "   CRI.NOME AS CRIANÇA               " +
                "   IDO.NOME AS IDOSO                 " +
                "   PRE.PREÇO AS PREÇO                " +
                " FROM                                " +
                "   INGRESSO I                        " +
                " JOIN INGRESSO I ON                  " +
                "   I.ID = I.ID_INGRESSO              " +
                " WHERE                               " +
                "   MEI.NOME LIKE ?                   " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(3, meiaentrada + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorIngressoCrianca(String crianca){
        try{
            sql = 
                " SELECT                              " +
                "   I.ID AS ID,                       " +
                "   REG.NOME AS REGULAR               " +
                "   MEI.NOME AS MEIAENTRADA,          " +
                "   CRI.NOME AS CRIANÇA               " +
                "   IDO.NOME AS IDOSO                 " +
                "   PRE.PREÇO AS PREÇO                " +
                " FROM                                " +
                "   INGRESSO I                        " +
                " JOIN INGRESSO I ON                  " +
                "   I.ID = I.ID_INGRESSO              " +
                " WHERE                               " +
                "   CRI.NOME LIKE ?                   " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(4, crianca + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorIngressoIdoso(String idoso){
        try{
            sql = 
                " SELECT                              " +
                "   I.ID AS ID,                       " +
                "   REG.NOME AS REGULAR               " +
                "   MEI.NOME AS MEIAENTRADA,          " +
                "   CRI.NOME AS CRIANÇA               " +
                "   IDO.NOME AS IDOSO                 " +
                "   PRE.PREÇO AS PREÇO                " +
                " FROM                                " +
                "   INGRESSO I                        " +
                " JOIN INGRESSO I ON                  " +
                "   I.ID = I.ID_INGRESSO              " +
                " WHERE                               " +
                "   IDO.NOME LIKE ?                   " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(5, idoso + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPrecoMaiorQue(Double preco){
        try{
            sql = 
                " SELECT                              " +
                "   I.ID AS ID,                       " +
                "   REG.NOME AS REGULAR               " +
                "   MEI.NOME AS MEIAENTRADA,          " +
                "   CRI.NOME AS CRIANÇA               " +
                "   IDO.NOME AS IDOSO                 " +
                "   PRE.PREÇO AS PREÇO                " +
                " FROM                                " +
                "   INGRESSO I                        " +
                " JOIN INGRESSO I ON                  " +
                "   I.ID = I.ID_INGRESSO              " +
                " WHERE                               " +
                "   I.PREÇO > ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(6, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPrecoMenorQue(Double preco){
        try{
            sql = 
                " SELECT                              " +
                "   I.ID AS ID,                       " +
                "   REG.NOME AS REGULAR               " +
                "   MEI.NOME AS MEIAENTRADA,          " +
                "   CRI.NOME AS CRIANÇA               " +
                "   IDO.NOME AS IDOSO                 " +
                "   PRE.PREÇO AS PREÇO                " +
                " FROM                                " +
                "   INGRESSO I                        " +
                " JOIN INGRESSO I ON                  " +
                "   I.ID = I.ID_INGRESSO              " +
                " WHERE                               " +
                "   I.PREÇO < ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(6, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPrecoIgualA(Double preco){
        try{
            sql = 
                " SELECT                              " +
                "   I.ID AS ID,                       " +
                "   REG.NOME AS REGULAR               " +
                "   MEI.NOME AS MEIAENTRADA,          " +
                "   CRI.NOME AS CRIANÇA               " +
                "   IDO.NOME AS IDOSO                 " +
                "   PRE.PREÇO AS PREÇO                " +
                " FROM                                " +
                "   INGRESSO I                        " +
                " JOIN INGRESSO I ON                  " +
                "   I.ID = I.ID_INGRESSO              " +
                "   I.PREÇO = ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(6, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = 0;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM INGRESSO";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
            getResultado().next(); //Move para o primeiro registro.
            
            id = getResultado().getInt(1); //Pega o valor retornado na consulta
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return id;
    }
}
