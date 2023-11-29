/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author elymar.8221
 */
public class ModSala {
    private int id;
    private int idCinema;
    private String nome;
    private String descricao;
    private String quantidadeassentos;

    public ModSala(int id, int idCinema, String nome, String descricao, String quantidadeassentos) {
        this.id = id;
        this.idCinema = idCinema;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidadeassentos = quantidadeassentos;
    }

    public ModSala() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getQuantidadeassentos() {
        return quantidadeassentos;
    }

    public void setQuantidadeassentos(String quantidadeassentos) {
        this.quantidadeassentos = quantidadeassentos;
    }

    @Override
    public String toString() {
        return "ModSala{" + "id=" + id + ", idCinema=" + idCinema + ", nome=" + nome + ", descricao=" + descricao + ", quantidadeassentos=" + quantidadeassentos + '}';
    }           
}
