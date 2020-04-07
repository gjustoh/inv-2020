package com.grhabs.backend.data;

/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class Producto {

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer categoriaId;

    /**
     * 
     */
    private Integer almacenId;

    /**
     * 
     */
    private Integer atributoValorId;

    /**
     * 
     */
    private Integer marcaId;

    /**
     * 
     */
    private Integer unidadId;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String codigo;

    /**
     * 
     */
    private String descripcion;

    /**
     * 
     */
    private Integer cantidad;

    /**
     * 
     */
    private Object preciocompra;

    /**
     * 
     */
    private Object precioventa;

    /**
     * 
     */
    private Integer existenciaminima;

    /**
     * 
     */
    private String estado;

    public Producto() {
    }

    public Producto(Integer id, Integer categoriaId, Integer almacenId, Integer atributoValorId, Integer marcaId, Integer unidadId, String nombre, String codigo, String descripcion, Integer cantidad, Object preciocompra, Object precioventa, Integer existenciaminima, String estado) {
        this.id = id;
        this.categoriaId = categoriaId;
        this.almacenId = almacenId;
        this.atributoValorId = atributoValorId;
        this.marcaId = marcaId;
        this.unidadId = unidadId;
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.existenciaminima = existenciaminima;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Integer getAlmacenId() {
        return almacenId;
    }

    public void setAlmacenId(Integer almacenId) {
        this.almacenId = almacenId;
    }

    public Integer getAtributoValorId() {
        return atributoValorId;
    }

    public void setAtributoValorId(Integer atributoValorId) {
        this.atributoValorId = atributoValorId;
    }

    public Integer getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Integer marcaId) {
        this.marcaId = marcaId;
    }

    public Integer getUnidadId() {
        return unidadId;
    }

    public void setUnidadId(Integer unidadId) {
        this.unidadId = unidadId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Object getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(Object preciocompra) {
        this.preciocompra = preciocompra;
    }

    public Object getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(Object precioventa) {
        this.precioventa = precioventa;
    }

    public Integer getExistenciaminima() {
        return existenciaminima;
    }

    public void setExistenciaminima(Integer existenciaminima) {
        this.existenciaminima = existenciaminima;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}