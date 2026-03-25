package com.fatecjales.Comercio.repository;

import com.fatecjales.Comercio.model.CompraProduto;
import com.fatecjales.Comercio.model.CompraProdutoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraProdutoRepository extends JpaRepository<CompraProduto, CompraProdutoId> {
}
