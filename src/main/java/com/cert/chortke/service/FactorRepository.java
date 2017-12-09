package com.cert.chortke.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cert.chortke.entities.FactorEntity;

public interface FactorRepository extends JpaRepository<FactorEntity, Long> {

}
