package com.opbaquero.screw.application.usecase;

import com.opbaquero.screw.domain.entity.EAN;
import com.opbaquero.screw.domain.entity.Location;
import com.opbaquero.screw.domain.entity.Product;
import com.opbaquero.screw.domain.entity.Supplier;
import com.opbaquero.screw.domain.exception.SupplierNotFoundException;
import com.opbaquero.screw.domain.repository.ProductRepository;
import com.opbaquero.screw.domain.repository.SupplierRepository;
import com.opbaquero.screw.domain.usecase.ScrewUseCase;
import org.springframework.stereotype.Component;


import java.util.Optional;

@Component
public class ScrewUseCaseImpl implements ScrewUseCase {

    final ProductRepository productRepository;

    final SupplierRepository supplierRepository;

    public ScrewUseCaseImpl(ProductRepository productRepository, SupplierRepository supplierRepository) {
        this.productRepository = productRepository;
        this.supplierRepository = supplierRepository;
    }

    @Override
    public Product getProductByEan(EAN ean) {

        Product product = this.productRepository.findProductById(ean.getProductId());
        Optional<Supplier> supplier = this.supplierRepository.getSupplierById(ean.getSupplierId());

        if(supplier.isPresent()){
            product.setSupplier(supplier.get());
        }else{
            throw new SupplierNotFoundException(ean.getSupplierId());
        }

        Location location = new Location(ean.getLocationId());
        product.setLocation(location);

        return product;
    }

}
