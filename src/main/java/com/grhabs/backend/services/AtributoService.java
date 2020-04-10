package com.grhabs.backend.services;

import com.grhabs.backend.data.Atributo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtributoService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Atributo> findAll(){
        return jdbcTemplate.query("SELECT * FROM atributo",(rs,rowNum)->new Atributo(rs.getInt("id"),rs.getString("name"),rs.getString("estado")));
//        return jdbcTemplate.query("SELECT * FROM atributo",(rs,rowNum)->new Atributo());

    }
}
