package com.example.Business_api.controllers;


import com.example.Business_api.entities.Product;
import com.example.Business_api.services.ProductCatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2/productcatalogo")
public class ProductCatalogoController {
    @Autowired
    private ProductCatalogoService productCatalogoService;

    @GetMapping
    public Page<Product> getProducts(@RequestParam(required = false) String category, Pageable pageable){
        Specification<Product> spec = (root, query, criteriaBuilder) -> {
            if (category != null) {
                return criteriaBuilder.equal(root.get("category"), category);
            }
            return criteriaBuilder.conjunction();
        };
        return productCatalogoService.getProducts(spec,pageable);
    }
}
