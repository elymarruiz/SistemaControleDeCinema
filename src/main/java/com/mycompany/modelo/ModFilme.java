/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author elymar.8221
 */
public class ModFilme {
    private int id;
    private String genero;
    private String nome;
    private String sinopse;
    private String diretor;
    private String datadelancamento;
    private String duracao;
    private String classificacaoetaria;
    
    public ModFilme(int id, String genero, String nome, String sinopse, String diretor, String datadelancamento, String duracao, String classificacaoetaria){
        this.id = id;
        this.genero = genero;
        this.nome = nome;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.datadelancamento = datadelancamento;
        this.duracao = duracao;
        this.classificacaoetaria = classificacaoetaria;
    }

    public ModFilme() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDatadelancamento() {
        return datadelancamento;
    }

    public void setDatadelancamento(String datadelancamento) {
        this.datadelancamento = datadelancamento;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getClassificacaoetaria() {
        return classificacaoetaria;
    }

    public void setClassificacaoetaria(String classificacaoetaria) {
        this.classificacaoetaria = classificacaoetaria;
    }

    @Override
    public String toString() {
        return "ModFilme{" + "id=" + id + ", genero=" + genero + ", nome=" + nome + ", sinopse=" + sinopse + ", diretor=" + diretor + ", datadelancamento=" + datadelancamento + ", duracao=" + duracao + ", classificacaoetaria=" + classificacaoetaria + '}';
    }    
}
