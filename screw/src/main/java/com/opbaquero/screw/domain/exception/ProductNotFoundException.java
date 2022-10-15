package com.opbaquero.screw.domain.exception;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(Integer id){
        super("El producto con el id: " + id + " no se encuentra en BBDD");
    }

}
