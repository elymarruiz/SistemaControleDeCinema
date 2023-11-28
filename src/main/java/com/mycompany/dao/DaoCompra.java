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
public class DaoCompra extends BancoDeDadosMySql{
    private String sql;
    
    public Boolean inserir(int id, int idCliente, int idFilme, int idSala, int idSessao, int idIngresso, String horario, String tipodeingresso, Double preco){
        try{
            sql = "INSERT INTO COMPRA (ID, ID_CLIENTE, ID_FILME, ID_SALA, ID_SESSAO, ID_INGRESSO, HORARIO, TIPO DE INGRESSO, PRECO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, idCliente);
            getStatement().setInt(3, idFilme);
            getStatement().setInt(4, idSala);
            getStatement().setInt(5, idSessao);
            getStatement().setInt(6, idIngresso);
            getStatement().setString(7, horario);
            getStatement().setString(8, tipodeingresso);
            getStatement().setDouble(9, preco);
            
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
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS CLIENTE,              " +
                "   F.NOME AS FILME,                " +
                "   S.NOME AS SALA,                 " +
                "   S.NOME AS SESSAO,               " +
                "   H.NOME AS HORARIO,              " +
                "   T.NOME AS TIPODEINGRESSO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   FILME F ON                      " +
                " JOIN FILME F ON                  " +
                "   F.ID = C.ID_FILME               " +  
                " JOIN SALA S ON                    " +
                "    S.ID = C.ID_SALA               " +
                " JOIN SESSAO S ON                  " +
                "   S.ID = C.ID_SESSAO              " +
                " JOIN INGRESSOS I ON               " +
                "   I.ID = C.ID_INGRESSO            " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarSessoes(){
        try{
            sql = 
                "   select                          " +
                "	ses.id as id,               " +
                "	sal.nome as sala,           " +
                "	fil.nome as filme,          " +
                "	ses.data as data,           " +
                "	ses.horario as horario      " +
                "   from                            " +
                "	sessao ses                  " +
                "   join filme fil on               " +
                "	fil.id = ses.id_filme       " +
                "   join salas sal on               " +
                "	sal.id = ses.id_salas       " +
                "   where                           " +
                "	ses.status = 'Ativa'        ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarSessoesPorId(int id){
        try{
            sql = 
                "   select                          " +
                "	ses.id as id,               " +
                "	sal.nome as sala,           " +
                "	fil.nome as filme,          " +
                "	ses.data as data,           " +
                "	ses.horario as horario      " +
                "   from                            " +
                "	sessao ses                  " +
                "   join filme fil on               " +
                "	fil.id = ses.id_filme       " +
                "   join salas sal on               " +
                "	sal.id = ses.id_salas       " +
                "   where                           " +
                "	ses.id = ?                  " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorId(int id){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS CLIENTE               " +
                "   F.NOME AS FILME                 " +
                "   S.NOME AS SALA,                 " +
                "   S.NOME AS SESSAO,               " +
                "   H.NOME AS HORARIO,              " +
                "   T.NOME AS TIPODEINGRESSO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   FILME F ON                      " +
                " JOIN FILME F ON                   " +
                "   F.ID = C.ID_FILME               " +  
                " JOIN SALA S ON                    " +
                "    S.ID = C.ID_SALA               " +
                " JOIN SESSAO S ON                  " +
                "   S.ID = C.ID_SESSAO              " +
                " JOIN INGRESSOS I ON               " +
                "   I.ID = C.ID_INGRESSO            " +
                " WHERE C.ID = ?                    " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorCliente(String cliente){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS CLIENTE,              " +
                "   F.NOME AS FILME,                " +
                "   S.NOME AS SALA,                 " +
                "   S.NOME AS SESSAO,               " +
                "   H.NOME AS HORARIO,              " +
                "   T.NOME AS TIPODEINGRESSO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   FILME F ON                      " +
                " JOIN FILME F ON                   " +
                "   F.ID = C.ID_FILME               " +  
                " JOIN SALA S ON                    " +
                "    S.ID = C.ID_SALA               " +
                " JOIN SESSAO S ON                  " +
                "   S.ID = C.ID_SESSAO              " +
                " JOIN INGRESSOS I ON               " +
                "   I.ID = C.ID_INGRESSO            " +
                " WHERE C.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, cliente + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorFilme(String filme){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS CLIENTE               " +
                "   F.NOME AS FILME                 " +
                "   S.NOME AS SALA,                 " +
                "   S.NOME AS SESSAO,               " +
                "   H.NOME AS HORARIO,              " +
                "   T.NOME AS TIPODEINGRESSO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   FILME F ON                      " +
                " JOIN FILME F ON                   " +
                "   F.ID = C.ID_FILME               " +  
                " JOIN SALA S ON                    " +
                "    S.ID = C.ID_SALA               " +
                " JOIN SESSAO S ON                  " +
                "   S.ID = C.ID_SESSAO              " +
                " JOIN INGRESSOS I ON               " +
                "   I.ID = C.ID_INGRESSO            " +
                " WHERE F.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, filme + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }     
    
    public ResultSet listarPorSala(String sala){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS CLIENTE               " +
                "   F.NOME AS FILME                 " +
                "   S.NOME AS SALA,                 " +
                "   S.NOME AS SESSAO,               " +
                "   H.NOME AS HORARIO,              " +
                "   T.NOME AS TIPODEINGRESSO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   FILME F ON                      " +
                " JOIN FILME F ON                   " +
                "   F.ID = C.ID_FILME               " +  
                " JOIN SALA S ON                    " +
                "    S.ID = C.ID_SALA               " +
                " JOIN SESSAO S ON                  " +
                "   S.ID = C.ID_SESSAO              " +
                " JOIN INGRESSOS I ON               " +
                "   I.ID = C.ID_INGRESSO            " +
                " WHERE S.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, sala + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }     
    
    public ResultSet listarPorSessao(String sessao){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS CLIENTE               " +
                "   F.NOME AS FILME                 " +
                "   S.NOME AS SALA,                 " +
                "   S.NOME AS SESSAO,               " +
                "   H.NOME AS HORARIO,              " +
                "   T.NOME AS TIPODEINGRESSO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   FILME F ON                      " +
                " JOIN FILME F ON                   " +
                "   F.ID = C.ID_FILME               " +  
                " JOIN SALA S ON                    " +
                "    S.ID = C.ID_SALA               " +
                " JOIN SESSAO S ON                  " +
                "   S.ID = C.ID_SESSAO              " +
                " JOIN INGRESSOS I ON               " +
                "   I.ID = C.ID_INGRESSO            " +
                " WHERE S.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, sessao + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorHorario(String horario){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS CLIENTE               " +
                "   F.NOME AS FILME                 " +
                "   S.NOME AS SALA,                 " +
                "   S.NOME AS SESSAO,               " +
                "   H.NOME AS HORARIO,              " +
                "   T.NOME AS TIPODEINGRESSO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   FILME F ON                      " +
                " JOIN FILME F ON                   " +
                "   F.ID = C.ID_FILME               " +  
                " JOIN SALA S ON                    " +
                "    S.ID = C.ID_SALA               " +
                " JOIN SESSAO S ON                  " +
                "   S.ID = C.ID_SESSAO              " +
                " JOIN INGRESSOS I ON               " +
                "   I.ID = C.ID_INGRESSO            " +
                " WHERE H.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, horario + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorTipoDeIngresso(String ingressos){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS CLIENTE               " +
                "   F.NOME AS FILME                 " +
                "   S.NOME AS SALA,                 " +
                "   S.NOME AS SESSAO,               " +
                "   H.NOME AS HORARIO,              " +
                "   T.NOME AS TIPODEINGRESSO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   FILME F ON                      " +
                " JOIN FILME F ON                   " +
                "   F.ID = C.ID_FILME               " +  
                " JOIN SALA S ON                    " +
                "    S.ID = C.ID_SALA               " +
                " JOIN SESSAO S ON                  " +
                "   S.ID = C.ID_SESSAO              " +
                " JOIN INGRESSOS I ON               " +
                "   I.ID = C.ID_INGRESSO            " +
                " WHERE I.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, ingressos + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }     
    
    public ResultSet listarPorPrecoMaiorQue(Double preco){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS CLIENTE               " +
                "   F.NOME AS FILME                 " +
                "   S.NOME AS SALA,                 " +
                "   S.NOME AS SESSAO,               " +
                "   H.NOME AS HORARIO,              " +
                "   T.NOME AS TIPODEINGRESSO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   FILME F ON                      " +
                " JOIN FILME F ON                   " +
                "   F.ID = C.ID_FILME               " +  
                " JOIN SALA S ON                    " +
                "    S.ID = C.ID_SALA               " +
                " JOIN SESSAO S ON                  " +
                "   S.ID = C.ID_SESSAO              " +
                " JOIN INGRESSOS I ON               " +
                "   I.ID = C.ID_INGRESSO            " +
                " WHERE C.PRECO > ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPrecoMenorQue(Double preco){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS CLIENTE               " +
                "   F.NOME AS FILME                 " +
                "   S.NOME AS SALA,                 " +
                "   S.NOME AS SESSAO,               " +
                "   H.NOME AS HORARIO,              " +
                "   T.NOME AS TIPODEINGRESSO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   FILME F ON                      " +
                " JOIN FILME F ON                   " +
                "   F.ID = C.ID_FILME               " +  
                " JOIN SALA S ON                    " +
                "    S.ID = C.ID_SALA               " +
                " JOIN SESSAO S ON                  " +
                "   S.ID = C.ID_SESSAO              " +
                " JOIN INGRESSOS I ON               " +
                "   I.ID = C.ID_INGRESSO            " +
                " WHERE C.PRECO < ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPrecoIgualA(Double preco){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS CLIENTE               " +
                "   F.NOME AS FILME                 " +
                "   S.NOME AS SALA,                 " +
                "   S.NOME AS SESSAO,               " +
                "   H.NOME AS HORARIO,              " +
                "   T.NOME AS TIPODEINGRESSO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   FILME F ON                      " +
                " JOIN FILME F ON                   " +
                "   F.ID = C.ID_FILME               " +  
                " JOIN SALA S ON                    " +
                "    S.ID = C.ID_SALA               " +
                " JOIN SESSAO S ON                  " +
                "   S.ID = C.ID_SESSAO              " +
                " JOIN INGRESSOS I ON               " +
                "   I.ID = C.ID_INGRESSO            " +
                " WHERE C.PRECO = ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = 0;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM COMPRA";
            
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
