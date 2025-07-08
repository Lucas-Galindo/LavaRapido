package com.example.app_lavarapido.model.entidade;

import com.example.app_lavarapido.model.objetos_composicao.PessoaInformacao;
import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Cliente extends Pessoa{
    
    @Column(name = "cli_matricula")
    private int matricula;

    @OneToOne(mappedBy = "clienteLavagem")
    private Lavagem lavagem;

    public Cliente(Long id, PessoaInformacao informacao, int matricula) {
        super(id, informacao);
        this.matricula = matricula;
    }

    public Cliente(int matricula) {
        this.matricula = matricula;
    }

    public Cliente(){
        this(0);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
