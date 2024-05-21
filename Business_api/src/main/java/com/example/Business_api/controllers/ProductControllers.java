package com.example.Business_api.controllers;



import com.example.Business_api.entities.Product;
import com.example.Business_api.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//paso 5 <controlador>
@RestController
@CrossOrigin("http://127.0.0.1:5500")
@RequestMapping("/api/products")
public class ProductControllers {

    @Autowired
    ProductServices productServices;

    @GetMapping
    public List<Product> GetAll(){
        return productServices.findAll();
    }
    //OBTENER por ID
    @GetMapping(value="/{id}")
    public Product GetById(@PathVariable Long id){
        return productServices.findById(id);
    }


    //CRUD controller
    @PostMapping
    public void create(@RequestBody Product product){

        productServices.create(product);
    }
    //editar   <localhost:8080/products/5>
    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Product product){
        productServices.update(id, product);
    }

    //localhost:8080/products/5
    @DeleteMapping(value ="/{id}")
    @CrossOrigin(origins = "http://localhost:5500")
    public void delete(@PathVariable Long id){

        productServices.delate(id);
    }
}
