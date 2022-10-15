package com.opbaquero.screw.infraestructure.repository;

import com.opbaquero.screw.domain.entity.Product;
import com.opbaquero.screw.domain.exception.ProductNotFoundException;
import com.opbaquero.screw.domain.repository.ProductRepository;
import com.opbaquero.screw.domain.repository.mapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcProductRepositoryCustom implements ProductRepository {

    @Value("${products.findProductById}")
    private String findProductById;

    @Autowired
    @Qualifier("mySqlParameterJdbcTemplate")
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    @Override
    public Product findProductById(Integer id) {
        final MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("productId", id);

        Product product = null;
        try{
            product = this.namedParameterJdbcTemplate.queryForObject(this.findProductById, parameterSource, new ProductRowMapper());
        } catch (EmptyResultDataAccessException e){
            throw new ProductNotFoundException(id);
        }


        return product;
    }
}
