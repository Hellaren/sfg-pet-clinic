package com.astarostin.sfgpetclinic.service;

import com.astarostin.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(long id);

    Set<Pet> findAll();

    Pet save(Pet owner);
}
