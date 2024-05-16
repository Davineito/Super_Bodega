package com.example.Business_api.dao;

import com.example.Business_api.entities.Venta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class VentaDaoImpl implements VentaDao {
    private List<Venta> ventas = new ArrayList<>();

    @Override
    public void create(Venta venta) {
        ventas.add(venta);
    }

    @Override
    public Venta findById(Long id) {
        return ventas.stream()
                .filter(venta -> venta.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Venta> findAll() {
        return new ArrayList<>(ventas);
    }

    @Override
    public void update(Long id, Venta venta) {
        Optional<Venta> existingVenta = ventas.stream()
                .filter(v -> v.getId().equals(id))
                .findFirst();
        existingVenta.ifPresent(v -> {
            v.setFecha(venta.getFecha());
            v.setCliente(venta.getCliente());
            v.setTotal(venta.getTotal());
        });
    }

    @Override
    public void delete(Long id) {
        ventas.removeIf(venta -> venta.getId().equals(id));
    }
}
