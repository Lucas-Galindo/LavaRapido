package com.example.app_lavarapido.model.entidade;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria_lavagem")
public class CategoriaLavagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lavcat_id")
    private Long id;

    @Column(name = "lavcat_nome")
    private String nome;

    @Column(name = "lavcat_tempo")
    private int tempoDeServico;

    @Column(name = "lavcat_desc")
    private String descricao;

    @OneToOne(mappedBy = "categoriaLavagem")
    private Lavagem lavagem;

    public CategoriaLavagem(Long id, String nome, int tempoDeServico, String descricao) {
        this.id = id;
        this.nome = nome;
        this.tempoDeServico = tempoDeServico;
        this.descricao = descricao;
    }

    public CategoriaLavagem() {
        this(0L, "", 0, "");
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoDeServico() {
        return tempoDeServico;
    }

    public String getDescricao() {
        return descricao;
    }
}


