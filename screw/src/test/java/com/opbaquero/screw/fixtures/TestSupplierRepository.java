package com.opbaquero.screw.fixtures;

import com.opbaquero.screw.domain.entity.Supplier;
import com.opbaquero.screw.domain.repository.SupplierRepository;

import java.util.List;
import java.util.Optional;

public class TestSupplierRepository implements SupplierRepository {
    @Override
    public List<Supplier> getAllSuppliers() {
        return buildSuppliers();
    }

    @Override
    public Optional<Supplier> getSupplierById(Integer supplierId) {
        return this.getAllSuppliers().stream().filter(s -> s.getId().equals(supplierId)).findFirst();
    }

    private List<Supplier> buildSuppliers(){
        Supplier supplier = new Supplier(8437008, "proveedor 1");
        Supplier supplier1 = new Supplier(8437009, "proveedor 2");
        Supplier supplier2 = new Supplier(8437010, "proveedor 3");
        Supplier supplier3 = new Supplier(8437011, "proveedor 4");
        return List.of(supplier1, supplier2, supplier3, supplier);
    }

}
