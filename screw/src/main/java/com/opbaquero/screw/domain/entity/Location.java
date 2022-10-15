package com.opbaquero.screw.domain.entity;

import com.opbaquero.screw.domain.exception.LocationNotFound;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@RequiredArgsConstructor
public class Location {

    private static final String MERCADONA_ESPANA = "Mercadona España";

    private static final String MERCADONA_PORTUGAL = "Mercadona Portugal";

    private static final String ALMACENES = "Almacenes";

    private static final String OFICINAS_MERCADONA = "Oficinas Mercadona";

    private static final String COLMENAS = "Colmenas";

    @NonNull
    @Getter
    private Integer id;

    /**
     * Get the location name using the id.
     * @return the location name
     */
    public String getName(){
        if(this.id == 0){
            return COLMENAS;
        }else if(this.id == 9){
            return OFICINAS_MERCADONA;
        }else if(this.id == 8){
            return ALMACENES;
        }else if(this.id == 6){
            return MERCADONA_PORTUGAL;
        }else if (this.id >= 1 && this.id <= 5 ){
            return MERCADONA_ESPANA;
        }else{
            throw new LocationNotFound(this.id);
        }

    }

}
