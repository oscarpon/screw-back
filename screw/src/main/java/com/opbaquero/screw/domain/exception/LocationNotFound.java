package com.opbaquero.screw.domain.exception;

public class LocationNotFound extends RuntimeException{

    public LocationNotFound(Integer id){
        super("Location with id :" + id + " not exists");
    }

}
