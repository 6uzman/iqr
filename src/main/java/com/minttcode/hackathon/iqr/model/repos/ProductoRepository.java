package com.minttcode.hackathon.iqr.model.repos;

import com.minttcode.hackathon.iqr.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductoRepository extends MongoRepository<Producto, String> {
    Producto findByUpc(String upc);
    List<Producto> findByIdUser(String idUser);
}
