package com.senai.infob.treino.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.infob.treino.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
    @Query(value="select * from clientes where email = :email", nativeQuery=true)
   public Cliente findByEmail(String email);
}
