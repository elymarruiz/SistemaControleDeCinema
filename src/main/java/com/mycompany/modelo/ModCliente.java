/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author elymar.8221
 */
public class ModCliente {
    private int id;
    private String nome;
    private String sobrenome;
    private String genero;
    private String email;
    private String cpf;
    private String usuario;
    private String senha;

    public ModCliente(int id, String nome, String sobrenome, String genero, String email, String cpf, String usuario, String senha) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.email = email;
        this.cpf = cpf;
        this.usuario = usuario;
        this.senha = senha;
    }

    public ModCliente() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;        
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    @Override
    public String toString() {
        return "ModCliente{" + "id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", genero=" + genero + ", email=" + email + ", cpf=" + cpf + ", usuario=" + usuario + ", senha=" + senha + '}';
    }
}
