package com.example.Business_api.dao;

import com.example.Business_api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Product, Long> {
}
