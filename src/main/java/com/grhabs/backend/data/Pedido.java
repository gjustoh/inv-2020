package com.grhabs.backend.data;

import java.util.Date;

public class Pedido {
    private int idpedido;
    private int pedido;
    private Date fecha;
    private int iddirectorio;
    private int idproducto;
    private float cantidad;
    private int idpresentacion;
    private int descuento;
    private int remision;
    private Date fecharemision;
    private int factura;
    private Date fechafactura;
    private float pbruto;
    private float punitario;

    public Pedido() {
    }

    public Pedido(int idpedido, int pedido, Date fecha, int iddirectorio, int idproducto, float cantidad, int idpresentacion, int descuento, int remision, Date fecharemision, int factura, Date fechafactura, float pbruto, float punitario) {
        this.idpedido = idpedido;
        this.pedido = pedido;
        this.fecha = fecha;
        this.iddirectorio = iddirectorio;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.idpresentacion = idpresentacion;
        this.descuento = descuento;
        this.remision = remision;
        this.fecharemision = fecharemision;
        this.factura = factura;
        this.fechafactura = fechafactura;
        this.pbruto = pbruto;
        this.punitario = punitario;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIddirectorio() {
        return iddirectorio;
    }

    public void setIddirectorio(int iddirectorio) {
        this.iddirectorio = iddirectorio;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdpresentacion() {
        return idpresentacion;
    }

    public void setIdpresentacion(int idpresentacion) {
        this.idpresentacion = idpresentacion;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getRemision() {
        return remision;
    }

    public void setRemision(int remision) {
        this.remision = remision;
    }

    public Date getFecharemision() {
        return fecharemision;
    }

    public void setFecharemision(Date fecharemision) {
        this.fecharemision = fecharemision;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public Date getFechafactura() {
        return fechafactura;
    }

    public void setFechafactura(Date fechafactura) {
        this.fechafactura = fechafactura;
    }

    public float getPbruto() {
        return pbruto;
    }

    public void setPbruto(float pbruto) {
        this.pbruto = pbruto;
    }

    public float getPunitario() {
        return punitario;
    }

    public void setPunitario(float punitario) {
        this.punitario = punitario;
    }
}
