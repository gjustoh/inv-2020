package com.grhabs.backend.data;


/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class Image {

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer productoId;

    /**
     * 
     */
    private String imageUrl;

    /**
     * 
     */
    private String estado;

    public Image() {
    }

    public Image(Integer id, Integer productoId, String imageUrl, String estado) {
        this.id = id;
        this.productoId = productoId;
        this.imageUrl = imageUrl;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}