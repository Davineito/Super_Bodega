package com.example.Business_api.dao;

import com.example.Business_api.entities.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompraDao extends CrudRepository <Compra, Long> {
}
