package com.grhabs.backend.data;

public class Producto {
    private int idproducto;
    private String  codigo;
    private String descripcion;
    private int idcategoria;
    private String notas;
    private String imagen;
    private float preciocompra;
    private float precioventa;
    private float existenciamin;
    private int presentacion1;
    private int presentacion2;
    private float factorconv;

    public Producto() {
    }

    public Producto(int idproducto, String codigo, String descripcion, int idcategoria, String notas, String imagen, float preciocompra, float precioventa, float existenciamin, int presentacion1, int presentacion2, float factorconv) {
        this.idproducto = idproducto;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.idcategoria = idcategoria;
        this.notas = notas;
        this.imagen = imagen;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.existenciamin = existenciamin;
        this.presentacion1 = presentacion1;
        this.presentacion2 = presentacion2;
        this.factorconv = factorconv;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public float getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(float preciocompra) {
        this.preciocompra = preciocompra;
    }

    public float getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(float precioventa) {
        this.precioventa = precioventa;
    }

    public float getExistenciamin() {
        return existenciamin;
    }

    public void setExistenciamin(float existenciamin) {
        this.existenciamin = existenciamin;
    }

    public int getPresentacion1() {
        return presentacion1;
    }

    public void setPresentacion1(int presentacion1) {
        this.presentacion1 = presentacion1;
    }

    public int getPresentacion2() {
        return presentacion2;
    }

    public void setPresentacion2(int presentacion2) {
        this.presentacion2 = presentacion2;
    }

    public float getFactorconv() {
        return factorconv;
    }

    public void setFactorconv(float factorconv) {
        this.factorconv = factorconv;
    }
}
