package com.minttcode.hackathon.iqr.model;

import org.springframework.data.annotation.Id;

import java.sql.Timestamp;
import java.util.Date;

public class Transaccion {
    @Id
    private String id;

    private String alfanumerica;
    private Double amount;
    private Date date;
    private String telefono;
    private Cuenta cuenta;
    private String idDevice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlfanumerica() {
        return alfanumerica;
    }

    public void setAlfanumerica(String alfanumerica) {
        this.alfanumerica = alfanumerica;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(String idDevice) {
        this.idDevice = idDevice;
    }
}
