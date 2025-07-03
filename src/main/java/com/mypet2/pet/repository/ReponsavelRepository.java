package com.mypet2.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypet2.pet.modelo.Responsavel;

public interface ReponsavelRepository extends JpaRepository<Responsavel, Long> {
    
}
