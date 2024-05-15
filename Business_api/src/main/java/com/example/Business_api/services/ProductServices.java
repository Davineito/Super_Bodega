package com.example.Business_api.services;

import com.example.Business_api.entities.Product;

import java.util.List;

//paso 3
public interface ProductServices {
    public List<Product> findAll();
    public Product findById(Long Id);

    //CRUD OPERATIONS
    public void create(Product product);
    public void update(Long id,Product product);
    public void delate(Long id);
}
