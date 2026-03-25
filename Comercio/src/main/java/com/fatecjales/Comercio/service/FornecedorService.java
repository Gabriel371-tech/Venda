package com.fatecjales.Comercio.service;

import com.fatecjales.Comercio.model.Fornecedor;
import com.fatecjales.Comercio.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor save(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public List<Fornecedor> AllFornecedores() {
        return fornecedorRepository.findAll();
    }

    public Fornecedor FornecedorId(Integer id) {
        return fornecedorRepository.findByCodfornecedor(id);
    }

    public void apagaId(Integer id) {
        fornecedorRepository.deleteById(id);
    }

    public void editaFornecedor(Fornecedor fornecedor, Integer id) {
        fornecedor.setCodfornecedor(id);
        fornecedorRepository.save(fornecedor);
    }
}
