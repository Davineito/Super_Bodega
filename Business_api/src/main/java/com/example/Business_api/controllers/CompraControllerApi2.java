package com.example.Business_api.controllers;

import com.example.Business_api.entities.Compra;
import com.example.Business_api.services.CompraServiceApi2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api2/compras")
public class CompraControllerApi2 {
    @Autowired
    private CompraServiceApi2 compraServiceApi2;

    @PostMapping("/realizar")
    public ResponseEntity<?> realizarCompra(@RequestParam Long clienteId, @RequestParam List<Long> productoIds){
        try {
            Compra compra = compraServiceApi2.realizarCompra(clienteId, productoIds);
            return ResponseEntity.ok(compra);
        } catch (RuntimeException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }
}
