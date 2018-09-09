package com.minttcode.hackathon.iqr.model.repos;

import com.minttcode.hackathon.iqr.model.Transaccion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TransaccionRepository extends MongoRepository<Transaccion, String> {
    List<Transaccion> findByIdDevice(String idDevice);
    List<Transaccion> findByTelefono(String telefono);


}
