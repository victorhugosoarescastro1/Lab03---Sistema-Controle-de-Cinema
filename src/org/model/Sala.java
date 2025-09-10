package org.model;

// Sala.java
import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int numero;
    private int capacidade;
    private String tipo;
    private List<Sessao> sessoes;

    public Sala() {
        this.sessoes = new ArrayList<>();
    }

    public Sala(int numero, int capacidade, String tipo) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.tipo = tipo;
        this.sessoes = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

}