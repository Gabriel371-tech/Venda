package com.fatecjales.Comercio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Uf {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer coduf;

    @Column
    private String nomeuf;

    @Column
    private String siglauf;

    public Integer getCoduf() {
        return coduf;
    }

    public void setCoduf(Integer coduf) {
        this.coduf = coduf;
    }

    public String getNomeuf() {
        return nomeuf;
    }

    public void setNomeuf(String nomeuf) {
        this.nomeuf = nomeuf;
    }

    public String getSiglauf() {
        return siglauf;
    }

    public void setSiglauf(String siglauf) {
        this.siglauf = siglauf;
    }
}
