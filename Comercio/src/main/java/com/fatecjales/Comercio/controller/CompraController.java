package com.fatecjales.Comercio.controller;

import com.fatecjales.Comercio.model.Compra;
import com.fatecjales.Comercio.service.CompraService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
@CrossOrigin(origins = "*")
public class CompraController {

    private final CompraService compraService;

    CompraController(CompraService compraService) {
        this.compraService = compraService;
    }

    @GetMapping("")
    public List<Compra> getCompras() {
        return compraService.AllCompras();
    }

    @GetMapping("/{id}")
    public Compra compraId(@PathVariable Integer id) {
        return compraService.CompraId(id);
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id) {
        compraService.apagaId(id);
        return "Compra deletada com id = " + id;
    }

    @PostMapping("")
    public String salvarDados(@RequestBody Compra compra) {
        compraService.save(compra);
        return "Compra salva com sucesso!!";
    }

    @PutMapping("/{id}")
    @Transactional
    public String atualizaDados(@PathVariable Integer id, @RequestBody Compra compra) {
        compraService.editaCompra(compra, id);
        return "Dados da Compra Atualizados";
    }
}
