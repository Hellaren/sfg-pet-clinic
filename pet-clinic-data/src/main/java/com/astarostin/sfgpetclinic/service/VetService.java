package com.astarostin.sfgpetclinic.service;

import com.astarostin.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(long id);

    Set<Vet> findAll();

    Vet save(Vet owner);
}
