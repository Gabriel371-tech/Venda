package com.fatecjales.Comercio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codproduto;

    @Column
    private String nomeproduto;

    @ManyToOne
    @JoinColumn(name = "codtipofk")
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "codmarcafk")
    private Marca marca;

    @Column
    private Integer quantidade;

    @Column
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "codfornecedorfk")
    private Fornecedor fornecedor;

    public Produto() {
    }

    public Produto(Integer codproduto, String nomeproduto, Tipo tipo, Marca marca, Integer quantidade, BigDecimal valor, Fornecedor fornecedor) {
        this.codproduto = codproduto;
        this.nomeproduto = nomeproduto;
        this.tipo = tipo;
        this.marca = marca;
        this.quantidade = quantidade;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }

    public Integer getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(Integer codproduto) {
        this.codproduto = codproduto;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
