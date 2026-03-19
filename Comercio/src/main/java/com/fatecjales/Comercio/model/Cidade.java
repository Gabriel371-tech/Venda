package com.fatecjales.Comercio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codcidade;

    @Column
    private String nomecidade;

    @ManyToOne
    @JoinColumn(name = "coduffk")
    private Uf uf;

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }


    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    public Integer getCodcidade() {
        return codcidade;
    }

    public void setCodcidade(Integer codcidade) {
        this.codcidade = codcidade;
    }

    public Cidade(String nomecidade, Uf uf){
        this.nomecidade = nomecidade;
        this.uf = uf;
    }

    public Cidade(){
    }
}
