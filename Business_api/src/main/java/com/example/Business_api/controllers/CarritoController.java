package com.example.Business_api.controllers;

import com.example.Business_api.dao.CarritoRepository;
import com.example.Business_api.dao.ClienteRepository;
import com.example.Business_api.dao.ProductoRepository;
import com.example.Business_api.entities.Carrito;
import com.example.Business_api.entities.Cliente;
import com.example.Business_api.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping("/api2/carritos")
public class CarritoController {
    @Autowired
    private CarritoRepository carritoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @PostMapping("/agregar")
    public ResponseEntity<?> agregarProductoAlCarrito(@RequestParam Long clienteId, @RequestParam Long productoId) {
        // Obtener cliente y producto
        Cliente cliente = clienteRepository.findById(clienteId).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
        Product producto = productoRepository.findById(productoId).orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        // Crear o actualizar carrito
        Carrito carrito = carritoRepository.findById(clienteId).orElse(new Carrito());
        carrito.setCliente(cliente);

        // Verificar si la lista de productos es null
        if (carrito.getProductos() == null) {
            carrito.setProductos(new ArrayList<>());
        }

        carrito.getProductos().add(producto);

        // Guardar carrito
        carritoRepository.save(carrito);

        return ResponseEntity.ok("Producto agregado al carrito");
    }

    @GetMapping("/ver")
    public ResponseEntity<?> verCarrito(@RequestParam Long clienteId) {
        Optional<Carrito> carritoOptional = carritoRepository.findById(clienteId);

        if (carritoOptional.isPresent()) {
            return ResponseEntity.ok(carritoOptional.get());
        } else {
            return ResponseEntity.status(404).body("Carrito no encontrado para el cliente ID: " + clienteId);
        }
    }
}