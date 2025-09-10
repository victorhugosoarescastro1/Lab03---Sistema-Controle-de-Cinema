package org.model;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private int id;
    private String titulo;
    private int duracao;
    private String genero;
    private List<Sessao> sessoes;

    public Filme() {
        this.sessoes = new ArrayList<>();
    }

    public Filme(int id, String titulo, int duracao, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
        this.sessoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getGenero() {
        return genero;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }
}