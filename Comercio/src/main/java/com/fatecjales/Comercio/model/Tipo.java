package com.fatecjales.Comercio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codtipo;

    @Column
    private String nometipo;

    public String getNometipo() {
        return nometipo;
    }

    public void setNometipo(String nometipo) {
        this.nometipo = nometipo;
    }

    public Integer getCodtipo() {
        return codtipo;
    }

    public void setCodtipo(Integer codtipo) {
        this.codtipo = codtipo;
    }
}
