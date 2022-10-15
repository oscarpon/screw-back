package com.opbaquero.screw.apirest.mapper;

import com.opbaquero.screw.apirest.LocationDTO;
import com.opbaquero.screw.apirest.ProductDTO;
import com.opbaquero.screw.apirest.SupplierDTO;
import com.opbaquero.screw.domain.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductRestCustomMapper {

    @Autowired
    SupplierRestMapper supplierRestMapper;

    @Autowired
    LocationRestMapper locationRestMapper;

    public ProductDTO asProductDTO(Product src){
        LocationDTO locationDTO = this.locationRestMapper.asLocationDTO(src.getLocation());
        SupplierDTO supplierDTO = this.supplierRestMapper.asSupplierDTO(src.getSupplier());
        ProductDTO toRet = new ProductDTO().location(locationDTO).supplier(supplierDTO).name(src.getName()).ean(src.getEAN());
        return toRet;
    }

}
