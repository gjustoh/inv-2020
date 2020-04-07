package com.grhabs.backend.data;


/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class Distrito {

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
    private String provinciaId;

    /**
     * 
     */
    private String departamentoId;

    public Distrito() {
    }

    public Distrito(String id, String nombre, String provinciaId, String departamentoId) {
        this.id = id;
        this.nombre = nombre;
        this.provinciaId = provinciaId;
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

    public String getProvinciaId() {
        return provinciaId;
    }

    public void setProvinciaId(String provinciaId) {
        this.provinciaId = provinciaId;
    }

    public String getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(String departamentoId) {
        this.departamentoId = departamentoId;
    }
}