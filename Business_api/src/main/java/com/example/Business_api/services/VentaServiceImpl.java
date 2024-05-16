package com.example.Business_api.services;

import com.example.Business_api.dao.VentaDao;
import com.example.Business_api.entities.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceImpl implements VentaService {

    @Autowired
    private VentaDao ventaDao;

    @Override
    public void create(Venta venta) {
        ventaDao.create(venta);
    }

    @Override
    public Venta findById(Long id) {
        return ventaDao.findById(id);
    }

    @Override
    public List<Venta> findAll() {
        return ventaDao.findAll();
    }

    @Override
    public void update(Long id, Venta venta) {
        ventaDao.update(id, venta);
    }

    @Override
    public void delete(Long id) {
        ventaDao.delete(id);
    }
}
