package com.gustavorocha.portfolio.meu_portfolio.model;

public class Contato {
    private String nome;
    private String email;
    private String mensagem;

    //Construtor vazio
    public Contato(){

    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getMensagem() {
        return mensagem;
    }

    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
