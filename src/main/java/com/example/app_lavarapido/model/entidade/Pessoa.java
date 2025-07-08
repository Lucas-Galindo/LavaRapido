package com.example.app_lavarapido.model.entidade;

import com.example.app_lavarapido.model.objetos_composicao.PessoaInformacao;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pess_id")
    private Long id;

    @Embedded
    private PessoaInformacao informacao;

    @OneToOne(mappedBy = "pessoa")
    private Veiculo veiculo;

    public Pessoa(Long id, PessoaInformacao informacao) {
        this.id = id;
        this.informacao = informacao;
    }
    public Pessoa(){
        this(0L,null);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PessoaInformacao getInformacao() {
        return informacao;
    }

    public void setInformacao(PessoaInformacao informacao) {
        this.informacao = informacao;
    }
}
