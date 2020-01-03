package com.grhabs.backend.services;
import com.grhabs.backend.data.Almacen;
import com.grhabs.backend.data.Presentacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PresentacionService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Presentacion> findAll(){
        return jdbcTemplate.query("SELECT * FROM presentaciones",(rs,rowColum)->new Presentacion(rs.getInt("idpresentacion"),rs.getString("presentacion")));
    }
}
