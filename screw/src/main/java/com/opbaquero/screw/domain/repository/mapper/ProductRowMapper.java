package com.opbaquero.screw.domain.repository.mapper;

import com.opbaquero.screw.domain.entity.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product(rs.getInt("id_products"), rs.getString("name_product"));
        return product;
    }
}
