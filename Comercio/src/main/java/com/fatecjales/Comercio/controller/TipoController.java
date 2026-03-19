package com.fatecjales.Comercio.controller;

import com.fatecjales.Comercio.model.Tipo;
import com.fatecjales.Comercio.service.TipoService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipos")
@CrossOrigin(origins = "*")
public class TipoController {

    private final TipoService tipoService;

    TipoController(TipoService tipoService) {
        this.tipoService = tipoService;
    }

    @GetMapping("")
    public List<Tipo> getTipos() {
        return tipoService.AllTipos();
    }

    @GetMapping("/{id}")
    public Tipo tipoId(@PathVariable Integer id) {
        return tipoService.TipoId(id);
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id) {
        tipoService.apagaId(id);
        return "Tipo deletado com id = " + id;
    }

    @PostMapping("")
    public String salvarDados(@RequestBody Tipo tipo) {
        tipoService.save(tipo);
        return "Tipo salvo com sucesso!!";
    }

    @PutMapping("/{id}")
    @Transactional
    public String atualizaDados(@PathVariable Integer id, @RequestBody Tipo tipo) {
        tipoService.editaTipo(tipo, id);
        return "Dados do Tipo Atualizados";
    }
}
