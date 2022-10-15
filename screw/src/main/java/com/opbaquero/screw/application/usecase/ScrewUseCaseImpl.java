package com.opbaquero.screw.application.usecase;

import com.opbaquero.screw.domain.entity.Location;
import com.opbaquero.screw.domain.entity.Product;
import com.opbaquero.screw.domain.repository.ProductRepository;
import com.opbaquero.screw.domain.usecase.ScrewUseCase;
import org.springframework.stereotype.Component;

@Component
public class ScrewUseCaseImpl implements ScrewUseCase {

    final ProductRepository productRepository;

    public ScrewUseCaseImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProductByEan(String ean) {

        String supplierId = ean.substring(0, 7);
        String productId = ean.substring(7, 12);
        String locationId = ean.substring(12, 13);

        Product product = this.productRepository.findProductById(Integer.valueOf(productId));

        Location location = new Location(Integer.valueOf(locationId));

        return null;
    }

}
