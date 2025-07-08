package com.example.app_lavarapido.model.entidade;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "itens_estoque")
public class Itens_Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ie_id")
    private Long id;
    @Column(name = "ie_data")
    private Date data;
    @Column(name = "ie_quantidade")
    private int quantidade;

    @ManyToOne
    @JoinColumn(name = "prod_id")
    private Estoque estoque;

    @ManyToOne
    @JoinColumn(name = "comp_id")
    private Compra compraEstoque;


    public Itens_Estoque(Long id, Date data, int quantidade) {
        this.id = id;
        this.data = data;
        this.quantidade = quantidade;
    }

    public Itens_Estoque() {
        this(0L,null,0);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Compra getCompraEstoque() {
        return compraEstoque;
    }

    public void setCompraEstoque(Compra compraEstoque) {
        this.compraEstoque = compraEstoque;
    }
}
