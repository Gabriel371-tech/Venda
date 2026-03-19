package com.fatecjales.Comercio.service;

import com.fatecjales.Comercio.model.Tipo;
import com.fatecjales.Comercio.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoService {

    @Autowired
    private TipoRepository tipoRepository;

    TipoService(TipoRepository tipoRepository) {
        this.tipoRepository = tipoRepository;
    }

    public Tipo save(Tipo tipo) {
        return tipoRepository.save(tipo);
    }

    public List<Tipo> AllTipos(){
        return tipoRepository.findAll();
    }

    public Tipo TipoId(Integer id){
        return tipoRepository.findByCodtipo(id);
    }

    public void apagaId(Integer id){
        tipoRepository.deleteById(id);
    }

    public void editaTipo(Tipo tipo, Integer id){
        tipo.setCodtipo(id);
        tipoRepository.save(tipo);
    }
}
