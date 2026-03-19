package com.fatecjales.Comercio.controller;

import com.fatecjales.Comercio.model.Uf;
import com.fatecjales.Comercio.service.UfService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ufs")
@CrossOrigin(origins = "*")
public class UfController {

    private final UfService ufService;

    UfController(UfService ufService) {
        this.ufService = ufService;
    }

    @GetMapping("")
    public List<Uf> getUfs() {
        return ufService.AllUfs();
    }

    @GetMapping("/{id}")
    public Uf ufId(@PathVariable Integer id) {
        return ufService.UfId(id);
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id) {
        ufService.apagaId(id);
        return "UF deletada com id = " + id;
    }

    @PostMapping("")
    public String salvarDados(@RequestBody Uf uf) {
        ufService.save(uf);
        return "UF salva com sucesso!!";
    }

    @PutMapping("/{id}")
    @Transactional
    public String atualizaDados(@PathVariable Integer id, @RequestBody Uf uf) {
        ufService.editaUf(uf, id);
        return "Dados da UF Atualizados";
    }
}
