package com.grhabs.backend.services;

import com.grhabs.backend.data.Distrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DistritoService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Distrito>  findDepProvAll (){
        String query="SELECT pro.nombre, dep.nombre, dis.id,  dis.nombre FROM provincia pro, departamento dep,  distrito dis WHERE  dis.provincia_id=pro.id AND dis.departamento_id=dep.id";

        return jdbcTemplate.query(query,new DistritoVO());
    }
    public List<Distrito> findAll(){

        return jdbcTemplate.query("select * from distrito",(rs,rowColumn)->new Distrito(rs.getString("id"),rs.getString("nombre"),rs.getString("provincia_id"),rs.getString("departamento_id" )));
    }


}