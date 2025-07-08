package com.example.app_lavarapido.model.objetos_composicao;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class VeiculoInformacao {


    @Column(name = "veic_nome")
    private String nome;

    @Column(name = "veic_modelo")
    private String modelo;

    @Column(name = "veic_cor")
    private String cor;

    @Column(name = "veic_placa")
    private String placa;

    public VeiculoInformacao() {
    }

    public VeiculoInformacao(String placa, String nome, String modelo, String cor, String placa1) {
        this.placa = placa;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa1;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
