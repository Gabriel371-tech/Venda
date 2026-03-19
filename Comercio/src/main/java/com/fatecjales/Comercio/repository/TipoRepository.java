package com.fatecjales.Comercio.repository;

import com.fatecjales.Comercio.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoRepository extends JpaRepository <Tipo,Integer> {
    Tipo findByCodtipo(Integer id);
}
