package com.fatecjales.Comercio.controller;

import com.fatecjales.Comercio.model.CompraProduto;
import com.fatecjales.Comercio.service.CompraProdutoService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compra-produtos")
@CrossOrigin(origins = "*")
public class CompraProdutoController {

    private final CompraProdutoService compraProdutoService;

    CompraProdutoController(CompraProdutoService compraProdutoService) {
        this.compraProdutoService = compraProdutoService;
    }

    @GetMapping("")
    public List<CompraProduto> getCompraProdutos() {
        return compraProdutoService.AllCompraProdutos();
    }

    @GetMapping("/{codcomprafk}/{codprodutofk}")
    public CompraProduto compraProdutoId(@PathVariable Integer codcomprafk, @PathVariable Integer codprodutofk) {
        return compraProdutoService.CompraProdutoId(codcomprafk, codprodutofk);
    }

    @DeleteMapping("/{codcomprafk}/{codprodutofk}")
    public String deletaId(@PathVariable Integer codcomprafk, @PathVariable Integer codprodutofk) {
        compraProdutoService.apagaId(codcomprafk, codprodutofk);
        return "CompraProduto deletado com id = " + codcomprafk + ", " + codprodutofk;
    }

    @PostMapping("")
    public String salvarDados(@RequestBody CompraProduto compraProduto) {
        compraProdutoService.save(compraProduto);
        return "CompraProduto salvo com sucesso!!";
    }

    @PutMapping("/{codcomprafk}/{codprodutofk}")
    @Transactional
    public String atualizaDados(@PathVariable Integer codcomprafk, @PathVariable Integer codprodutofk, @RequestBody CompraProduto compraProduto) {
        compraProdutoService.editaCompraProduto(compraProduto, codcomprafk, codprodutofk);
        return "Dados do CompraProduto Atualizados";
    }
}
