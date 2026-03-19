package com.fatecjales.Comercio.controller;

import com.fatecjales.Comercio.model.Cep;
import com.fatecjales.Comercio.service.CepService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ceps")
@CrossOrigin(origins = "*")
public class CepController {

    private final CepService cepService;

    CepController(CepService cepService) {
        this.cepService = cepService;
    }

    @GetMapping("")
    public List<Cep> getCeps() {
        return cepService.AllCeps();
    }

    @GetMapping("/{id}")
    public Cep cepId(@PathVariable Integer id) {
        return cepService.CepId(id);
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id) {
        cepService.apagaId(id);
        return "Cep deletado com id = " + id;
    }

    @PostMapping("")
    public String salvarDados(@RequestBody Cep cep) {
        cepService.save(cep);
        return "Cep salvo com sucesso!!";
    }

    @PutMapping("/{id}")
    @Transactional
    public String atualizaDados(@PathVariable Integer id, @RequestBody Cep cep) {
        cepService.editaCep(cep, id);
        return "Dados do Cep Atualizados";
    }
}
