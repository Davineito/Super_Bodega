package com.example.Business_api.dao;

import com.example.Business_api.entities.Compra;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CompraDaoImpl implements CompraDao {
    private List<Compra> compras = new ArrayList<>();

    @Override
    public void create(Compra compra) {
        compras.add(compra);
    }

    @Override
    public Compra findById(Long id) {
        return compras.stream()
                .filter(compra -> compra.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Compra> findAll() {
        return new ArrayList<>(compras);
    }

    @Override
    public void update(Long id, Compra compra) {
        Optional<Compra> existingCompra = compras.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
        existingCompra.ifPresent(c -> {
            c.setFecha(compra.getFecha());
            c.setProveedor(compra.getProveedor());
            c.setTotal(compra.getTotal());
        });
    }

    @Override
    public void delete(Long id) {
        compras.removeIf(compra -> compra.getId().equals(id));
    }
}
