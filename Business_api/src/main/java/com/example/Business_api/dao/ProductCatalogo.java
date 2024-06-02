package com.example.Business_api.dao;

import com.example.Business_api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductCatalogo extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {

}
