package com.opbaquero.screw.infraestructure.repository;

import com.opbaquero.screw.domain.entity.Supplier;
import com.opbaquero.screw.domain.repository.SupplierRepository;
import com.opbaquero.screw.infraestructure.repository.mapper.ProductRowMapper;
import com.opbaquero.screw.infraestructure.repository.mapper.SupplierRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class JdbcSuppliersRepositoryCustom implements SupplierRepository {

    @Value("${suppliers.findAllSuppliers}")
    private String findAllSuppliers;

    @Autowired
    @Qualifier("mySqlParameterJdbcTemplate")
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    @Cacheable
    public List<Supplier> getAllSuppliers() {

        List<Supplier> suppliers;

        suppliers = this.namedParameterJdbcTemplate.query(this.findAllSuppliers, new SupplierRowMapper());

        return suppliers;
    }

    @Override
    public Optional<Supplier> getSupplierById(Integer supplierId) {
        List<Supplier> supplierList = this.getAllSuppliers();
        return supplierList.stream().filter(s -> s.getId().equals(supplierId)).findFirst();
    }
}
