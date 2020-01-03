package com.grhabs.backend.data;

public class Usuario {
    private int  idusuario;
    private String usuario;
    private String password;
    private int permiso_pagos;
    private int permiso_facturas;
    private int permiso_reportes;
    private int administrador;
    private String skin;

    public Usuario() {
    }

    public Usuario(int idusuario, String usuario, String password, int permiso_pagos, int permiso_facturas, int permiso_reportes,int adminastrador, String skin) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.password = password;
        this.permiso_pagos = permiso_pagos;
        this.permiso_facturas = permiso_facturas;
        this.permiso_reportes = permiso_reportes;
        this.administrador =adminastrador;
        this.skin = skin;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPermiso_pagos() {
        return permiso_pagos;
    }

    public void setPermiso_pagos(int permiso_pagos) {
        this.permiso_pagos = permiso_pagos;
    }

    public int getPermiso_facturas() {
        return permiso_facturas;
    }

    public void setPermiso_facturas(int permiso_facturas) {
        this.permiso_facturas = permiso_facturas;
    }

    public int getPermiso_reportes() {
        return permiso_reportes;
    }

    public void setPermiso_reportes(int permiso_reportes) {
        this.permiso_reportes = permiso_reportes;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getAdministrador() {
        return administrador;
    }

    public void setAdministrador(int administrador) {
        this.administrador = administrador;
    }
}
