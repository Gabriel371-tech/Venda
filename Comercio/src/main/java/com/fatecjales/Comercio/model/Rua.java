package com.fatecjales.Comercio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Rua {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codrua;

    @Column(nullable = false, length = 50)
    private String nomerua;

    public Integer getCodrua(){
        return codrua;
    }

    public String getNomerua(){
        return nomerua;
    }

    public void setCodrua(Integer codrua){
        this.codrua = codrua;
    }

    public void setNomerua(String nomerua){
        this.nomerua = nomerua;
    }
}
