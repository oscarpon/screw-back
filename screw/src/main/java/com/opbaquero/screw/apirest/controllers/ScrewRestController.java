package com.opbaquero.screw.apirest.controllers;

import com.opbaquero.screw.apirest.ProductDTO;
import com.opbaquero.screw.apirest.ScrewApi;
import com.opbaquero.screw.apirest.mapper.ProductRestCustomMapper;
import com.opbaquero.screw.domain.entity.EAN;
import com.opbaquero.screw.domain.entity.Product;
import com.opbaquero.screw.domain.usecase.ScrewUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScrewRestController implements ScrewApi {


    @Autowired
    ScrewUseCase screwUseCase;

    @Autowired
    ProductRestCustomMapper productRestMapper;

    @Override
    public ResponseEntity<ProductDTO> getProductByEan(String code) {

        EAN ean = new EAN(code);
        Product product = this.screwUseCase.getProductByEan(ean);

        return ResponseEntity.ok(this.productRestMapper.asProductDTO(product));
    }
}
