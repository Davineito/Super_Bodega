package com.example.Business_api.entities;

import java.util.Date;

public class Venta {
    private Long id;
    private Date fecha;
    private String cliente;
    private double total;

    // captadores y definidores
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}
