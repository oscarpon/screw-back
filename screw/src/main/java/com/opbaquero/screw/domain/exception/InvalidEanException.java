package com.opbaquero.screw.domain.exception;

public class InvalidEanException extends RuntimeException{

    public InvalidEanException(String code){
        super("Invalid ean :" + code );
    }

}
