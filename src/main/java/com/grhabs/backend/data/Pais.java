package com.grhabs.backend.data;

/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class Pais {

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String estado;

    public Pais() {
    }

    public Pais(Integer id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}