package com.fatecjales.Comercio.service;

import com.fatecjales.Comercio.model.Produto;
import com.fatecjales.Comercio.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> AllProdutos() {
        return produtoRepository.findAll();
    }

    public Produto ProdutoId(Integer id) {
        return produtoRepository.findByCodproduto(id);
    }

    public void apagaId(Integer id) {
        produtoRepository.deleteById(id);
    }

    public void editaProduto(Produto produto, Integer id) {
        produto.setCodproduto(id);
        produtoRepository.save(produto);
    }
}
