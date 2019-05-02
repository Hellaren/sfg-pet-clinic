package com.astarostin.sfgpetclinic.service.map;

import com.astarostin.sfgpetclinic.model.Owner;
import com.astarostin.sfgpetclinic.service.OwnerService;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        throw new NotImplementedException();
    }
}
