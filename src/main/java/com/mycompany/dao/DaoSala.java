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
public class DaoSala extends BancoDeDadosMySql{
    private String sql;
    
    public Boolean inserir(int id, int idCinema, String nome, String descricao, String quantidadedeassentos){
        try{
            sql = "INSERT INTO SALA (ID, ID_CINEMA, NOME, DESCRICAO, QUANTIDADE DE ASSENTOS) VALUES (?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, idCinema);
            getStatement().setString(3, nome);
            getStatement().setString(4, descricao);
            getStatement().setString(5, quantidadedeassentos);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, int idCinema, String nome, String descricao, String quantidadedeassentos){
        try{
            sql = "UPDATE SALA SET ID_CINEMA = ?, NOME = ?, DESCRICAO = ?, QUANTIDADE DE ASSENTOS = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(5, id);
            getStatement().setInt(1, idCinema);
            getStatement().setString(2, nome);
            getStatement().setString(3, descricao);
            getStatement().setString(4, quantidadedeassentos);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM SALA WHERE ID = ?";
            
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
                "  SELECT                                   " +
                "   SAL.ID,                                 " +
                "   NOM.NOME AS NOME                        " +    
                "   DES.NOME AS DESCRIÇÃO                   " +
                "   QUA.NOME AS QUANTIDADE DE ASSENTOS      " +  
                " FROM                                      " +
                "   SALA S                                  " +
                "   JOIN CINEMA CIN ON                      " +
                "   CIN.ID = SAL.ID_CINEMA                  " ;
            
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
                "  SELECT                                   " +
                "   SAL.ID,                                 " +
                "   NOM.NOME AS NOME                        " +    
                "   DES.NOME AS DESCRIÇÃO                   " +
                "   QUA.NOME AS QUANTIDADE DE ASSENTOS      " +  
                " FROM                                      " +
                "   SALA S                                  " +
                "   JOIN CINEMA CIN ON                      " +
                "   CIN.ID = SAL.ID_CINEMA                  " +
                " WHERE ID = ?                              " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorCinema(int idCinema){
        try{
            sql = 
                "  SELECT                                   " +
                "   SAL.ID,                                 " +
                "   NOM.NOME AS NOME                        " +    
                "   DES.NOME AS DESCRIÇÃO                   " +
                "   QUA.NOME AS QUANTIDADE DE ASSENTOS      " +  
                " FROM                                      " +
                "   SALA S                                  " +
                "   JOIN CINEMA CIN ON                      " +
                "   CIN.ID = SAL.ID_CINEMA                  " +
                " WHERE CIN.NOME LIKE ?                     " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(2, idCinema + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }     
    
    public ResultSet listarPorNome(String nome){
        try{
            sql = 
                "  SELECT                                   " +
                "   SAL.ID,                                 " +
                "   NOM.NOME AS NOME                        " +    
                "   DES.NOME AS DESCRIÇÃO                   " +
                "   QUA.NOME AS QUANTIDADE DE ASSENTOS      " +  
                " FROM                                      " +
                "   SALA S                                  " +
                "   JOIN CINEMA CIN ON                      " +
                "   CIN.ID = SAL.ID_CINEMA                  " +
                " WHERE NOM.NOME LIKE ?                     " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(3, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorDescricao(String descricao){
        try{
            sql = 
                "  SELECT                                   " +
                "   SAL.ID,                                 " +
                "   NOM.NOME AS NOME                        " +    
                "   DES.NOME AS DESCRIÇÃO                   " +
                "   QUA.NOME AS QUANTIDADE DE ASSENTOS      " +  
                " FROM                                      " +
                "   SALA S                                  " +
                "   JOIN CINEMA CIN ON                      " +
                "   CIN.ID = SAL.ID_CINEMA                  " +
                " WHERE DES.NOME LIKE ?                     " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(4, descricao + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorQuantidadeDeAssentos(String quantidadedeassentos){
        try{
            sql = 
                "  SELECT                                   " +
                "   SAL.ID,                                 " +
                "   NOM.NOME AS NOME                        " +    
                "   DES.NOME AS DESCRIÇÃO                   " +
                "   QUA.NOME AS QUANTIDADE DE ASSENTOS      " +  
                " FROM                                      " +
                "   SALA S                                  " +
                "   JOIN CINEMA CIN ON                      " +
                "   CIN.ID = SAL.ID_CINEMA                  " +
                " WHERE QUA.NOME LIKE ?                     " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(5, quantidadedeassentos + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM SALA";
            
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