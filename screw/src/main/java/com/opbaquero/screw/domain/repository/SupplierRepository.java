package com.opbaquero.screw.domain.repository;

import com.opbaquero.screw.domain.entity.Supplier;

import java.util.List;
import java.util.Optional;

public interface SupplierRepository {

    List<Supplier> getAllSuppliers();

    Optional<Supplier> getSupplierById(Integer supplierId);

}
