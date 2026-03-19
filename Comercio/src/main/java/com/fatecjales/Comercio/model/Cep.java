package com.fatecjales.Comercio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cep {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codcep;

    @Column
    private Integer numerocep;

    public Integer getNumerocep() {
        return numerocep;
    }

    public void setNumerocep(Integer numerocep) {
        this.numerocep = numerocep;
    }

    public Integer getCodcep() {
        return codcep;
    }

    public void setCodcep(Integer codcep) {
        this.codcep = codcep;
    }
}
