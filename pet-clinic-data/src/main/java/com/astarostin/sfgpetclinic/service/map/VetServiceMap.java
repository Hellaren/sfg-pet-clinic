package com.astarostin.sfgpetclinic.service.map;

import com.astarostin.sfgpetclinic.model.Vet;
import com.astarostin.sfgpetclinic.service.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
