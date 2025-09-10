package org.model;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String nome;
    private String endereco;
    private String telefone;
    private List<Sala> salas;
    private List<Filme> filmes;

    public Cinema() {
        this.salas = new ArrayList<>();
        this.filmes = new ArrayList<>();
    }

    public Cinema(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salas = new ArrayList<>();
        this.filmes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

}

