/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author elymar.8221
 */
public class ModCompra{
    private int id;
    private int idCliente;
    private int idFilme;
    private int idSala;
    private int idSessao;
    private int idIngresso;
    private String horario;
    private double preco;

    public ModCompra(int id, int idCliente, int idFilme, int idSala, int idSessao, int idIngresso, String Horario, double preco) {
        this.id = id;
        this.idCliente = idCliente;
        this.idFilme = idFilme;
        this.idSala = idSala;
        this.idSessao = idSessao;
        this.idIngresso = idIngresso;
        this.horario = horario;
        this.preco = preco;
    }

    public ModCompra() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }
    
    public int getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }
    
    public int getIdIngresso() {
        return idSala;
    }

    public void setIdIngresso(int idIngresso) {
        this.idIngresso = idIngresso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ModCompra{" + "id=" + id + ", idCliente=" + idCliente + ", idFilme=" + idFilme + ", idSala=" + idSala + ", idSessão=" + idSessao + ", idIngresso=" + idIngresso + ", horario=" + horario + ", preco=" + preco + '}';
    }
}
