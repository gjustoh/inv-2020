package com.grhabs.backend.data;


/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class Proveedor {

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer direccionId;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String logoUrl;

    /**
     * 
     */
    private String descripcion;

    /**
     * 
     */
    private String tipo;

    /**
     * 
     */
    private String websiteUrl;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String estado;

    public Proveedor() {
    }

    public Proveedor(Integer id, Integer direccionId, String nombre, String logoUrl, String descripcion, String tipo, String websiteUrl, String email, String estado) {
        this.id = id;
        this.direccionId = direccionId;
        this.nombre = nombre;
        this.logoUrl = logoUrl;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.websiteUrl = websiteUrl;
        this.email = email;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(Integer direccionId) {
        this.direccionId = direccionId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}