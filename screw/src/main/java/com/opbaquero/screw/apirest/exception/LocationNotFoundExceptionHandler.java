package com.opbaquero.screw.apirest.exception;


import com.opbaquero.screw.apirest.ErrorObjectDTO;
import com.opbaquero.screw.apirest.Model404NotFoundErrorDTO;
import com.opbaquero.screw.domain.exception.LocationNotFound;
import com.opbaquero.screw.domain.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class LocationNotFoundExceptionHandler {

    @ExceptionHandler({LocationNotFound.class})
    public ResponseEntity<Model404NotFoundErrorDTO> handlerApiResquestException(final LocationNotFound ex){
        final ErrorObjectDTO error = new ErrorObjectDTO().code(HttpStatus.NOT_FOUND.toString()).description("Location not found").message(ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).contentType(MediaType.APPLICATION_JSON).body(new Model404NotFoundErrorDTO().addErrorsItem(error));
    }

}
