package com.astarostin.sfgpetclinic.service;

import com.astarostin.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(long id);

    Set<Owner> findAll();

    Owner save(Owner owner);
}
