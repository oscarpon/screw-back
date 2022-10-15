package com.opbaquero.screw.apirest.mapper;

import com.opbaquero.screw.apirest.LocationDTO;
import com.opbaquero.screw.domain.entity.Location;
import org.springframework.stereotype.Component;

@Component
public class LocationRestMapper {

    public LocationDTO asLocationDTO(Location src){
        return new LocationDTO().id(src.getId()).name(src.getName());
    }

}
