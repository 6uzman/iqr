package com.minttcode.hackathon.iqr.model.repos;

import com.minttcode.hackathon.iqr.model.Conciliacion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConciliacionRepository extends MongoRepository<Conciliacion, String> {
    Conciliacion findByCuentaClabe(String clabe);
    Conciliacion findByCuentaTarjeta(String tarjeta);
    Conciliacion findByCuentaNumeroCuenta(String numeroCuenta);
}
