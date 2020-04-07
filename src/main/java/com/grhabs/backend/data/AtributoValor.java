package com.grhabs.backend.data;


/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class AtributoValor {

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer atributoId;

    /**
     * 
     */
    private String valor;

    /**
     * 
     */
    private String estado;

    public AtributoValor() {
    }

    public AtributoValor(Integer id, Integer atributoId, String valor, String estado) {
        this.id = id;
        this.atributoId = atributoId;
        this.valor = valor;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAtributoId() {
        return atributoId;
    }

    public void setAtributoId(Integer atributoId) {
        this.atributoId = atributoId;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}