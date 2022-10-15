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
    private Location location;

    @Setter
    private Supplier supplier;

}
