package com.opbaquero.screw.domain.repository;

import com.opbaquero.screw.domain.entity.Product;

public interface ProductRepository {

    Product findProductById(Integer id);

}
