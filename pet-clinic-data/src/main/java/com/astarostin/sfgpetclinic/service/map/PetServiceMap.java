package com.astarostin.sfgpetclinic.service.map;

import com.astarostin.sfgpetclinic.model.Pet;
import com.astarostin.sfgpetclinic.service.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
