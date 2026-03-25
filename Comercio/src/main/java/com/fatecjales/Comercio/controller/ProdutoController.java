package com.fatecjales.Comercio.controller;

import com.fatecjales.Comercio.model.Produto;
import com.fatecjales.Comercio.service.ProdutoService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {

    private final ProdutoService produtoService;

    ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping("")
    public List<Produto> getProdutos() {
        return produtoService.AllProdutos();
    }

    @GetMapping("/{id}")
    public Produto produtoId(@PathVariable Integer id) {
        return produtoService.ProdutoId(id);
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id) {
        produtoService.apagaId(id);
        return "Produto deletado com id = " + id;
    }

    @PostMapping("")
    public String salvarDados(@RequestBody Produto produto) {
        produtoService.save(produto);
        return "Produto salvo com sucesso!!";
    }

    @PutMapping("/{id}")
    @Transactional
    public String atualizaDados(@PathVariable Integer id, @RequestBody Produto produto) {
        produtoService.editaProduto(produto, id);
        return "Dados do Produto Atualizados";
    }
}
