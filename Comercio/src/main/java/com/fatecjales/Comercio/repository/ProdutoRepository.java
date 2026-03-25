package com.fatecjales.Comercio.repository;

import com.fatecjales.Comercio.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    Produto findByCodproduto(Integer id);
}
