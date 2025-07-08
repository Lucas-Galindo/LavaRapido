package com.example.app_lavarapido.model.entidade;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "estoque")
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "arm_id")
    private Long id;
    @Column(name = "arm_total")
    private int total;

    @OneToMany(mappedBy = "estoque")
    private List<Itens_Estoque> itensEstoques;

    public Estoque(Long id, int total) {
        this.id = id;
        this.total = total;
    }

    public Estoque() {
        this(0L,0);
    }

    public Long getId() {
        return id;
    }

    public int getTotal() {
        return total;
    }
}
