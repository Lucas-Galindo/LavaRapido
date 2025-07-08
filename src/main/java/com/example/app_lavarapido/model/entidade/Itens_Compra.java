package com.example.app_lavarapido.model.entidade;

import jakarta.persistence.*;

@Entity
@Table(name = "itens_compra")
public class Itens_Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ic_id")
    private Long id;
    @Column(name = "ic_quantidade")
    private int quantidade;
    @Column(name = "ic_preco_unitario")
    private float preco;

    @ManyToOne
    @JoinColumn(name = "prod_id")
    private Produto produtoCompra;

    @ManyToOne
    @JoinColumn(name = "comp_id")
    private Compra compraItemReg;

    public Itens_Compra(Long id, int quantidade, float preco) {
        this.id = id;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Itens_Compra() {
        this(0L,0,0);
    }

    public Long getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public Produto getProdutoCompra() {
        return produtoCompra;
    }

    public Compra getCompraItemReg() {
        return compraItemReg;
    }
}
