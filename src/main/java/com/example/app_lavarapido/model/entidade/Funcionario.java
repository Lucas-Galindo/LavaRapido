package com.example.app_lavarapido.model.entidade;

import com.example.app_lavarapido.model.objetos_composicao.PessoaInformacao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Funcionario extends Pessoa{

    @Column(name = "func_matricula")
    private int matricula;

    @Column(name = "func_funcao")
    private String funcao;

    @OneToOne(mappedBy = "funcionarioLavagem")
    private Lavagem lavagem;

    @OneToOne(mappedBy = "funcionarioCompra")
    private Compra compra;


    public Funcionario(Long id, PessoaInformacao informacao, int matricula, String funcao) {
        super(id, informacao);
        this.matricula = matricula;
        this.funcao = funcao;
    }

    public Funcionario(int matricula, String funcao) {
        this.matricula = matricula;
        this.funcao = funcao;
    }

    public Funcionario(){
        this(0,"");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
