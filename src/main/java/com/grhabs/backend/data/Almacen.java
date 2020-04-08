package com.grhabs.backend.data;

import java.util.Date;

public class Almacen {
    private int id;
    private  String  name;
    private int direccion_id;
    private String estado;

    public Almacen() {
    }

    public Almacen(int id, String name, int direccion_id, String estado) {
        this.id = id;
        this.name = name;
        this.direccion_id = direccion_id;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDireccion_id() {
        return direccion_id;
    }

    public void setDireccion_id(int direccion_id) {
        this.direccion_id = direccion_id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
