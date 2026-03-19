package com.fatecjales.Comercio.controller;

import com.fatecjales.Comercio.model.Sexo;
import com.fatecjales.Comercio.service.SexoService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sexos")
@CrossOrigin(origins = "*")
public class SexoController {

    private final SexoService sexoService;

    SexoController(SexoService sexoService) {
        this.sexoService = sexoService;
    }

    @GetMapping("")
    public List<Sexo> getSexo() {
        return sexoService.AllSexos();
    }

    @GetMapping("/{id}")
    public Sexo sexoId(@PathVariable Integer id) {
        return sexoService.SexoId(id);
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id) {
        sexoService.apagaId(id);
        return "Campo deletado com id = " + id;
    }

    @PostMapping("")
    public String salvarDados(@RequestBody Sexo sexo) {
        sexoService.save(sexo);
        return "Dados salvos com sucesso!!";
    }

    @PutMapping("/{id}")
    @Transactional
    public String atualizaDados(@PathVariable Integer id, @RequestBody Sexo sexo) {
        sexoService.editaSexo(sexo, id);
        return "Dados Atualizados";
    }
}
