/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author elymar.8221
 */
public class ModIngresso{    
    private int id;
    private String regular;
    private String meiaentrada;
    private String crianca;
    private String idoso;
    
    public ModIngresso(int id, String regular, String meiaentrada, String crianca, String idoso) {
        this.id = id;
        this.regular = regular;
        this.meiaentrada = meiaentrada;
        this.crianca = crianca;
        this.idoso = idoso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }

    public String getMeiaentrada() {
        return meiaentrada;
    }

    public void setMeiaentrada(String meiaentrada) {
        this.meiaentrada = meiaentrada;
    }

    public String getCrianca() {
        return crianca;
    }

    public void setCrianca(String crianca) {
        this.crianca = crianca;
    }

    public String getIdoso() {
        return idoso;
    }

    public void setIdoso(String idoso) {
        this.idoso = idoso;
    }

    @Override
    public String toString() {
        return "ModIngresso{" + "id=" + id + ", regular=" + regular + ", meiaentrada=" + meiaentrada + ", crianca=" + crianca + ", idoso=" + idoso + '}';
    }   
}
