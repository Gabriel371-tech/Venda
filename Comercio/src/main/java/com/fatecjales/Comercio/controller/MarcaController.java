package com.fatecjales.Comercio.controller;

import com.fatecjales.Comercio.model.Marca;
import com.fatecjales.Comercio.service.MarcaService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
@CrossOrigin(origins = "*")
public class MarcaController {

    private final MarcaService marcaService;

    MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @GetMapping("")
    public List<Marca> getMarcas() {
        return marcaService.AllMarcas();
    }

    @GetMapping("/{id}")
    public Marca marcaId(@PathVariable Integer id) {
        return marcaService.MarcaId(id);
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id) {
        marcaService.apagaId(id);
        return "Marca deletada com id = " + id;
    }

    @PostMapping("")
    public String salvarDados(@RequestBody Marca marca) {
        marcaService.save(marca);
        return "Marca salva com sucesso!!";
    }

    @PutMapping("/{id}")
    @Transactional
    public String atualizaDados(@PathVariable Integer id, @RequestBody Marca marca) {
        marcaService.editaMarca(marca, id);
        return "Dados da Marca Atualizados";
    }
}
