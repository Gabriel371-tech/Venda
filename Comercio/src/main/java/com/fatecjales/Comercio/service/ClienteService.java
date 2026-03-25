package com.fatecjales.Comercio.service;

import com.fatecjales.Comercio.model.Cliente;
import com.fatecjales.Comercio.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> AllClientes() {
        return clienteRepository.findAll();
    }

    public Cliente ClienteId(Integer id) {
        return clienteRepository.findByCodcliente(id);
    }

    public void apagaId(Integer id) {
        clienteRepository.deleteById(id);
    }

    public void editaCliente(Cliente cliente, Integer id) {
        cliente.setCodcliente(id);
        clienteRepository.save(cliente);
    }
}
