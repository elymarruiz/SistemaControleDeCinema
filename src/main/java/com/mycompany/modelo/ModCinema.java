/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author elymar.8221
 */
public class ModCinema {    
    private int id;
    private int idCidade;
    private String nome;

    public ModCinema(int id, int idCidade, String nome) {
        this.id = id;
        this.idCidade = idCidade;
        this.nome = nome;
    }

    public ModCinema() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ModCinema{" + "id=" + id + ", idCidade=" + idCidade + ", nome=" + nome + '}';
    }
}
