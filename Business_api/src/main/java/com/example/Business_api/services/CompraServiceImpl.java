package com.example.Business_api.services;

import com.example.Business_api.dao.CompraDao;
import com.example.Business_api.entities.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraServiceImpl implements CompraService {

    @Autowired
    private CompraDao compraDao;

    @Override
    public void create(Compra compra) {
        compraDao.create(compra);
    }

    @Override
    public Compra findById(Long id) {
        return compraDao.findById(id);
    }

    @Override
    public List<Compra> findAll() {
        return compraDao.findAll();
    }

    @Override
    public void update(Long id, Compra compra) {
        compraDao.update(id, compra);
    }

    @Override
    public void delete(Long id) {
        compraDao.delete(id);
    }
}
