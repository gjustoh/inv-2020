package com.grhabs.backend.data;

import java.util.Date;

public class Factura {
    private int idfactura;
    private int factura;
    private float monto;
    private int iddirectorio;
    private Date fecha;
    private int pagosprogramados;

    public Factura() {
    }

    public Factura(int idfactura, int factura, float monto, int iddirectorio, Date fecha, int pagosprogramados) {
        this.idfactura = idfactura;
        this.factura = factura;
        this.monto = monto;
        this.iddirectorio = iddirectorio;
        this.fecha = fecha;
        this.pagosprogramados = pagosprogramados;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getIddirectorio() {
        return iddirectorio;
    }

    public void setIddirectorio(int iddirectorio) {
        this.iddirectorio = iddirectorio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPagosprogramados() {
        return pagosprogramados;
    }

    public void setPagosprogramados(int pagosprogramados) {
        this.pagosprogramados = pagosprogramados;
    }
}
