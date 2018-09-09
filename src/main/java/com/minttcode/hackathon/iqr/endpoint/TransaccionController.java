package com.minttcode.hackathon.iqr.endpoint;

import com.minttcode.hackathon.iqr.model.Transaccion;
import com.minttcode.hackathon.iqr.service.TransaccionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transaccion")
public class TransaccionController {

    private static final Logger logger = LoggerFactory.getLogger(TransaccionController.class);

    @Autowired
    private TransaccionService transaccionService;

    @PostMapping
    public @ResponseBody Transaccion
    saveTransaccion(@RequestBody Transaccion transaccion){
        Transaccion tx = null;
        if (transaccion != null){
           tx = transaccionService.saveTransaccion(transaccion);
        }
        return tx;
    }


    @GetMapping("/device/{idDevice}")
    public @ResponseBody List<Transaccion> allTransaccionByIdDevice (@PathVariable String idDevice){
        return transaccionService.findByIdDevice(idDevice);
    }

    @GetMapping("/telefono/{telefono}")
    public @ResponseBody List<Transaccion> allTransaccionByTelefono (@PathVariable String telefono){
        return transaccionService.findByTelefono(telefono);
    }

    //TODO agregar consulta por fecha


}
