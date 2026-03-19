package com.fatecjales.Comercio.controller;

import com.fatecjales.Comercio.model.Rua;
import com.fatecjales.Comercio.service.RuaService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ruas")
@CrossOrigin(origins = "*")
public class RuaController {

    private final RuaService ruaService;

    RuaController(RuaService ruaService) {
        this.ruaService = ruaService;
    }

    @GetMapping("")
    public List<Rua> getRuas() {
        return ruaService.AllRuas();
    }

    @GetMapping("/{id}")
    public Rua ruaId(@PathVariable Integer id) {
        return ruaService.RuaId(id);
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id) {
        ruaService.apagaId(id);
        return "Rua deletada com id = " + id;
    }

    @PostMapping("")
    public String salvarDados(@RequestBody Rua rua) {
        ruaService.save(rua);
        return "Rua salva com sucesso!!";
    }

    @PutMapping("/{id}")
    @Transactional
    public String atualizaDados(@PathVariable Integer id, @RequestBody Rua rua) {
        ruaService.editaRua(rua, id);
        return "Dados da Rua Atualizados";
    }
}
