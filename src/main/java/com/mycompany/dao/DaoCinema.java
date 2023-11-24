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

/**
 *
 * @author elymar.8221
 */
public class DaoCinema extends BancoDeDadosMySql{
    private String sql;
    
    public Boolean inserir(int id, int idCidade, String nome){
        try{
            sql = "INSERT INTO CINEMA (ID, ID_CIDADE, NOME) VALUES (?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, idCidade);
            getStatement().setString(3, nome);
            
            getStatement().executeUpdate();
            
            return true;           
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }  
    }
    
    public Boolean alterar(int id, int idCidade, String novoNome){
        try{
            sql = "UPDATE CINEMA SET NOME = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(3, id);
            getStatement().setInt(1, idCidade);
            getStatement().setString(2, novoNome);
            
            getStatement().executeUpdate();
            
            return true;          
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM CINEMA WHERE ID = ?";
            
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
            sql = "SELECT ID, ID_CIDADE, NOME FROM CINEMA";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();       
    }
    
    public ResultSet listarPorId(int id){
        try{
            sql = "SELECT ID, ID_CINEMA, NOME FROM CINEMA WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();    
    }
    
    public ResultSet listarPorCidade(int idCidade){
        try{
            sql = "SELECT ID, ID_CIDADE, NOME FROM CINEMA WHERE DESCRICAO LIKE ?";
            
            setStatement((getConexao().prepareStatement(sql)));
            
            getStatement().setString(2, idCidade + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNome(String nome){
        try{
            sql = "SELECT ID, ID_CIDADE, NOME FROM CINEMA WHERE NOME LIKE ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(3, nome + "%");
            
            setResultado(getStatement().executeQuery());           
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = 1;
        
        try{
            sql = "SELECT MAX(ID) + 1 FROM CINEMA";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
            getResultado().next();
            
            id = getResultado().getInt(1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return id;
    }
}
