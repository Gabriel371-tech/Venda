package com.fatecjales.Comercio.repository;

import com.fatecjales.Comercio.model.Cep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CepRepository extends JpaRepository<Cep, Integer> {
    Cep findByCodcep(Integer id);
}
