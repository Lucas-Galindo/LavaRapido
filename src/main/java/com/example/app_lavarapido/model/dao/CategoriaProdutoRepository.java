package com.example.app_lavarapido.model.dao;

import com.example.app_lavarapido.model.entidade.CategoriaProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaProdutoRepository extends JpaRepository<Long, CategoriaProduto> {
}
