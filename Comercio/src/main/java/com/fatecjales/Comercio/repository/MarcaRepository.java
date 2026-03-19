package com.fatecjales.Comercio.repository;

import com.fatecjales.Comercio.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Integer> {
    Marca findByCodmarca(Integer id);
}
