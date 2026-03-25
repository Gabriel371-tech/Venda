package com.fatecjales.Comercio.controller;

import com.fatecjales.Comercio.model.Fornecedor;
import com.fatecjales.Comercio.service.FornecedorService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
@CrossOrigin(origins = "*")
public class FornecedorController {

    private final FornecedorService fornecedorService;

    FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }

    @GetMapping("")
    public List<Fornecedor> getFornecedores() {
        return fornecedorService.AllFornecedores();
    }

    @GetMapping("/{id}")
    public Fornecedor fornecedorId(@PathVariable Integer id) {
        return fornecedorService.FornecedorId(id);
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id) {
        fornecedorService.apagaId(id);
        return "Fornecedor deletado com id = " + id;
    }

    @PostMapping("")
    public String salvarDados(@RequestBody Fornecedor fornecedor) {
        fornecedorService.save(fornecedor);
        return "Fornecedor salvo com sucesso!!";
    }

    @PutMapping("/{id}")
    @Transactional
    public String atualizaDados(@PathVariable Integer id, @RequestBody Fornecedor fornecedor) {
        fornecedorService.editaFornecedor(fornecedor, id);
        return "Dados do Fornecedor Atualizados";
    }
}
