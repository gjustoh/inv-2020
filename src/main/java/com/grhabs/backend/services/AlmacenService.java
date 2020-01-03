package com.grhabs.backend.services;
import com.grhabs.backend.data.Almacen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlmacenService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Almacen> findAll(){
        return jdbcTemplate.query("SELECT * FROM almacen",(rs,rowColum)->new Almacen(rs.getInt("idmovimiento"),rs.getInt("iddirectorio"),rs.getInt("idproducto"),rs.getFloat("cantidad"),rs.getInt("idpresentacion"),rs.getDate("fecha"),rs.getInt("entrada"),rs.getInt("salida"),rs.getInt("idpedido"),rs.getInt("pedido"),rs.getInt("factura"),rs.getDate("fechafactura")));
    }
}
