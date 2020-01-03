package com.grhabs.backend.services;
import com.grhabs.backend.data.Almacen;
import com.grhabs.backend.data.Pago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PagoService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Pago> findAll(){
        return jdbcTemplate.query("SELECT * FROM pagos",(rs,rowColum)->new Pago(rs.getInt("idpago"),rs.getInt("factura"),rs.getInt("idcliente"),rs.getFloat("cantidad"),rs.getDate("fechapago"),rs.getInt("pagado"),rs.getString("referencia")));
    }
}
