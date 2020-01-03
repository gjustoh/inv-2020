package com.grhabs.backend.services;
import com.grhabs.backend.data.Almacen;
import com.grhabs.backend.data.Directorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DirectorioService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Directorio> findAll(){
        return jdbcTemplate.query("SELECT * FROM directorio",(rs,rowColum)->new Directorio(rs.getInt("iddirectorio"),rs.getString("nombre"),rs.getString("direccion"),rs.getString("telefonos"),rs.getString("colonia"),rs.getInt("codigopostal"),rs.getString("ciudadestado"),rs.getString("notas"),rs.getInt("escliente"),rs.getInt("esproveedor"),rs.getString("email")));
    }
}
