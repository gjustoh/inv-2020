package com.grhabs.backend.data;


/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class Provincia {

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String departamentoId;

    public Provincia() {
    }

    public Provincia(String id, String nombre, String departamentoId) {
        this.id = id;
        this.nombre = nombre;
        this.departamentoId = departamentoId;
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

    public String getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(String departamentoId) {
        this.departamentoId = departamentoId;
    }
}