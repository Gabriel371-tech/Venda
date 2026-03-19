package com.fatecjales.Comercio.repository;

import com.fatecjales.Comercio.model.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BairroRepository extends JpaRepository<Bairro, Integer> {
    Bairro findByCodbairro(Integer id);
}
