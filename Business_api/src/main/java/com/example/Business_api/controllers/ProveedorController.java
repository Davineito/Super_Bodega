package com.example.Business_api.controllers;

import com.example.Business_api.entities.Proveedor;
import com.example.Business_api.services.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @GetMapping
    public List<Proveedor> listarTodosLosProveedores() {
        return proveedorService.listarProveedores();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proveedor> obtenerProveedorPorId(@PathVariable Long id) {
        Proveedor proveedor = proveedorService.obtenerProveedor(id);
        return proveedor != null ? ResponseEntity.ok(proveedor) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Proveedor crearProveedor(@RequestBody Proveedor proveedor) {
        return proveedorService.guardarProveedor(proveedor);
    }

    @PutMapping("/{id}")
    public Proveedor actualizarProveedor(@PathVariable Long id, @RequestBody Proveedor proveedor) {
        proveedor.setId(id);
        return proveedorService.guardarProveedor(proveedor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarProveedor(@PathVariable Long id) {
        proveedorService.eliminarProveedor(id);
        return ResponseEntity.ok().build();
    }
}
