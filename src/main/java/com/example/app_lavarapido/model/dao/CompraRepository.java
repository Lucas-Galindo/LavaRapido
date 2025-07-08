package com.example.app_lavarapido.model.dao;

import com.example.app_lavarapido.model.entidade.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository  extends JpaRepository<Long, Compra> {
}
