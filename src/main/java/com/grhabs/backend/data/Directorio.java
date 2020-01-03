package com.grhabs.backend.data;

public class Directorio {
    private int iddirectorio;
    private String nombre;
    private String direccion;
    private String telefonos;
    private String colonia;
    private int codigopostal;
    private String ciudadestado;
    private String notas;
    private int escliente;
    private int esproveedor;
    private String email;

    public Directorio() {
    }

    public Directorio(int iddirectorio, String nombre, String direccion, String telefonos, String colonia, int codigopostal, String ciudadestado, String notas, int escliente, int esproveedor, String email) {
        this.iddirectorio = iddirectorio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.colonia = colonia;
        this.codigopostal = codigopostal;
        this.ciudadestado = ciudadestado;
        this.notas = notas;
        this.escliente = escliente;
        this.esproveedor = esproveedor;
        this.email = email;
    }

    public int getIddirectorio() {
        return iddirectorio;
    }

    public void setIddirectorio(int iddirectorio) {
        this.iddirectorio = iddirectorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(int codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getCiudadestado() {
        return ciudadestado;
    }

    public void setCiudadestado(String ciudadestado) {
        this.ciudadestado = ciudadestado;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public int getEscliente() {
        return escliente;
    }

    public void setEscliente(int escliente) {
        this.escliente = escliente;
    }

    public int getEsproveedor() {
        return esproveedor;
    }

    public void setEsproveedor(int esproveedor) {
        this.esproveedor = esproveedor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
