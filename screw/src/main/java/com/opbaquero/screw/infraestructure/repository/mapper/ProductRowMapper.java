package com.opbaquero.screw.infraestructure.repository.mapper;

import com.opbaquero.screw.domain.entity.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Product(rs.getInt("id_products"), rs.getString("name_product"));
    }
}
