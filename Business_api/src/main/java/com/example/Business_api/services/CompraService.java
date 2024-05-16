package com.example.Business_api.services;

import com.example.Business_api.entities.Compra;

import java.util.List;

public interface CompraService {
    void create(Compra compra);
    Compra findById(Long id);
    List<Compra> findAll();
    void update(Long id, Compra compra);
    void delete(Long id);
}

