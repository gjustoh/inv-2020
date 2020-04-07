package com.grhabs.backend.data;


/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class Pedido {

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
    private Integer clienteId;

    /**
     * 
     */
    private Integer cantidad;

    /**
     * 
     */
    private Object descuento;

    /**
     * 
     */
    private Object pbruto;

    /**
     * 
     */
    private String estado;

    public Pedido() {
    }

    public Pedido(Integer id, Integer usuarioId, Integer clienteId, Integer cantidad, Object descuento, Object pbruto, String estado) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.clienteId = clienteId;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.pbruto = pbruto;
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

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Object getDescuento() {
        return descuento;
    }

    public void setDescuento(Object descuento) {
        this.descuento = descuento;
    }

    public Object getPbruto() {
        return pbruto;
    }

    public void setPbruto(Object pbruto) {
        this.pbruto = pbruto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}