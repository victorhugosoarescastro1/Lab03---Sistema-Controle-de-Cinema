package org.model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private String login;
    private String senha;
    private List<Ingresso> ingressosVendidos;

    public Funcionario() {
        this.ingressosVendidos = new ArrayList<>();
    }

    public Funcionario(int id, String nome, String cargo, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
        this.ingressosVendidos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public List<Ingresso> getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setIngressosVendidos(List<Ingresso> ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }
}
