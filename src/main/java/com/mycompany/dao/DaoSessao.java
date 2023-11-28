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
public class DaoSessao extends BancoDeDadosMySql{
    private String sql;
    
    public Boolean inserir(int id, int idSala, int idFilme, String data, String horario, String status){
        try{
            sql = "INSERT INTO SESSAO (ID, ID_SALA, ID_FILME, DATA, HORARIO, STATUS) VALUES (?, ?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, idSala);
            getStatement().setInt(3, idFilme);         
            getStatement().setString(4, data);
            getStatement().setString(5, horario);
            getStatement().setString(6, status);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, int idSala, int idFilme, String data, String horario, String status){
        try{
            sql = "UPDATE SESSAO SET ID_SALA = ?, ID_FILME = ?, DATA = ?, HORARIO = ?, STATUS = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(6, id);
            getStatement().setInt(1, idSala);
            getStatement().setInt(2, idFilme);
            getStatement().setString(3, data);
            getStatement().setString(4, horario);
            getStatement().setString(5, status);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM SESSAO WHERE ID = ?";
            
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
                "   SES.ID,                                 " +
                "   DAT.NOME AS DATA                        " +    
                "   HOR.NOME AS HORARIO                     " +
                "   STA.NOME AS STATUS                      " +  
                " FROM                                      " +
                "   SESSAO S                                " +
                "   JOIN SALA SAL ON                        " +
                "   SAL.ID = SES.ID_SALA                    " +
                "   JOIN FILME FIL ON                       " +
                "   FIL.ID = SES.ID_FILME                   " ;
            
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
                "   SES.ID,                                 " +
                "   DAT.NOME AS DATA                        " +    
                "   HOR.NOME AS HORARIO                     " +
                "   STA.NOME AS STATUS                      " +  
                " FROM                                      " +
                "   SESSAO S                                " +
                "   JOIN SALA SAL ON                        " +
                "   SAL.ID = SES.ID_SALA                    " +
                "   JOIN FILME FIL ON                       " +
                "   FIL.ID = SES.ID_FILME                   " +
                " WHERE ID = ?                              " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorSala(int idSala){
        try{
            sql = 
                "  SELECT                                   " +
                "   SES.ID,                                 " +
                "   DAT.NOME AS DATA                        " +    
                "   HOR.NOME AS HORARIO                     " +
                "   STA.NOME AS STATUS                      " +  
                " FROM                                      " +
                "   SESSAO S                                " +
                "   JOIN SALA SAL ON                        " +
                "   SAL.ID = SES.ID_SALA                    " +
                "   JOIN FILME FIL ON                       " +
                "   FIL.ID = SES.ID_FILME                   " +
                " WHERE SAL LIKE ?                     " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(2, idSala);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }     
    
    public ResultSet listarPorFilme(int idFilme){
        try{
            sql = 
                "  SELECT                                   " +
                "   SES.ID,                                 " +
                "   DAT.NOME AS DATA                        " +    
                "   HOR.NOME AS HORARIO                     " +
                "   STA.NOME AS STATUS                      " +  
                " FROM                                      " +
                "   SESSAO S                                " +
                "   JOIN SALA SAL ON                        " +
                "   SAL.ID = SES.ID_SALA                    " +
                "   JOIN FILME FIL ON                       " +
                "   FIL.ID = SES.ID_FILME                   " +
                " WHERE FIL LIKE ?                          " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(3, idFilme);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }     
    
    public ResultSet listarPorData(String data){
        try{
            sql = 
                "  SELECT                                   " +
                "   SES.ID,                                 " +
                "   DAT.NOME AS DATA                        " +    
                "   HOR.NOME AS HORARIO                     " +
                "   STA.NOME AS STATUS                      " +  
                " FROM                                      " +
                "   SESSAO S                                " +
                "   JOIN SALA SAL ON                        " +
                "   SAL.ID = SES.ID_SALA                    " +
                "   JOIN FILME FIL ON                       " +
                "   FIL.ID = SES.ID_FILME                   " +
                " WHERE DAT.NOME LIKE ?                     " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(4, data + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorHorario(String horario){
        try{
            sql = 
                "  SELECT                                   " +
                "   SES.ID,                                 " +
                "   DAT.NOME AS DATA                        " +    
                "   HOR.NOME AS HORARIO                     " +
                "   STA.NOME AS STATUS                      " +  
                " FROM                                      " +
                "   SESSAO S                                " +
                "   JOIN SALA SAL ON                        " +
                "   SAL.ID = SES.ID_SALA                    " +
                "   JOIN FILME FIL ON                       " +
                "   FIL.ID = SES.ID_FILME                   " +
                " WHERE HOR.NOME LIKE ?                     " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(5, horario + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorStatus(String status){
        try{
            sql = 
                "  SELECT                                   " +
                "   SES.ID,                                 " +
                "   DAT.NOME AS DATA                        " +    
                "   HOR.NOME AS HORARIO                     " +
                "   STA.NOME AS STATUS                      " +  
                " FROM                                      " +
                "   SESSAO S                                " +
                "   JOIN SALA SAL ON                        " +
                "   SAL.ID = SES.ID_SALA                    " +
                "   JOIN FILME FIL ON                       " +
                "   FIL.ID = SES.ID_FILME                   " +
                " WHERE STA.NOME LIKE ?                     " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(6, status + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM SESSAO";
            
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
