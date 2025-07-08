package com.example.app_lavarapido.model.objetos_composicao;

import jakarta.persistence.*;

import java.util.Date;

@Embeddable
public class ProdutoInformacao {

    @Column(name = "prod_nome")
    private String nome;
    @Column(name = "prod_validade")
    private Date validade;
    @Column(name = "prod_metrica")
    private String metrica;

    public ProdutoInformacao(String nome, Date validade, String metrica) {
        this.nome = nome;
        this.validade = validade;
        this.metrica = metrica;
    }
    public ProdutoInformacao(){
        this("",null,"");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getMetrica() {
        return metrica;
    }

    public void setMetrica(String metrica) {
        this.metrica = metrica;
    }
}
