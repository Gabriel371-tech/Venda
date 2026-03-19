package com.fatecjales.Comercio.service;

import com.fatecjales.Comercio.model.Sexo;
import com.fatecjales.Comercio.repository.SexoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SexoService {

    @Autowired
    private SexoRepository sexoRepository;

    SexoService(SexoRepository sexoRepository) {
        this.sexoRepository = sexoRepository;
    }

    public Sexo save(Sexo sexo) {
        return sexoRepository.save(sexo);
    }

    public List<Sexo> AllSexos(){
        return sexoRepository.findAll();
    }

    public Sexo SexoId(Integer id){
        return sexoRepository.findByCodsexo(id);
    }

    public void apagaId(Integer id){
        sexoRepository.deleteById(id);
    }

    public void editaSexo(Sexo sexo, Integer id){
        sexo.setCodsexo(id);
        sexoRepository.save(sexo);
    }


}


