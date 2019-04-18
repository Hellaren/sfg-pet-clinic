package com.astarostin.sfgpetclinic.service.map;

import com.astarostin.sfgpetclinic.model.Owner;
import com.astarostin.sfgpetclinic.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
