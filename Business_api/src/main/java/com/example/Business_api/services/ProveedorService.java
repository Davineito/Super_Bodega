package com.example.Business_api.services;

import com.example.Business_api.dao.ProveedorDao;
import com.example.Business_api.entities.Proveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorDao proveedorRepository;

    public List<Proveedor> listarProveedores() {
        return proveedorRepository.findAll();
    }

    public Proveedor obtenerProveedor(Long id) {
        return proveedorRepository.findById(id).orElse(null);
    }

    public Proveedor guardarProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public void eliminarProveedor(Long id) {
        proveedorRepository.deleteById(id);
    }
}
