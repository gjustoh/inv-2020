package com.grhabs.backend.services;

import com.grhabs.backend.data.Distrito;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DistritoVO implements RowMapper<Distrito> {

    @Override
    public Distrito mapRow(ResultSet rs, int rowNum) throws SQLException {
        Distrito distrito = new Distrito();
        distrito.setId(rs.getString("id"));
        distrito.setNombre(rs.getString("dis.nombre"));
        distrito.setProvincia_id(rs.getString("pro.nombre"));
        distrito.setDepartamento_id(rs.getString("dep.nombre" ));

        return distrito;
    }
}
