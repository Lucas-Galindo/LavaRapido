package com.example.app_lavarapido.model.entidade;

import com.example.app_lavarapido.model.objetos_composicao.ProdutoInformacao;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="prod_id")
    private Long id;

    @Embedded
    private ProdutoInformacao informacao;

    @OneToOne
    @JoinColumn(name = "prodcat_id")
    private CategoriaProduto categoriaProduto;

    @OneToMany(mappedBy = "produto")
    private List<Itens_Lavagem> itensLavagem;

    @OneToMany(mappedBy = "produtoCompra")
    private List<Itens_Compra> itensCompra;

    public Produto(Long id, ProdutoInformacao informacao) {
        this.id = id;
        this.informacao = informacao;
    }

    public Produto(){
        this(0L,null);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome(){
        return this.informacao.getNome();
    }
    public Date getValidade(){
        return this.informacao.getValidade();
    }
    public String getMetrica(){
        return this.informacao.getMetrica();
    }

    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }
}
