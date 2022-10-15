package com.opbaquero.screw.apirest.exception;

import com.opbaquero.screw.apirest.ErrorObjectDTO;
import com.opbaquero.screw.apirest.Model400BadRequestErrorDTO;
import com.opbaquero.screw.apirest.Model404NotFoundErrorDTO;
import com.opbaquero.screw.domain.exception.InvalidEanException;
import com.opbaquero.screw.domain.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class InvalidEanExceptionHandler {

    @ExceptionHandler({InvalidEanException.class})
    public ResponseEntity<Model400BadRequestErrorDTO> handlerApiResquestException(final InvalidEanException ex){
        final ErrorObjectDTO error = new ErrorObjectDTO().code(HttpStatus.BAD_REQUEST.toString()).description("Invalid EAN").message(ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.APPLICATION_JSON).body(new Model400BadRequestErrorDTO().addErrorsItem(error));
    }

}
