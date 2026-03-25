package com.fatecjales.Comercio.controller;

import com.fatecjales.Comercio.model.Cliente;
import com.fatecjales.Comercio.service.ClienteService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    private final ClienteService clienteService;

    ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("")
    public List<Cliente> getClientes() {
        return clienteService.AllClientes();
    }

    @GetMapping("/{id}")
    public Cliente clienteId(@PathVariable Integer id) {
        return clienteService.ClienteId(id);
    }

    @DeleteMapping("/{id}")
    public String deletaId(@PathVariable Integer id) {
        clienteService.apagaId(id);
        return "Cliente deletado com id = " + id;
    }

    @PostMapping("")
    public String salvarDados(@RequestBody Cliente cliente) {
        clienteService.save(cliente);
        return "Cliente salvo com sucesso!!";
    }

    @PutMapping("/{id}")
    @Transactional
    public String atualizaDados(@PathVariable Integer id, @RequestBody Cliente cliente) {
        clienteService.editaCliente(cliente, id);
        return "Dados do Cliente Atualizados";
    }
}
