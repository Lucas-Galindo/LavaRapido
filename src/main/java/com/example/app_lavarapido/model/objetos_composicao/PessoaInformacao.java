package com.example.app_lavarapido.model.objetos_composicao;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PessoaInformacao {

    @Column(name = "pess_cpf")
    private String cpf;
    @Column(name = "pess_nome")
    private String nome;
    @Column(name = "pess_telefone")
    private String telefone;

    public PessoaInformacao(String cpf, String nome, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }
    public PessoaInformacao(){

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
