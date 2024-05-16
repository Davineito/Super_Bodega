package com.example.Business_api.controllers;

import com.example.Business_api.entities.Compra;
import com.example.Business_api.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping
    public List<Compra> getAllCompras() {
        return compraService.findAll();
    }

    @GetMapping("/{id}")
    public Compra getCompraById(@PathVariable Long id) {
        return compraService.findById(id);
    }

    @PostMapping
    public void createCompra(@RequestBody Compra compra) {
        compraService.create(compra);
    }

    @PutMapping("/{id}")
    public void updateCompra(@PathVariable Long id, @RequestBody Compra compra) {
        compraService.update(id, compra);
    }

    @DeleteMapping("/{id}")
    public void deleteCompra(@PathVariable Long id) {
        compraService.delete(id);
    }
}
