package com.fatecjales.Comercio.repository;

import com.fatecjales.Comercio.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra, Integer> {
    Compra findByCodcompra(Integer id);
}
