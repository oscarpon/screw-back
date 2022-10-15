package com.opbaquero.screw.domain.exception;

public class SupplierNotFoundException extends RuntimeException{

    public SupplierNotFoundException(Integer id){
        super("El proveedor con id: " + id + " no se encuentra en BBDD");
    }

}
