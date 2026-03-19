package com.fatecjales.Comercio.repository;

import com.fatecjales.Comercio.model.Sexo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SexoRepository extends JpaRepository<Sexo, Integer> {

    Sexo findByCodsexo(Integer id);
}
