package com.grhabs.backend.services;
import com.grhabs.backend.data.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
//    public List<Usuario> findAll(){usuario
//        return jdbcTemplate.query("SELECT * FROM usuarios",(rs,rowColum)->new Usuario(rs.getInt("idusuario"),rs.getString("usuario"),rs.getString("password"),rs.getInt("permiso_pagos"),rs.getInt("permiso_facturas"),rs.getInt("permiso_reportes"),rs.getInt("administrador"),rs.getString("skin")));
//    }
    public  Usuario getuser(String username){
        return jdbcTemplate.queryForObject("Select * from usuario where email LIKE ?",new Object[]{username},(rs,rsNum)->new Usuario(rs.getInt("id"),rs.getInt("rol_id"),rs.getString("nombre"),rs.getString("apellidos"),rs.getString("direccion"),rs.getString("telefono"),rs.getString("email"),rs.getString("password"),rs.getString("skin_url"),rs.getString("estado")));

    }
    public void updateUser(String password,String email){

        String query = "update usuario set password = ? where email =?";
        jdbcTemplate.update(query,new Object[]{password,email});
    }
}
