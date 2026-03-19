package com.fatecjales.Comercio.controller;

import com.fatecjales.Comercio.model.Bairro;
import com.fatecjales.Comercio.service.BairroService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bairros")
@CrossOrigin(origins = "*")
public class BairroController {

    private final BairroService bairroService;

    BairroController(BairroService bairroService) {
        this.bairroService = bairroService;
    }

    @GetMapping("")
    public List<Bairro> getBairros() {
        return bairroService.AllBairros();
    }

    @GetMapping("/{id}")
    public Bairro bairroId(@PathVariable Integer id) {
        return bairroService.BairroId(id);
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id) {
        bairroService.apagaId(id);
        return "Bairro deletado com id = " + id;
    }

    @PostMapping("")
    public String salvarDados(@RequestBody Bairro bairro) {
        bairroService.save(bairro);
        return "Bairro salvo com sucesso!!";
    }

    @PutMapping("/{id}")
    @Transactional
    public String atualizaDados(@PathVariable Integer id, @RequestBody Bairro bairro) {
        bairroService.editaBairro(bairro, id);
        return "Dados do Bairro Atualizados";
    }
}
