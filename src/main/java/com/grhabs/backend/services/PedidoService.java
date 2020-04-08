package com.grhabs.backend.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PedidoService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
/*    public List<Pedido> findAll(){
        return jdbcTemplate.query("SELECT * FROM pedidos",(rs,rowColum)->new Pedido(rs.getInt("idpedido"),rs.getInt("pedido"),rs.getDate("fecha"),rs.getInt("iddirectorio"),rs.getInt("idproducto"),rs.getFloat("cantidad"),rs.getInt("idpresentacion"),rs.getInt("descuento"),rs.getInt("remision"),rs.getDate("fecharemision"),rs.getInt("factura"),rs.getDate("fechafactura"),rs.getFloat("pbruto"),rs.getFloat("punitario")));
    }*/
}
