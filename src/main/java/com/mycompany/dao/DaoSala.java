/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.ferramentas.BancoDeDadosMySql;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getConexao;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getStatement;
import static com.mycompany.ferramentas.BancoDeDadosMySql.setStatement;

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
            getStatement().setString(4, nome);
            getStatement().setString(5, descricao);
            getStatement().setString(6, quantidadedeassentos);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, int idCinema, String nome, String descricao, String quantidadedeassentos){
        try{
            sql = "UPDATE PRODUTO SET ID_CINEMA = ?, NOME = ?, DESCRICAO = ?, QUANTIDADE DE ASSENTOS = ? WHERE ID = ?";
            
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
            sql = "DELETE FROM PRODUTO WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}