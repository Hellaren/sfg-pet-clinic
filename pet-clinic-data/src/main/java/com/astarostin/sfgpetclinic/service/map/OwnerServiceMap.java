package com.astarostin.sfgpetclinic.service.map;

import com.astarostin.sfgpetclinic.model.Owner;
import com.astarostin.sfgpetclinic.service.OwnerService;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Service
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
