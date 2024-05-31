package com.example.Business_api.services;

import com.example.Business_api.dao.ClienteRepository;
import com.example.Business_api.dao.CompraRepository;

import com.example.Business_api.dao.ProductoRepository;
import com.example.Business_api.entities.Cliente;
import com.example.Business_api.entities.Compra;
import com.example.Business_api.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class CompraServiceApi2 {
    @Autowired
    private CompraRepository compraRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Transactional
    public Compra realizarCompra(Long clienteId, List<Long> productoIds) {
        Cliente cliente = clienteRepository.findById(clienteId).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        List<Product> productos = productoRepository.findAllById(productoIds);
        if (productos.isEmpty()) {
            throw new RuntimeException("Productos no encontrados");
        }
        Compra compra = new Compra();
        compra.setCliente(cliente);
        compra.setProductos(productos);
        compra.setFechaCompra(new Date());

        // Reducir el inventario de los productos (opcional)
        /*
        for (Producto producto : productos) {
            if (producto.getInventario() > 0) {
                producto.setInventario(producto.getInventario() - 1);
                productoRepository.save(producto);
            } else {
                throw new RuntimeException("Producto " + producto.getNombre() + " no tiene suficiente inventario");
            }
            */

        return compraRepository.save(compra);
    }
}
