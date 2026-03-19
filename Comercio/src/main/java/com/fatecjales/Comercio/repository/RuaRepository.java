package com.fatecjales.Comercio.repository;

import com.fatecjales.Comercio.model.Rua;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RuaRepository extends JpaRepository<Rua, Integer> {
    Rua findByCodrua(Integer id);
}
