package com.opbaquero.screw.apirest.mapper;

import com.opbaquero.screw.apirest.SupplierDTO;
import com.opbaquero.screw.domain.entity.Supplier;
import org.springframework.stereotype.Component;

@Component
public class SupplierRestMapper {

    public SupplierDTO asSupplierDTO(Supplier supplier){
        return new SupplierDTO().id(supplier.getId()).name(supplier.getName());
    }

}
