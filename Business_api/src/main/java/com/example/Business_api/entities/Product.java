package com.example.Business_api.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

//Paso 1
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//autoincremental
    private Long id;

    @NotEmpty
    private String name;

    @NotNull
    private Double price;
    private String description;
    private String category;


    @Column(name ="created_at")
    @Temporal(TemporalType.DATE) //espesificar q es tipo fecha
    private Date createdAt;

    @ManyToMany(mappedBy = "productos")
    private List<Carrito> carritos;
    @ManyToMany(mappedBy = "productos")
    private List<Compra> compras;

    //Getters and setters

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescriotion() {
        return description;
    }

    public void setDescriotion(String descriotion) {
        this.description = descriotion;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<Carrito> getCarritos() {
        return carritos;
    }

    public void setCarritos(List<Carrito> carritos) {
        this.carritos = carritos;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}