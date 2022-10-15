package com.opbaquero.screw.domain.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@RequiredArgsConstructor
public class Supplier {

    @NonNull
    @Getter
    private Integer id;

    @NonNull
    @Getter
    private String name;

}
