package com.fatecjales.Comercio.controller;

import com.fatecjales.Comercio.model.Cidade;
import com.fatecjales.Comercio.service.CidadeService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidades")
@CrossOrigin(origins = "*")
public class CidadeController {

    private final CidadeService cidadeService;

    CidadeController(CidadeService cidadeService) {
        this.cidadeService = cidadeService;
    }

    @GetMapping("")
    public List<Cidade> getCidades() {
        return cidadeService.AllCidades();
    }

    @GetMapping("/{id}")
    public Cidade cidadeId(@PathVariable Integer id) {
        return cidadeService.CidadeId(id);
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id) {
        cidadeService.apagaId(id);
        return "Cidade deletada com id = " + id;
    }

    @PostMapping("")
    public String salvarDados(@RequestBody Cidade cidade) {
        cidadeService.save(cidade);
        return "Cidade salva com sucesso!!";
    }

    @PutMapping("/{id}")
    @Transactional
    public String atualizaDados(@PathVariable Integer id, @RequestBody Cidade cidade) {
        cidadeService.editaCidade(cidade, id);
        return "Dados da Cidade Atualizados";
    }
}
