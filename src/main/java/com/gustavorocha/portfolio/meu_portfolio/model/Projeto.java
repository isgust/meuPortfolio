package com.gustavorocha.portfolio.meu_portfolio.model;

public class Projeto {
    private String titulo;
    private String descricaoBreve;
    private String descricaoDetalhada;
    private String tecnologias;
    private String githubUrl;
    private String videoUrlPreview;
    private String imagemUrlCapa;
    private String urlDetalhe;


    //Contrutor Vazio
    public Projeto(){

    }
    // Getters e Setters para todos os atributos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricaoBreve() {
        return descricaoBreve;
    }

    public void setDescricaoBreve(String descricaoBreve) {
        this.descricaoBreve = descricaoBreve;
    }

    public String getDescricaoDetalhada() {
        return descricaoDetalhada;
    }

    public void setDescricaoDetalhada(String descricaoDetalhada) {
        this.descricaoDetalhada = descricaoDetalhada;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public String getVideoUrlPreview() {
        return videoUrlPreview;
    }

    public void setVideoUrlPreview(String videoUrlPreview) {
        this.videoUrlPreview = videoUrlPreview;
    }

    public String getImagemUrlCapa() {
        return imagemUrlCapa;
    }

    public void setImagemUrlCapa(String imagemUrlCapa) {
        this.imagemUrlCapa = imagemUrlCapa;
    }

    public String getUrlDetalhe() {
        return urlDetalhe;
    }

    public void setUrlDetalhe(String urlDetalhe) {
        this.urlDetalhe = urlDetalhe;
    }
    
}
