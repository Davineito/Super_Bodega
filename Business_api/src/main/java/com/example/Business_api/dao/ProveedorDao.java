package com.example.Business_api.dao;

import com.example.Business_api.entities.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorDao extends JpaRepository<Proveedor, Long> {
}
