package com.minttcode.hackathon.iqr.endpoint;


import com.minttcode.hackathon.iqr.model.Conciliacion;
import com.minttcode.hackathon.iqr.model.Transaccion;
import com.minttcode.hackathon.iqr.service.ConciliacionService;
import com.minttcode.hackathon.iqr.service.DeviceService;
import com.minttcode.hackathon.iqr.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

@RestController
@RequestMapping("/api/conciliacion")
public class ConciliacionController {

    @Autowired
    private ConciliacionService conciliacionService;

    @Autowired
    private TransaccionService transaccionService;


    @PostMapping
    public @ResponseBody Conciliacion saveConciliacion(@RequestBody Conciliacion conciliacion){
        Transaccion tx = new Transaccion();
        tx.setAlfanumerica(conciliacion.getAlfanumerica());
        tx.setAmount(conciliacion.getAmount());
        tx.setDate(Calendar.getInstance().getTime());
        tx.setCuenta(conciliacion.getCuenta());

        tx.setIdDevice(conciliacion.getIdDevice());

        transaccionService.saveTransaccion(tx);

        return conciliacionService.createConciliacion(conciliacion);
    }

    @GetMapping("/{id}")
    public @ResponseBody Conciliacion getConciliacionBy(@PathVariable String idConciliacion){
        return conciliacionService.getConciliacionById(idConciliacion);
    }




}
