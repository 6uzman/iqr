package com.minttcode.hackathon.iqr.service;


import com.minttcode.hackathon.iqr.model.Transaccion;
import com.minttcode.hackathon.iqr.model.repos.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransaccionService {
    @Autowired
    private TransaccionRepository transaccionRepository;


    public Transaccion saveTransaccion(Transaccion transaccion){
        return transaccionRepository.save(transaccion);
    }

    public List<Transaccion> findByIdDevice(String idDevice){
        return transaccionRepository.findByIdDevice(idDevice);
    }

    public List<Transaccion> findByTelefono(String telefono){
        return transaccionRepository.findByTelefono(telefono);
    }

}
