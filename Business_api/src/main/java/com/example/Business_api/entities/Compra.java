package com.example.Business_api.entities;

import java.util.Date;

public class Compra {
    private Long id;
    private Date fecha;
    private String proveedor;
    private double total;

    // captadores y definidores
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getProveedor() { return proveedor; }
    public void setProveedor(String proveedor) { this.proveedor = proveedor; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}
