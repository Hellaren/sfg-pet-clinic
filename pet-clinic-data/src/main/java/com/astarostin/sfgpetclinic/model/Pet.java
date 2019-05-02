package com.astarostin.sfgpetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
public class Pet extends BaseEntity {
    private PetType petType;

    private Owner owner;

    private LocalDate birthDate;
}
