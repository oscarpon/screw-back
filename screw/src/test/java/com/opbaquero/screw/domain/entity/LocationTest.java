package com.opbaquero.screw.domain.entity;

import com.opbaquero.screw.domain.exception.LocationNotFound;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LocationTest {

    @Test
    void GivenLocationIdWithIdFromEspana_ThenGetCorrectName(){
        Location location = new Location(1);
        assertThat(location.getName()).isEqualTo("Mercadona España");
    }

    @Test
    void GivenLocationIdWithId2FromEspana_ThenGetCorrectName(){
        Location location = new Location(2);
        assertThat(location.getName()).isEqualTo("Mercadona España");
    }

    @Test
    void GivenLocationIdWithId5FromEspana_ThenGetCorrectName(){
        Location location = new Location(5);
        assertThat(location.getName()).isEqualTo("Mercadona España");
    }

    @Test
    void GivenLocationIdWithIdFromPortugal_ThenReturnCorrectName(){
        Location location = new Location(6);
        assertThat(location.getName()).isEqualTo("Mercadona Portugal");
    }

    @Test
    void GivenLocationIdWithIdFromAlmacenes_ThenReturnCorrectName(){
        Location location = new Location(8);
        assertThat(location.getName()).isEqualTo("Almacenes");
    }

    @Test
    void GivenLocationIdWithIdFromOficinas_ThenReturnCorrectName(){
        Location location = new Location(9);
        assertThat(location.getName()).isEqualTo("Oficinas Mercadona");
    }

    @Test
    void GivenLocationIdWithIdFromColmenas_ThenReturnCorrectName(){
        Location location = new Location(0);
        assertThat(location.getName()).isEqualTo("Colmenas");
    }

    @Test
    void GivenInvalidId_ThenThrowException(){
        assertThrows(LocationNotFound.class, () -> {
            Location location = new Location(7);
            location.getName();
        });
    }

}
