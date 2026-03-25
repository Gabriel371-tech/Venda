package com.fatecjales.Comercio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codfornecedor;

    @Column
    private String nomefornecedor;

    @ManyToOne
    @JoinColumn(name = "codruafk")
    private Rua rua;

    @ManyToOne
    @JoinColumn(name = "codbairrofk")
    private Bairro bairro;

    @ManyToOne
    @JoinColumn(name = "codcepfk")
    private Cep cep;

    @ManyToOne
    @JoinColumn(name = "codcidadefk")
    private Cidade cidade;

    @Column
    private String telefonefornecedor;

    @Column
    private String emailfornecedor;

    public Fornecedor() {
    }

    public Fornecedor(Integer codfornecedor, String nomefornecedor, Rua rua, Bairro bairro, Cep cep, Cidade cidade, String telefonefornecedor, String emailfornecedor) {
        this.codfornecedor = codfornecedor;
        this.nomefornecedor = nomefornecedor;
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.telefonefornecedor = telefonefornecedor;
        this.emailfornecedor = emailfornecedor;
    }

    public Integer getCodfornecedor() {
        return codfornecedor;
    }

    public void setCodfornecedor(Integer codfornecedor) {
        this.codfornecedor = codfornecedor;
    }

    public String getNomefornecedor() {
        return nomefornecedor;
    }

    public void setNomefornecedor(String nomefornecedor) {
        this.nomefornecedor = nomefornecedor;
    }

    public Rua getRua() {
        return rua;
    }

    public void setRua(Rua rua) {
        this.rua = rua;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getTelefonefornecedor() {
        return telefonefornecedor;
    }

    public void setTelefonefornecedor(String telefonefornecedor) {
        this.telefonefornecedor = telefonefornecedor;
    }

    public String getEmailfornecedor() {
        return emailfornecedor;
    }

    public void setEmailfornecedor(String emailfornecedor) {
        this.emailfornecedor = emailfornecedor;
    }
}
