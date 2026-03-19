package com.fatecjales.Comercio.service;

import com.fatecjales.Comercio.model.Uf;
import com.fatecjales.Comercio.repository.UfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UfService {

    @Autowired
    private UfRepository ufRepository;

    UfService(UfRepository ufRepository) {
        this.ufRepository = ufRepository;
    }

    public Uf save(Uf uf) {
        return ufRepository.save(uf);
    }

    public List<Uf> AllUfs(){
        return ufRepository.findAll();
    }

    public Uf UfId(Integer id){
        return ufRepository.findByCoduf(id);
    }

    public void apagaId(Integer id){
        ufRepository.deleteById(id);
    }

    public void editaUf(Uf uf, Integer id){
        uf.setCoduf(id);
        ufRepository.save(uf);
    }
}
