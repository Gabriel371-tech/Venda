package com.fatecjales.Comercio.service;

import com.fatecjales.Comercio.model.CompraProduto;
import com.fatecjales.Comercio.model.CompraProdutoId;
import com.fatecjales.Comercio.repository.CompraProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraProdutoService {

    @Autowired
    private CompraProdutoRepository compraProdutoRepository;

    public CompraProduto save(CompraProduto compraProduto) {
        return compraProdutoRepository.save(compraProduto);
    }

    public List<CompraProduto> AllCompraProdutos() {
        return compraProdutoRepository.findAll();
    }

    public CompraProduto CompraProdutoId(Integer codcomprafk, Integer codprodutofk) {
        return compraProdutoRepository.findById(new CompraProdutoId(codcomprafk, codprodutofk)).orElse(null);
    }

    public void apagaId(Integer codcomprafk, Integer codprodutofk) {
        compraProdutoRepository.deleteById(new CompraProdutoId(codcomprafk, codprodutofk));
    }

    public void editaCompraProduto(CompraProduto compraProduto, Integer codcomprafk, Integer codprodutofk) {
        compraProduto.setId(new CompraProdutoId(codcomprafk, codprodutofk));
        compraProdutoRepository.save(compraProduto);
    }
}
