package com.example.app_lavarapido.model.entidade;

import jakarta.persistence.*;

@Entity
@Table(name = "itens_lavagem")
public class Itens_Lavagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ip_id")
    private Long id;
    @Column(name = "ip_quantidade")
    private int quantidade;

    @ManyToOne
    @JoinColumn(name = "prod_id")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "lav_id")
    private Lavagem lavagem;

    public Itens_Lavagem(Long id, int quantidade) {
        this.id = id;
        this.quantidade = quantidade;
    }

    public Itens_Lavagem() {
        this(0L,0);
    }

    public Long getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public Lavagem getLavagem() {
        return lavagem;
    }
}
