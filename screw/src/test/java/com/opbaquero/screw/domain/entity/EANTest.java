package com.opbaquero.screw.domain.entity;

import com.opbaquero.screw.domain.exception.InvalidEanException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EANTest {

    @Test
    void WhenInvalidEAN_ThenReturnFalse(){
        EAN ean = new EAN("8437008160077");
        assertThat(ean.isValid()).isFalse();
        assertThrows(InvalidEanException.class, ean::getSupplierId);
    }

    @Test
    void WhenValidEAN_ThenReturnTrue(){
        EAN ean = new EAN("8437008160076");
        assertThat(ean.isValid()).isTrue();
        assertThat(ean.getLocationId()).isEqualTo(6);
        assertThat(ean.getSupplierId()).isEqualTo(8437008);
        assertThat(ean.getProductId()).isEqualTo(16007);
    }

    @Test
    void WhenInvalidEANWithLeter_ThenReturnFalse(){
        EAN ean = new EAN("8a37008160076");
        assertThat(ean.isValid()).isFalse();
        assertThrows(InvalidEanException.class, ean::getSupplierId);
    }

}
