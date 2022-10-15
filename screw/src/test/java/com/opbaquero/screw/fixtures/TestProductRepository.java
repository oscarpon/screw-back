package com.opbaquero.screw.fixtures;

import com.opbaquero.screw.domain.entity.Product;
import com.opbaquero.screw.domain.exception.ProductNotFoundException;
import com.opbaquero.screw.domain.repository.ProductRepository;

public class TestProductRepository implements ProductRepository {
    @Override
    public Product findProductById(Integer id) {
        if(id <= 16007){
            return buildProduct(id, "producto");
        }else{
            throw new ProductNotFoundException(id);
        }
    }

    private Product buildProduct(Integer id, String name){
        return new Product(id, name);
    }

}
