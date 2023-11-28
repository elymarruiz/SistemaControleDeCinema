/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author elymar.8221
 */
public class ModSessao {
    private int id;
    private int idSala;
    private int idFilme;
    private String data;
    private String horario;
    private String status;

    public ModSessao(int id, int idSala, int idFilme, String data, String horario, String status) {
        this.id = id;
        this.idSala = idSala;
        this.idFilme = idFilme;
        this.data = data;
        this.horario = horario;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ModSessao{" + "id=" + id + ", idSala=" + idSala + ", idFilme=" + idFilme + ", data=" + data + ", horario=" + horario + ", status=" + status + '}';
    }   
}
