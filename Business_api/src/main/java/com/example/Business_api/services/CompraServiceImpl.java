package com.example.Business_api.services;

import com.example.Business_api.dao.CompraDao;
import com.example.Business_api.entities.Compra;
import com.example.Business_api.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraServiceImpl implements CompraService {

@Autowired
CompraDao compraDao;


    @Override
    public List<Compra> findAll() {
        return (List<Compra>) compraDao.findAll();
    }

    @Override
    public Compra findById(Long Id) {
        return compraDao.findById(Id).orElse(null);
    }

    @Override
    public void create(Compra compra) {
        compraDao.save(compra);
    }

    @Override
    public void update(Long id, Compra compra) {
        if (compraDao.existsById(id)) {
            compra.setId(id);
            compraDao.save(compra);
        }
    }

    @Override
    public void delate(Long id) {
        if (compraDao.existsById(id)){
            compraDao.deleteById(id);
        }
    }
}
