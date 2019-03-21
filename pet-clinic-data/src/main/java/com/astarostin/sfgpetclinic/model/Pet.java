package com.astarostin.sfgpetclinic.model;

import lombok.Generated;

import java.time.LocalDate;

@Generated
public class Pet extends BaseEntity {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
