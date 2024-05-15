package com.example.Business_api.dao;
import com.example.Business_api.entities.Product;
import org.springframework.data.repository.CrudRepository;

//paso 2
public interface ProductDao extends CrudRepository<Product, Long> {
}