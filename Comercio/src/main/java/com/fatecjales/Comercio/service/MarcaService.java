package com.fatecjales.Comercio.service;

import com.fatecjales.Comercio.model.Marca;
import com.fatecjales.Comercio.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    MarcaService(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    public Marca save(Marca marca) {
        return marcaRepository.save(marca);
    }

    public List<Marca> AllMarcas(){
        return marcaRepository.findAll();
    }

    public Marca MarcaId(Integer id){
        return marcaRepository.findByCodmarca(id);
    }

    public void apagaId(Integer id){
        marcaRepository.deleteById(id);
    }

    public void editaMarca(Marca marca, Integer id){
        marca.setCodmarca(id);
        marcaRepository.save(marca);
    }
}
