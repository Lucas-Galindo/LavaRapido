package com.example.app_lavarapido.model.dao;

import com.example.app_lavarapido.model.entidade.CategoriaVeiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaVeiculoRepository extends JpaRepository<Long, CategoriaVeiculo> {
}
