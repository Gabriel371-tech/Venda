package com.fatecjales.Comercio.service;

import com.fatecjales.Comercio.model.Cep;
import com.fatecjales.Comercio.repository.CepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CepService {

    @Autowired
    private CepRepository cepRepository;

    CepService(CepRepository cepRepository) {
        this.cepRepository = cepRepository;
    }

    public Cep save(Cep cep) {
        return cepRepository.save(cep);
    }

    public List<Cep> AllCeps(){
        return cepRepository.findAll();
    }

    public Cep CepId(Integer id){
        return cepRepository.findByCodcep(id);
    }

    public void apagaId(Integer id){
        cepRepository.deleteById(id);
    }

    public void editaCep(Cep cep, Integer id){
        cep.setCodcep(id);
        cepRepository.save(cep);
    }
}
