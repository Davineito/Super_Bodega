package com.example.Business_api.services;

import com.example.Business_api.entities.Compra;
import com.example.Business_api.entities.Product;

import java.util.List;

public interface CompraService {
    public List<Compra> findAll();
    public Compra findById(Long Id);

    //CRUD OPERATIONS
    public void create(Compra compra);
    public void update(Long id,Compra compra);
    public void delate(Long id);
}

