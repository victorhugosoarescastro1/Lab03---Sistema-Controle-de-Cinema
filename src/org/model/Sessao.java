package org.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private int id;
    private LocalDateTime dataHora;
    private double preco;
    private int ingressosVendidos;
    private String status;
    private Filme filme;
    private Sala sala;
    private List<Ingresso> ingressos;

    public Sessao() {
        this.ingressosVendidos = 0;
        this.status = "Ativa";
        this.ingressos = new ArrayList<>();
    }

    public Sessao(int id, LocalDateTime dataHora, double preco, Filme filme, Sala sala) {
        this.id = id;
        this.dataHora = dataHora;
        this.preco = preco;
        this.filme = filme;
        this.sala = sala;
        this.ingressosVendidos = 0;
        this.status = "Ativa";
        this.ingressos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public double getPreco() {
        return preco;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public String getStatus() {
        return status;
    }

    public Filme getFilme() {
        return filme;
    }

    public Sala getSala() {
        return sala;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }
}