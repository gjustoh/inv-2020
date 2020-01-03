package com.grhabs.backend.services;
import com.grhabs.backend.data.Almacen;
import com.grhabs.backend.data.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FacturaService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Factura> findAll(){
        return jdbcTemplate.query("SELECT * FROM facturas",(rs,rowColum)->new Factura(rs.getInt("idfactura"),rs.getInt("factura"),rs.getFloat("monto"),rs.getInt("iddirectorio"),rs.getDate("fecha"),rs.getInt("pagosprogramados")));
    }
}
