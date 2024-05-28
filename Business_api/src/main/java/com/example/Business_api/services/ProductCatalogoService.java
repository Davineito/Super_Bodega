package com.example.Business_api.services;

import com.example.Business_api.dao.ProductCatalogo;
import com.example.Business_api.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCatalogoService {
    @Autowired
    private ProductCatalogo productCatalogo;

    public Page<Product> getProducts(Specification<Product> spec, Pageable pageable){
        return productCatalogo.findAll(spec, pageable);
    }
}
