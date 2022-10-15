package com.opbaquero.screw.apirest.controllers;

import com.opbaquero.screw.apirest.ProductDTO;
import com.opbaquero.screw.apirest.ScrewApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScrewRestController implements ScrewApi {
    @Override
    public ResponseEntity<ProductDTO> getProductByEan(String EAN) {
        return null;
    }
}
