package com.fatecjales.Comercio.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codcompra;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate datacompra;

    @ManyToOne
    @JoinColumn(name = "codclientefk")
    private Cliente cliente;

    public Compra() {
    }

    public Compra(Integer codcompra, LocalDate datacompra, Cliente cliente) {
        this.codcompra = codcompra;
        this.datacompra = datacompra;
        this.cliente = cliente;
    }

    public Integer getCodcompra() {
        return codcompra;
    }

    public void setCodcompra(Integer codcompra) {
        this.codcompra = codcompra;
    }

    public LocalDate getDatacompra() {
        return datacompra;
    }

    public void setDatacompra(LocalDate datacompra) {
        this.datacompra = datacompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
