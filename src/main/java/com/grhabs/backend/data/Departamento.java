package com.grhabs.backend.data;


/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class Departamento {

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String nombre;

    public Departamento() {
    }

    public Departamento(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}