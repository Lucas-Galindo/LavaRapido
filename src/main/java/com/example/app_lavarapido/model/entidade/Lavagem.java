package com.example.app_lavarapido.model.entidade;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "lavagem")
public class Lavagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lav_id")
    private Long id;
    @Column(name = "lav_data")
    private Date data;

    @OneToMany(mappedBy = "lavagem")
    private List<Itens_Lavagem> itensLavagem;

    @OneToOne
    @JoinColumn(name = "lavcat_id")
    private CategoriaLavagem categoriaLavagem;

    @OneToOne
    @JoinColumn(name = "veic_id")
    private Veiculo veiculoLavagem;

    @OneToOne
    @JoinColumn(name = "func_matricula")
    private Funcionario funcionarioLavagem;

    @OneToOne
    @JoinColumn(name = "cli_matricula")
    private Cliente clienteLavagem;

    public Lavagem(Long id, Date data) {
        this.id = id;
        this.data = data;
    }

    public Lavagem() {
        this(0L,null);
    }

    public Long getId() {
        return id;
    }

    public Date getData() {
        return data;
    }
}
