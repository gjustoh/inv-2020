package com.grhabs.app;

import com.grhabs.backend.data.Usuario;

@FunctionalInterface
public interface UsuarioActual {
    Usuario getUser();
}
