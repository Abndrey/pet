package com.mypet2.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypet2.pet.modelo.Responsavel;

public interface ResponsavelRepository extends JpaRepository<Responsavel, Long> {
    
}
