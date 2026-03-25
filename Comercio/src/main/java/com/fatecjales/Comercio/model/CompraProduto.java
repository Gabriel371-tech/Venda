package com.fatecjales.Comercio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CompraProduto {

    @EmbeddedId
    private CompraProdutoId id;

    @ManyToOne
    @MapsId("codcomprafk")
    @JoinColumn(name = "codcomprafk")
    private Compra compra;

    @ManyToOne
    @MapsId("codprodutofk")
    @JoinColumn(name = "codprodutofk")
    private Produto produto;

    @Column
    private Integer quantidade;

    @Column
    private BigDecimal valorcp;

    public CompraProduto() {
    }

    public CompraProduto(CompraProdutoId id, Compra compra, Produto produto, Integer quantidade, BigDecimal valorcp) {
        this.id = id;
        this.compra = compra;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorcp = valorcp;
    }

    public CompraProdutoId getId() {
        return id;
    }

    public void setId(CompraProdutoId id) {
        this.id = id;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorcp() {
        return valorcp;
    }

    public void setValorcp(BigDecimal valorcp) {
        this.valorcp = valorcp;
    }
}
