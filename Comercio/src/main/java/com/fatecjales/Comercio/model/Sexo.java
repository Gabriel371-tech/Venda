package com.fatecjales.Comercio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Sexo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codsexo;

    @Column
    private String nomesexo;

    public Integer getCodsexo() {
        return codsexo;
    }

    public String getNomesexo() {
        return nomesexo;
    }

    public void setCodsexo(Integer codsexo) {
        this.codsexo = codsexo;
    }

    public void setNomesexo(String nomesexo) {
        this.nomesexo = nomesexo;
    }

}
