package com.example.Business_api.dao;

import com.example.Business_api.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository<Cliente, Long> {
}
