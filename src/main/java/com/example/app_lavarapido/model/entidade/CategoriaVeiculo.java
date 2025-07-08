package com.example.app_lavarapido.model.entidade;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria_veiculo")
public class CategoriaVeiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "veicat_id")
    private Long id;

    @Column(name = "veicat_nome")
    private String nome;

    @Column(name = "veicat_desc")
    private String desc;

    @OneToOne(mappedBy = "categoriaVeiculo")
    private Veiculo veiculo;

    public CategoriaVeiculo(Long id, String nome, String desc) {
        this.id = id;
        this.nome = nome;
        this.desc = desc;
    }
    public CategoriaVeiculo(){
        this(0L,"","");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
