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
public class DaoFilme extends BancoDeDadosMySql{
    private String sql;
    
    public Boolean inserir(int id, int idGenero, String nome, String sinopse, String diretor, String datadelancamento, String duracao, String classificacao){
        try{
            sql = "INSERT INTO FILME (ID, ID_GENERO, NOME, SINOPSE, DIRETOR, DATADELANÇAMENTO, DURAÇAO, CLASSIFICAÇÃO) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, idGenero);
            getStatement().setString(3, nome);
            getStatement().setString(4, sinopse);
            getStatement().setString(5, diretor);
            getStatement().setString(6, datadelancamento);
            getStatement().setString(7, duracao);
            getStatement().setString(8, classificacao);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, int idGenero, String nome, String sinopse, String diretor, String datadelancamento, String duracao, String classificacao){
        try{
            sql = "UPDATE FILME SET ID_CATEGORIA = ?, NOME = ?, SINOPSE = ?, DIRETOR = ?, DATA DE LANÇAMENTO = ?, DURAÇÃO = ?, CLASSIFICAÇÃO = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(8, id);
            getStatement().setInt(1, idGenero);
            getStatement().setString(2, nome);
            getStatement().setString(3, sinopse);
            getStatement().setString(4, diretor);
            getStatement().setString(5, datadelancamento);
            getStatement().setString(6, duracao);
            getStatement().setString(7, classificacao);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM FILME WHERE ID = ?";
            
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
                "  SELECT                          " +
                "   FIL.ID,                        " +
                "   GEN.NOME AS GENERO,            " +    
                "   NOM.NOME AS NOME               " +
                "   SIP. NOME AS SINOPSE           " +
                "   DIR.NOME AS DIRETOR            " +
                "   DAT.NOME AS DATADELANÇAMENTO   " + 
                "   DUR. NOME AS DURAÇÃO           " + 
                "   CLA. NOME AS CLASSIFICAÇÃO     " +   
                " FROM                             " +
                "   FILME F                        " +
                "   JOIN GENERO GEN ON             " +
                "   GEN.ID = FIL.ID_GENERO         " ;
            
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
                "  SELECT                          " +
                "   FIL.ID,                        " +
                "   GEN.NOME AS GENERO,            " +    
                "   NOM.NOME AS NOME               " +
                "   SIP. NOME AS SINOPSE           " +
                "   DIR.NOME AS DIRETOR            " +
                "   DAT.NOME AS DATADELANÇAMENTO   " + 
                "   DUR. NOME AS DURAÇÃO           " + 
                "   CLA. NOME AS CLASSIFICAÇÃO     " +   
                " FROM                             " +
                "   FILME F                        " +
                "   JOIN GENERO GEN ON             " +
                "   GEN.ID = FIL.ID_GENERO         " +
                " WHERE ID = ?                     " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorIdGenero(int idGenero){
        try{
            sql = 
                "  SELECT                          " +
                "   FIL.ID,                        " +
                "   GEN.NOME AS GENERO             " +    
                "   NOM.NOME AS NOME               " +
                "   SIP. NOME AS SINOPSE           " +
                "   DIR.NOME AS DIRETOR            " +
                "   DAT.NOME AS DATADELANÇAMENTO   " + 
                "   DUR. NOME AS DURAÇÃO           " + 
                "   CLA. NOME AS CLASSIFICAÇÃO     " +   
                " FROM                             " +
                "   FILME F                        " +
                "   JOIN GENERO GEN ON             " +
                "   GEN.ID = FIL.ID_GENERO         " +
                " WHERE GEN.NOME = ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(2, idGenero);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNome(String nome){
        try{
            sql = 
                "  SELECT                          " +
                "   FIL.ID,                        " +
                "   GEN.NOME AS GENERO             " +    
                "   NOM.NOME AS NOME               " +
                "   SIP.NOME AS SINOPSE            " +
                "   DIR.NOME AS DIRETOR            " +
                "   DAT.NOME AS DATADELANÇAMENTO   " + 
                "   DUR.NOME AS DURAÇÃO            " + 
                "   CLA.NOME AS CLASSIFICAÇÃO      " +   
                " FROM                             " +
                "   FILME F                        " +
                "   JOIN GENERO GEN ON             " +
                "   GEN.ID = FIL.ID_GENERO         " +
                " WHERE NOME LIKE ?                " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(3, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorSinopse(String sinopse){
        try{
            sql = 
                "  SELECT                          " +
                "   FIL.ID,                        " +
                "   GEN.NOME AS GENERO             " +    
                "   NOM.NOME AS NOME               " +
                "   SIP. NOME AS SINOPSE           " +
                "   DIR.NOME AS DIRETOR            " +
                "   DAT.NOME AS DATADELANÇAMENTO   " + 
                "   DUR. NOME AS DURAÇÃO           " + 
                "   CLA. NOME AS CLASSIFICAÇÃO     " +   
                " FROM                             " +
                "   FILME F                        " +
                "   JOIN GENERO GEN ON             " +
                "   GEN.ID = FIL.ID_GENERO         " +
                " WHERE SIP.NOME LIKE ?            " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(4, sinopse + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorDiretor(String diretor){
        try{
            sql = 
                "  SELECT                          " +
                "   FIL.ID,                        " +
                "   GEN.NOME AS GENERO             " +    
                "   NOM.NOME AS NOME               " +
                "   SIP. NOME AS SINOPSE           " +
                "   DIR.NOME AS DIRETOR            " +
                "   DAT.NOME AS DATADELANÇAMENTO   " + 
                "   DUR. NOME AS DURAÇÃO           " + 
                "   CLA. NOME AS CLASSIFICAÇÃO     " +   
                " FROM                             " +
                "   FILME F                        " +
                "   JOIN GENERO GEN ON             " +
                "   GEN.ID = FIL.ID_GENERO         " +
                " WHERE DIR.NOME LIKE ?            " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(5, diretor + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorDataDeLancamento(String datadelancamento){
        try{
            sql = 
                "  SELECT                          " +
                "   FIL.ID,                        " +
                "   GEN.NOME AS GENERO             " +    
                "   NOM.NOME AS NOME               " +
                "   SIP. NOME AS SINOPSE           " +
                "   DIR.NOME AS DIRETOR            " +
                "   DAT.NOME AS DATADELANÇAMENTO   " + 
                "   DUR. NOME AS DURAÇÃO           " + 
                "   CLA. NOME AS CLASSIFICAÇÃO     " +   
                " FROM                             " +
                "   FILME F                        " +
                "   JOIN GENERO GEN ON             " +
                "   GEN.ID = FIL.ID_GENERO         " +
                " WHERE DAT.NOME LIKE ?            " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(6, datadelancamento + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorDuracao(String duracao){
        try{
            sql = 
                "  SELECT                          " +
                "   FIL.ID,                        " +
                "   GEN.NOME AS GENERO             " +    
                "   NOM.NOME AS NOME               " +
                "   SIP. NOME AS SINOPSE           " +
                "   DIR.NOME AS DIRETOR            " +
                "   DAT.NOME AS DATADELANÇAMENTO   " + 
                "   DUR. NOME AS DURAÇÃO           " + 
                "   CLA. NOME AS CLASSIFICAÇÃO     " +   
                " FROM                             " +
                "   FILME F                        " +
                "   JOIN GENERO GEN ON             " +
                "   GEN.ID = FIL.ID_GENERO         " +
                " WHERE DUR.NOME LIKE ?            " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(7, duracao + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorClassificacao(String classificacao){
        try{
            sql = 
                "  SELECT                          " +
                "   FIL.ID,                        " +
                "   GEN.NOME AS GENERO             " +    
                "   NOM.NOME AS NOME               " +
                "   SIP. NOME AS SINOPSE           " +
                "   DIR.NOME AS DIRETOR            " +
                "   DAT.NOME AS DATADELANÇAMENTO   " + 
                "   DUR. NOME AS DURAÇÃO           " + 
                "   CLA. NOME AS CLASSIFICAÇÃO     " +   
                " FROM                             " +
                "   FILME F                        " +
                "   JOIN GENERO GEN ON             " +
                "   GEN.ID = FIL.ID_GENERO         " +
                " WHERE CLA.NOME LIKE ?            " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(8, classificacao + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM FILME";
            
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
