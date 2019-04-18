package com.astarostin.sfgpetclinic.service.map;

import com.astarostin.sfgpetclinic.model.Vet;
import com.astarostin.sfgpetclinic.service.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
