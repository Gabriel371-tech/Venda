package com.fatecjales.Comercio.service;

import com.fatecjales.Comercio.model.Compra;
import com.fatecjales.Comercio.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    public Compra save(Compra compra) {
        return compraRepository.save(compra);
    }

    public List<Compra> AllCompras() {
        return compraRepository.findAll();
    }

    public Compra CompraId(Integer id) {
        return compraRepository.findByCodcompra(id);
    }

    public void apagaId(Integer id) {
        compraRepository.deleteById(id);
    }

    public void editaCompra(Compra compra, Integer id) {
        compra.setCodcompra(id);
        compraRepository.save(compra);
    }
}
