package com.example.Business_api.dao;

import com.example.Business_api.entities.Venta;

import java.util.List;

public interface VentaDao {
    void create(Venta venta);
    Venta findById(Long id);
    List<Venta> findAll();
    void update(Long id, Venta venta);
    void delete(Long id);
}
