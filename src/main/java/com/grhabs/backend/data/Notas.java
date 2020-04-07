package com.grhabs.backend.data;

import java.time.OffsetDateTime;

/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class Notas {

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer productoId;

    /**
     * 
     */
    private Integer usuarioId;

    /**
     * 
     */
    private OffsetDateTime fecha;

    /**
     * 
     */
    private String descripcion;

    /**
     * 
     */
    private String estado;

    public Notas() {
    }

    public Notas(Integer id, Integer productoId, Integer usuarioId, OffsetDateTime fecha, String descripcion, String estado) {
        this.id = id;
        this.productoId = productoId;
        this.usuarioId = usuarioId;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public OffsetDateTime getFecha() {
        return fecha;
    }

    public void setFecha(OffsetDateTime fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}