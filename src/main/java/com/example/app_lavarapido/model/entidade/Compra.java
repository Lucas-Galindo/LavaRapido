package com.example.app_lavarapido.model.entidade;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comp_id")
    private Long id;
    @Column(name = "comp_data")
    private Date data;
    @Column(name = "comp_total")
    private float total;

    @OneToOne
    @JoinColumn(name = "pess_id")
    private Funcionario funcionarioCompra;

    @OneToMany(mappedBy = "compraEstoque")
    private List<Itens_Estoque> itensEstoque;

    @OneToMany(mappedBy = "compraItemReg")
    private List<Itens_Compra> itensCompra;

    public Compra(Long id, Date data, float total) {
        this.id = id;
        this.data = data;
        this.total = total;
    }

    public Compra() {
        this(0L,null,0);
    }

    public Long getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public float getTotal() {
        return total;
    }
}
