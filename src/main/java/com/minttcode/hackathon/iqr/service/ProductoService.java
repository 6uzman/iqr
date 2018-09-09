package com.minttcode.hackathon.iqr.service;

import com.minttcode.hackathon.iqr.model.Producto;
import com.minttcode.hackathon.iqr.model.repos.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public boolean createProducto (Producto producto) {
        boolean rest = false;
        if (producto != null){
            productoRepository.save(producto);
            rest = true;
        }

        return rest;

    }

    public Producto getProductoById(String id){
        Optional<Producto> productoOptional;
        productoOptional = productoRepository.findById(id);
        return productoOptional.get();
    }

    public Producto getProductoByUpc(String upc){
        Producto productoOptional;
        productoOptional = productoRepository.findByUpc(upc);
        return productoOptional;
    }

    public List<Producto> getProductoByIdUser(String idUser){
        List<Producto> productList;
        productList = productoRepository.findByIdUser(idUser);
        return productList;
    }



}
