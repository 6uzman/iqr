package com.minttcode.hackathon.iqr.model;

import org.springframework.data.annotation.Id;

public class Conciliacion {

    @Id
    private String id;
    private String alfanumerica;
    private Double amount;
    private Cuenta cuenta;
    private String email;
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

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(String idDevice) {
        this.idDevice = idDevice;
    }
}
