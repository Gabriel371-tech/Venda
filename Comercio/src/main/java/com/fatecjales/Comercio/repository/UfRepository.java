package com.fatecjales.Comercio.repository;

import com.fatecjales.Comercio.model.Uf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UfRepository extends JpaRepository<Uf, Integer> {
    Uf findByCoduf(Integer id);
}
