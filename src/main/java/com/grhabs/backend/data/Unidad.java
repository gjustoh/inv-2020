package com.grhabs.backend.data;

/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class Unidad {

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String estado;

    public Unidad() {
    }

    public Unidad(Integer id, String name, String estado) {
        this.id = id;
        this.name = name;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}