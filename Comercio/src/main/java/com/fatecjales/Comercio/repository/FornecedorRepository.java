package com.fatecjales.Comercio.repository;

import com.fatecjales.Comercio.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {
    Fornecedor findByCodfornecedor(Integer id);
}
