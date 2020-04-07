package com.grhabs.backend.data;

import java.time.OffsetDateTime;

/**
 * 
 * @author toby troyano
 * Create at 2020-04-07 13:22
 */
public class PedidoProducto {

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer pedidoId;

    /**
     * 
     */
    private Integer productoId;

    /**
     * 
     */
    private Integer cantidad;

    /**
     * 
     */
    private Object importe;

    /**
     * 
     */
    private Object punitario;

    /**
     * 
     */
    private OffsetDateTime fecha;

    /**
     * 
     */
    private String estado;
}