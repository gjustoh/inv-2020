package com.grhabs.backend.data;

import java.time.OffsetDateTime;

/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class PedidoProducto {

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer pedidoId;

    /**
     * 
     */
    private Integer productoId;

    /**
     * 
     */
    private Integer cantidad;

    /**
     * 
     */
    private Object importe;

    /**
     * 
     */
    private Object punitario;

    /**
     * 
     */
    private OffsetDateTime fecha;

    /**
     * 
     */
    private String estado;

    public PedidoProducto() {
    }

    public PedidoProducto(Integer id, Integer pedidoId, Integer productoId, Integer cantidad, Object importe, Object punitario, OffsetDateTime fecha, String estado) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.importe = importe;
        this.punitario = punitario;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Object getImporte() {
        return importe;
    }

    public void setImporte(Object importe) {
        this.importe = importe;
    }

    public Object getPunitario() {
        return punitario;
    }

    public void setPunitario(Object punitario) {
        this.punitario = punitario;
    }

    public OffsetDateTime getFecha() {
        return fecha;
    }

    public void setFecha(OffsetDateTime fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}