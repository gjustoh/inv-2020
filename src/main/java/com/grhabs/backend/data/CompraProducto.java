package com.grhabs.backend.data;

import java.time.OffsetDateTime;

/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class CompraProducto {

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer compraId;

    /**
     * 
     */
    private Integer productoId;

    /**
     * 
     */
    private OffsetDateTime fecha;

    /**
     * 
     */
    private Integer cantidad;

    /**
     * 
     */
    private Object montounitario;

    /**
     * 
     */
    private String estado;

    public CompraProducto(Integer id, Integer compraId, Integer productoId, OffsetDateTime fecha, Integer cantidad, Object montounitario, String estado) {
        this.id = id;
        this.compraId = compraId;
        this.productoId = productoId;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.montounitario = montounitario;
        this.estado = estado;
    }

    public CompraProducto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompraId() {
        return compraId;
    }

    public void setCompraId(Integer compraId) {
        this.compraId = compraId;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public OffsetDateTime getFecha() {
        return fecha;
    }

    public void setFecha(OffsetDateTime fecha) {
        this.fecha = fecha;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Object getMontounitario() {
        return montounitario;
    }

    public void setMontounitario(Object montounitario) {
        this.montounitario = montounitario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}