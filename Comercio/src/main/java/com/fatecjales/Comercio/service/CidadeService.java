package com.fatecjales.Comercio.service;

import com.fatecjales.Comercio.model.Cidade;
import com.fatecjales.Comercio.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    CidadeService(CidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    public Cidade save(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }

    public List<Cidade> AllCidades(){
        return cidadeRepository.findAll();
    }

    public Cidade CidadeId(Integer id){
        return cidadeRepository.findByCodcidade(id);
    }

    public void apagaId(Integer id){
        cidadeRepository.deleteById(id);
    }

    public void editaCidade(Cidade cidade, Integer id){
        cidade.setCodcidade(id);
        cidadeRepository.save(cidade);
    }
}
