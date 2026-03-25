package com.fatecjales.Comercio.repository;

import com.fatecjales.Comercio.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Cliente findByCodcliente(Integer id);
}
