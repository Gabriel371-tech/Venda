package com.fatecjales.Comercio.service;

import com.fatecjales.Comercio.model.Rua;
import com.fatecjales.Comercio.repository.RuaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuaService {

    @Autowired
    private RuaRepository ruaRepository;

    RuaService(RuaRepository ruaRepository) {
        this.ruaRepository = ruaRepository;
    }

    public Rua save(Rua rua) {
        return ruaRepository.save(rua);
    }

    public List<Rua> AllRuas(){
        return ruaRepository.findAll();
    }

    public Rua RuaId(Integer id){
        return ruaRepository.findByCodrua(id);
    }

    public void apagaId(Integer id){
        ruaRepository.deleteById(id);
    }

    public void editaRua(Rua rua, Integer id){
        rua.setCodrua(id);
        ruaRepository.save(rua);
    }
}
