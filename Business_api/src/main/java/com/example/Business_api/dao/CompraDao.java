package com.example.Business_api.dao;

import com.example.Business_api.entities.Compra;

import java.util.List;

public interface CompraDao {
    void create(Compra compra);
    Compra findById(Long id);
    List<Compra> findAll();
    void update(Long id, Compra compra);
    void delete(Long id);
}
