package com.example.app_lavarapido.model.dao;

import com.example.app_lavarapido.model.entidade.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Long, Pessoa> {
}
