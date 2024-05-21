package com.example.Business_api.controllers;

import com.example.Business_api.entities.Compra;
import com.example.Business_api.entities.Product;
import com.example.Business_api.entities.Venta;
import com.example.Business_api.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping
    public List<Compra> GetAll(){
        return compraService.findAll();
    }
    //OBTENER por ID
    @GetMapping(value="/{id}")
    public Compra GetById(@PathVariable Long id){
        return compraService.findById(id);
    }
    //CRUD controller
    @PostMapping
    public void create(@RequestBody Compra compra){
        compraService.create(compra);
    }
    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Compra compra){
        compraService.update(id, compra);
    }
    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){

        compraService.delate(id);
    }
}
