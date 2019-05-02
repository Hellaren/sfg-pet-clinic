package com.astarostin.sfgpetclinic.bootstrap;

import com.astarostin.sfgpetclinic.model.Owner;
import com.astarostin.sfgpetclinic.model.Vet;
import com.astarostin.sfgpetclinic.service.map.OwnerServiceMap;
import com.astarostin.sfgpetclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final VetServiceMap vetService;
    private final OwnerServiceMap ownerService;

    public DataLoader(VetServiceMap vetService, OwnerServiceMap ownerService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner o1 = new Owner();
        o1.setId(1L);
        o1.setFirstName("John");
        o1.setLastName("Smith");
        ownerService.save(o1);

        Owner o2 = new Owner();
        o2.setId(2L);
        o2.setFirstName("Jane");
        o2.setLastName("Doe");
        ownerService.save(o2);

        System.out.println("Loaded owners...");

        Vet v1 = new Vet();
        v1.setId(1l);
        v1.setFirstName("Peter");
        v1.setLastName("Moore");
        vetService.save(v1);

        Vet v2 = new Vet();
        v2.setId(1l);
        v2.setFirstName("Jack");
        v2.setLastName("Stone");
        vetService.save(v2);

        System.out.println("Loaded vets");
    }
}
