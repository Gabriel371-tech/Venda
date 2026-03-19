package com.fatecjales.Comercio.service;

import com.fatecjales.Comercio.model.Bairro;
import com.fatecjales.Comercio.repository.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BairroService {

    @Autowired
    private BairroRepository bairroRepository;

    BairroService(BairroRepository bairroRepository) {
        this.bairroRepository = bairroRepository;
    }

    public Bairro save(Bairro bairro) {
        return bairroRepository.save(bairro);
    }

    public List<Bairro> AllBairros(){
        return bairroRepository.findAll();
    }

    public Bairro BairroId(Integer id){
        return bairroRepository.findByCodbairro(id);
    }

    public void apagaId(Integer id){
        bairroRepository.deleteById(id);
    }

    public void editaBairro(Bairro bairro, Integer id){
        bairro.setCodbairro(id);
        bairroRepository.save(bairro);
    }
}
