package com.opbaquero.screw.application.usecase;

import com.opbaquero.screw.domain.entity.EAN;
import com.opbaquero.screw.domain.entity.Product;
import com.opbaquero.screw.domain.exception.InvalidEanException;
import com.opbaquero.screw.domain.exception.ProductNotFoundException;
import com.opbaquero.screw.domain.exception.SupplierNotFoundException;
import com.opbaquero.screw.domain.usecase.ScrewUseCase;
import com.opbaquero.screw.fixtures.TestProductRepository;
import com.opbaquero.screw.fixtures.TestSupplierRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ScrewUseCaseTest {

    ScrewUseCase screwUseCase;

    @BeforeEach
    public void setUp(){
        this.screwUseCase = new ScrewUseCaseImpl(new TestProductRepository(), new TestSupplierRepository());
    }

    @Test
    void WhenIndicateValidEan_ThenReturnProduct(){
        Product product = this.screwUseCase.getProductByEan(new EAN("8437008160070"));
        assertThat(product).isNotNull();
        assertThat(product.getEAN()).isEqualTo("8437008160070");
        assertThat(product.getLocation().getName()).isEqualTo("Colmenas");
        assertThat(product.getLocation().getId()).isEqualTo(0);
        assertThat(product.getSupplier().getId()).isEqualTo(8437008);
        assertThat(product.getSupplier().getName()).isEqualTo("proveedor 1");
        assertThat(product.getName()).isEqualTo("producto");
    }

    @Test
    void WhenIndicateInValidEan_ThenThrowInvalidEanException(){
        assertThrows(InvalidEanException.class, () -> {
            this.screwUseCase.getProductByEan(new EAN("8437008160077"));
        });
    }

    @Test
    void WhenIndicateInValidEan_ThenThrowProductNotFoundException(){
        assertThrows(ProductNotFoundException.class, () -> {
            this.screwUseCase.getProductByEan(new EAN("8437008160080"));
        });
    }

    @Test
    void WhenIndicateInValidEan_ThenSupplierNotFoundException(){
        assertThrows(SupplierNotFoundException.class, () -> {
            this.screwUseCase.getProductByEan(new EAN("8437012160070"));
        });
    }


}
