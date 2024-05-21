package com.example.Business_api.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//autoincremental
    private Long id;
    private String Cliente;
    private Long nit;
    private double total;

    @Column(name ="created_at")
    @Temporal(TemporalType.DATE) //espesificar q es tipo fecha
    private Date createdAt;

    // captadores y definidores

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
