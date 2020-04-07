package com.grhabs.backend.data;

/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class Direccion {

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String distritoId;

    /**
     * 
     */
    private Integer paisId;

    /**
     * 
     */
    private String direccion1;

    /**
     * 
     */
    private String direccion2;

    /**
     * 
     */
    private String ciudad;

    /**
     * 
     */
    private String codigoPostal;

    /**
     * 
     */
    private Object longitude;

    /**
     * 
     */
    private Object latitude;

    /**
     * 
     */
    private String estado;

    public Direccion() {
    }

    public Direccion(Integer id, String distritoId, Integer paisId, String direccion1, String direccion2, String ciudad, String codigoPostal, Object longitude, Object latitude, String estado) {
        this.id = id;
        this.distritoId = distritoId;
        this.paisId = paisId;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.longitude = longitude;
        this.latitude = latitude;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistritoId() {
        return distritoId;
    }

    public void setDistritoId(String distritoId) {
        this.distritoId = distritoId;
    }

    public Integer getPaisId() {
        return paisId;
    }

    public void setPaisId(Integer paisId) {
        this.paisId = paisId;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Object getLongitude() {
        return longitude;
    }

    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    public Object getLatitude() {
        return latitude;
    }

    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}