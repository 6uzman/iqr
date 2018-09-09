package com.minttcode.hackathon.iqr.service;

import com.minttcode.hackathon.iqr.model.Conciliacion;
import com.minttcode.hackathon.iqr.model.Cuenta;
import com.minttcode.hackathon.iqr.model.repos.ConciliacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ConciliacionService {

    @Autowired
    private ConciliacionRepository conciliacionRepository;

    public Conciliacion getConciliacionById(String id){
        Optional<Conciliacion> optionalConciliacion = conciliacionRepository.findById(id);
        return optionalConciliacion.get();
    }

    public Conciliacion createConciliacion(Conciliacion conciliacion){
        Conciliacion concil = null;
        if (conciliacion != null){
            concil = conciliacionRepository.save(conciliacion);
        }
        return concil;
    }

    public Conciliacion getConciliacionByCuenta(Cuenta cuenta){
        Conciliacion conci = null;
        if (cuenta != null ){
            if ( cuenta.getClabe() != null){
                conci = conciliacionRepository.findByCuentaClabe(cuenta.getClabe());
            }
            else {
                if (cuenta.getTarjeta() != null){
                    conci = conciliacionRepository.findByCuentaTarjeta(cuenta.getTarjeta());
                } else
                if (cuenta.getNumeroCuenta() != null){
                    conci = conciliacionRepository.findByCuentaNumeroCuenta(cuenta.getNumeroCuenta());
                }
            }
        }
        return conci;
    }
}
