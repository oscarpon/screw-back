package com.opbaquero.screw.domain.entity;

import lombok.*;

import javax.persistence.*;

@RequiredArgsConstructor
public class Product {

    @NonNull
    @Getter
    private Integer id;

    @NonNull
    @Getter
    private String name;

    @Setter
    @Getter
    private Location location;

    @Setter
    @Getter
    private Supplier supplier;

    public String getEAN(){
        return String.valueOf(this.supplier.getId()) +
                this.id +
                this.location.getId();
    }

}
