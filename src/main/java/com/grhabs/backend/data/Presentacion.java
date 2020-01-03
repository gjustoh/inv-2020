package com.grhabs.backend.data;

public class Presentacion {
    private int idpresentacion;
    private String presentacion;

    public Presentacion() {
    }

    public Presentacion(int idpresentacion, String presentacion) {
        this.idpresentacion = idpresentacion;
        this.presentacion = presentacion;
    }

    public int getIdpresentacion() {
        return idpresentacion;
    }

    public void setIdpresentacion(int idpresentacion) {
        this.idpresentacion = idpresentacion;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
}
