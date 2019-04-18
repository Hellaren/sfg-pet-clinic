package com.astarostin.sfgpetclinic.service;

import com.astarostin.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
