package com.example.app_lavarapido.model.entidade;

import com.example.app_lavarapido.model.objetos_composicao.VeiculoInformacao;
import jakarta.persistence.*;

@Entity
@Table(name = "veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "veic_id")
    private Long id;

    @Embedded
    private VeiculoInformacao informacao;

    @OneToOne
    @JoinColumn(name = "veicat_id")
    private CategoriaVeiculo categoriaVeiculo;

    @OneToOne
    @JoinColumn(name = "pessoa_pess_id")
    private Pessoa pessoa;

    @OneToOne(mappedBy = "veiculoLavagem")
    private Lavagem lavagem;

    public Veiculo(Long id, VeiculoInformacao informacao, CategoriaVeiculo categoriaVeiculo, Pessoa pessoa) {
        this.id = id;
        this.informacao = informacao;
        this.categoriaVeiculo = categoriaVeiculo;
        this.pessoa = pessoa;
    }

    public Veiculo() {
        this(0L,null,null,null);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategoriaVeiculo getCategoriaVeiculo() {
        return categoriaVeiculo;
    }

    public void setCategoriaVeiculo(CategoriaVeiculo categoriaVeiculo) {
        this.categoriaVeiculo = categoriaVeiculo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public VeiculoInformacao getInformacao() {
        return informacao;
    }

    public void setInformacao(VeiculoInformacao informacao) {
        this.informacao = informacao;
    }
}
