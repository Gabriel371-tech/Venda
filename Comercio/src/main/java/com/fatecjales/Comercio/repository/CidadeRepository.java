package com.fatecjales.Comercio.repository;

import com.fatecjales.Comercio.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade,Integer> {
    Cidade findByCodcidade(Integer id);
}
