package com.grhabs.backend.services;
import com.grhabs.backend.data.Almacen;
import com.grhabs.backend.data.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductoService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Producto> findAll(){
        return jdbcTemplate.query("SELECT * FROM productos",(rs,rowColum)->new Producto(rs.getInt("idproducto"),rs.getString("codigo"),rs.getString("descripcion"),rs.getInt("idcategoria"),rs.getString("notas"),rs.getString("imagen"),rs.getFloat("preciocompra"),rs.getFloat("precioventa"),rs.getFloat("existenciamin"),rs.getInt("presentacion1"),rs.getInt("presentacion2"),rs.getFloat("factorconv")));
    }
}
