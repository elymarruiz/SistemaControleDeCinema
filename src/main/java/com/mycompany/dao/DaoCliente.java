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
public class DaoCliente extends BancoDeDadosMySql{    
    String sql;
    
    public Boolean inserir(int id, String nome, String sobrenome, String genero, String email, String cpf, String usuario, String senha){
        try{
            sql = "INSERT INTO CLIENTE (ID, NOME, SOBRENOME, GENERO, EMAIL, CPF, USUARIO, SENHA) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setString(2, nome);
            getStatement().setString(3, sobrenome);
            getStatement().setString(4, genero);
            getStatement().setString(5, email);
            getStatement().setString(6, cpf);
            getStatement().setString(7, usuario);
            getStatement().setString(8, senha);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }    
    
    public Boolean alterar(int id, String nome, String sobrenome, String genero, String email, String cpf){
        try{
            sql = "UPDATE CLIENTE SET NOME = ?, SOBRENOME = ?, GENERO = ?, TELEFONE = ?, EMAIL = ?, CPF = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(6, id);
            getStatement().setString(1, nome);
            getStatement().setString(2, sobrenome);
            getStatement().setString(3, genero);
            getStatement().setString(4, email);
            getStatement().setString(5, cpf);
             
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterarSenha(int id, String novaSenha){
        try{
            sql = "UPDATE CLIENTE SET SENHA = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(2, id);
            getStatement().setString(1, novaSenha);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM CLIENTE WHERE ID = ?";
            
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
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS NOME,                 " +
                "   C.SOBRENOME AS SOBRENOME,       " +
                "   C.GENERO AS GENERO,             " +
                "   C.EMAIL AS EMAIL,               " +
                "   C.CPF AS CPF,                   " +
                "   C.USUARIO AS USUARIO,           " +
                "   C.SENHAS AS SENHA,              " +    
                " FROM                              " +
                "   CLIENTE C                       " ;
            
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
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS NOME,                 " +
                "   C.SOBRENOME AS SOBRENOME,       " +
                "   C.GENERO AS GENERO,             " +
                "   C.EMAIL AS EMAIL,               " +
                "   C.CPF AS CPF,                   " +
                "   C.USUARIO AS USUARIO,           " +
                "   C.SENHAS AS SENHA,              " +    
                " FROM                              " +
                "   CLIENTE C                       " +
                " WHERE C.ID = ?                    " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
     
    public ResultSet listarPorNome(String nome){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS NOME,                 " +
                "   C.SOBRENOME AS SOBRENOME,       " +
                "   C.GENERO AS GENERO,             " +
                "   C.EMAIL AS EMAIL,               " +
                "   C.CPF AS CPF,                   " +
                "   C.USUARIO AS USUARIO,           " +
                "   C.SENHAS AS SENHA,              " +    
                " FROM                              " +
                "   CLIENTE C                       " +
                " WHERE C.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorSobrenome(String sobrenome){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS NOME,                 " +
                "   C.SOBRENOME AS SOBRENOME,       " +
                "   C.GENERO AS GENERO,             " +
                "   C.EMAIL AS EMAIL,               " +
                "   C.CPF AS CPF,                   " +
                "   C.USUARIO AS USUARIO,           " +
                "   C.SENHAS AS SENHA,              " +    
                " FROM                              " +
                "   CLIENTE C                       " +
                " WHERE C.SOBRENOME LIKE ?          " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, sobrenome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorGenero(String genero){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS NOME,                 " +
                "   C.SOBRENOME AS SOBRENOME,       " +
                "   C.GENERO AS GENERO,             " +
                "   C.EMAIL AS EMAIL,               " +
                "   C.CPF AS CPF,                   " +
                "   C.USUARIO AS USUARIO,           " +
                "   C.SENHAS AS SENHA,              " +    
                " FROM                              " +
                "   CLIENTE C                       " +
                " WHERE C.GENERO LIKE ?             " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, genero + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorEmail(String email){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS NOME,                 " +
                "   C.SOBRENOME AS SOBRENOME,       " +
                "   C.GENERO AS GENERO,             " +
                "   C.EMAIL AS EMAIL,               " +
                "   C.CPF AS CPF,                   " +
                "   C.USUARIO AS USUARIO,           " +
                "   C.SENHAS AS SENHA,              " +    
                " FROM                              " +
                "   CLIENTE C                       " +
                " WHERE C.EMAIL LIKE ?              " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, email + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorCpf(String cpf){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS NOME,                 " +
                "   C.SOBRENOME AS SOBRENOME,       " +
                "   C.GENERO AS GENERO,             " +
                "   C.EMAIL AS EMAIL,               " +
                "   C.CPF AS CPF,                   " +
                "   C.USUARIO AS USUARIO,           " +
                "   C.SENHAS AS SENHA,              " +    
                " FROM                              " +
                "   CLIENTE C                       " +
                " WHERE C.CPF LIKE ?                " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, cpf + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorUsuario(String usuario, boolean buscaParcial){
        try{
            sql = 
                " SELECT                            " +
                "   C.ID AS ID,                     " +
                "   C.NOME AS NOME,                 " +
                "   C.SOBRENOME AS SOBRENOME,       " +
                "   C.GENERO AS GENERO,             " +
                "   C.EMAIL AS EMAIL,               " +
                "   C.CPF AS CPF,                   " +
                "   C.USUARIO AS USUARIO,           " +
                "   C.SENHAS AS SENHA,              " +    
                " FROM                              " +
                "   CLIENTE C                       " +
                " WHERE C.USUARIO LIKE ?            " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            if(buscaParcial)
                getStatement().setString(1, usuario + "%");
            else
                getStatement().setString(1, usuario);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet recuperaSenha(String usuario){
        try{
            sql = 
                " SELECT                            " +
                "   ID,                             " +
                "   SENHA                           " +
                " FROM                              " +
                "   CLIENTE                         " +
                " WHERE USUARIO = ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, usuario);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM CLIENTE";
            
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
  



