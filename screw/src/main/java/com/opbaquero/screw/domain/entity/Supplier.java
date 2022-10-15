package com.opbaquero.screw.domain.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Supplier {

    @NonNull
    @Getter
    private Integer id;

    @NonNull
    @Getter
    private String name;

}
