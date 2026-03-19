package com.fatecjales.Comercio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codbairro;

    @Column
    private String nomebairro;

    public Integer getCodbairro() {
        return codbairro;
    }

    public void setCodbairro(Integer codbairro) {
        this.codbairro = codbairro;
    }

    public String getNomebairro() {
        return nomebairro;
    }

    public void setNomebairro(String nomebairro) {
        this.nomebairro = nomebairro;
    }
}
