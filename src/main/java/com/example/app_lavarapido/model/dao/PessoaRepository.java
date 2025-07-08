package com.example.app_lavarapido.model.dao;

import com.example.app_lavarapido.model.entidade.Pessoa;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Long, Pessoa> {


//    @Modifying
//    @Transactional
//    @Query(value = "INSERT INTO feedback (fee_texto, den_id) VALUES (:fee_texto, :den_id)",nativeQuery = true)
//    public void addFeedBack(@Param("den_id") Long id, @Param("fee_texto") String texto );
//

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO funcionario (pess_id, func_funcao) VALUES (:pessoa_id, :funcao)", nativeQuery = true)
    public void saveFunc(@Param("pessoa_id") Long id, @Param("funcao") String texto);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO cliente (pess_id) VALUES (:pessoa_id)",nativeQuery = true)
    public void saveCliente(@Param("pessoa_id") Long id);
}
