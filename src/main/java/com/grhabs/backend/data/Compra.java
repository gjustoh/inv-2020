package com.grhabs.backend.data;


/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class Compra {

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer usuarioId;

    /**
     * 
     */
    private Integer proveedorId;

    /**
     * 
     */
    private String descripcion;

    /**
     * 
     */
    private Object monto;

    /**
     * 
     */
    private String estado;

    public Compra() {
    }

    public Compra(Integer id, Integer usuarioId, Integer proveedorId, String descripcion, Object monto, String estado) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.proveedorId = proveedorId;
        this.descripcion = descripcion;
        this.monto = monto;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(Integer proveedorId) {
        this.proveedorId = proveedorId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Object getMonto() {
        return monto;
    }

    public void setMonto(Object monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}