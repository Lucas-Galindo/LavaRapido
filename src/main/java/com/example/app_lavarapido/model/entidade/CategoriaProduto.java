package com.example.app_lavarapido.model.entidade;

import jakarta.persistence.*;

@Entity
@Table(name = "Categoria_Produto")
public class CategoriaProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prodcat_id")
    private Long id;

    @Column(name = "prodcat_nome")
    private String nome;

    @Column(name = "prodcat_desc")
    private String desc;

    @OneToOne(mappedBy = "categoriaProduto")
    private Produto produto;

    public CategoriaProduto(Long id, String nome, String desc) {
        this.id = id;
        this.nome = nome;
        this.desc = desc;
    }

    public CategoriaProduto(){
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
