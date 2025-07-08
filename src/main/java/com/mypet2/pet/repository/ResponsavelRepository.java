package com.mypet2.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mypet2.pet.modelo.Responsavel;

public interface ResponsavelRepository extends JpaRepository<Responsavel, Long> {
    
    @Query (value =  "select * from responsavel where nome like ?", nativeQuery = true)
    public Responsavel findByNome(String nome);


}
