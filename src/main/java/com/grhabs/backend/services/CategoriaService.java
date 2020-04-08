package com.grhabs.backend.services;

import com.grhabs.backend.data.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoriaService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
   /* public List<Categoria> findAll(){
        return jdbcTemplate.query("SELECT  * FROM categorias",(rs, rowNum) ->new Categoria(rs.getInt("idcategoria"),rs.getString("categoria")));
    }
    public CategoriaService() {
    }*/
}
