package com.grhabs.backend.data;

public class Atributo {
    private int id;
    private String name;
    private String estado;

    public Atributo() {
    }

    public Atributo(int id, String name, String estado) {
        this.id = id;
        this.name = name;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
