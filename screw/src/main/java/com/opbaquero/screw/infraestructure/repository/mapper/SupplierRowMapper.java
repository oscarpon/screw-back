package com.opbaquero.screw.infraestructure.repository.mapper;

import com.opbaquero.screw.domain.entity.Supplier;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SupplierRowMapper implements RowMapper<Supplier> {

    @Override
    public Supplier mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Supplier(rs.getInt("id_suppliers"), rs.getString("name_suppliers"));
    }
}
