package com.fatecjales.Comercio.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CompraProdutoId implements Serializable {

    private Integer codcomprafk;
    private Integer codprodutofk;

    public CompraProdutoId() {
    }

    public CompraProdutoId(Integer codcomprafk, Integer codprodutofk) {
        this.codcomprafk = codcomprafk;
        this.codprodutofk = codprodutofk;
    }

    public Integer getCodcomprafk() {
        return codcomprafk;
    }

    public void setCodcomprafk(Integer codcomprafk) {
        this.codcomprafk = codcomprafk;
    }

    public Integer getCodprodutofk() {
        return codprodutofk;
    }

    public void setCodprodutofk(Integer codprodutofk) {
        this.codprodutofk = codprodutofk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompraProdutoId that = (CompraProdutoId) o;
        return Objects.equals(codcomprafk, that.codcomprafk) && Objects.equals(codprodutofk, that.codprodutofk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codcomprafk, codprodutofk);
    }
}
