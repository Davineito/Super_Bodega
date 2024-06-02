package com.example.Business_api.dao;

import com.example.Business_api.entities.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarritoRepository extends JpaRepository<Carrito, Long> {
}
