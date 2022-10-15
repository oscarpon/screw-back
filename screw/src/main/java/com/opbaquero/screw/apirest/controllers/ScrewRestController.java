package com.opbaquero.screw.apirest.controllers;

import com.opbaquero.screw.apirest.ProductDTO;
import com.opbaquero.screw.apirest.ScrewApi;
import com.opbaquero.screw.domain.entity.Product;
import com.opbaquero.screw.domain.usecase.ScrewUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScrewRestController implements ScrewApi {


    @Autowired
    ScrewUseCase screwUseCase;

    @Override
    public ResponseEntity<ProductDTO> getProductByEan(String EAN) {

        Product product = this.screwUseCase.getProductByEan(EAN);

        return null;
    }
}
