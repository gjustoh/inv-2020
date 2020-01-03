package com.grhabs.backend.data;

import java.util.Date;

public class Pago {
    private int idpago;
    private int factura;
    private int idcliente;
    private float cantidad;
    private Date fechapago;
    private int pagado;
    private String referencia;

    public Pago() {
    }

    public Pago(int idpago, int factura, int idcliente, float cantidad, Date fechapago, int pagado, String referencia) {
        this.idpago = idpago;
        this.factura = factura;
        this.idcliente = idcliente;
        this.cantidad = cantidad;
        this.fechapago = fechapago;
        this.pagado = pagado;
        this.referencia = referencia;
    }

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechapago() {
        return fechapago;
    }

    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }

    public int getPagado() {
        return pagado;
    }

    public void setPagado(int pagado) {
        this.pagado = pagado;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
