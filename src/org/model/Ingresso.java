package org.model;

import java.time.LocalDateTime;

public class Ingresso {
    private int numero;
    private TipoIngresso tipo;
    private double preco;
    private LocalDateTime dataVenda;
    private String assento;
    private Sessao sessao;
    private Cliente cliente;
    private Funcionario funcionario;

    public Ingresso() {
        this.dataVenda = LocalDateTime.now();
    }

    public Ingresso(int numero, TipoIngresso tipo, double precoBase, String assento,
                    Sessao sessao, Cliente cliente, Funcionario funcionario) {
        this.numero = numero;
        this.tipo = tipo;
        this.assento = assento;
        this.sessao = sessao;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.dataVenda = LocalDateTime.now();
    }

    public int getNumero() {
        return numero;
    }

    public TipoIngresso getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public String getAssento() {
        return assento;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(TipoIngresso tipo) {
        this.tipo = tipo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}