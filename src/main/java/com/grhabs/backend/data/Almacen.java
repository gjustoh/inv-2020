package com.grhabs.backend.data;

import java.util.Date;

public class Almacen {
    private int idmovimiento;
    private  int iddirectorio;
    private int idproducto;
    private float cantidad;
    private int idpresentacion;
    private Date fecha;
    private int entrada;
    private int salida;
    private int idpedido;
    private int pedido;
    private int factura;
    private Date fechafactura;
    public Almacen(){}
    public Almacen(int idmovimiento, int iddirectorio, int idproducto, float cantidad, int idpresentacion, Date fecha, int entrada, int salida, int idpedido, int pedido, int factura, Date fechafactura) {
        this.idmovimiento = idmovimiento;
        this.iddirectorio = iddirectorio;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.idpresentacion = idpresentacion;
        this.fecha = fecha;
        this.entrada = entrada;
        this.salida = salida;
        this.idpedido = idpedido;
        this.pedido = pedido;
        this.factura = factura;
        this.fechafactura = fechafactura;
    }

    public int getIdmovimiento() {
        return idmovimiento;
    }

    public void setIdmovimiento(int idmovimiento) {
        this.idmovimiento = idmovimiento;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
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
}
