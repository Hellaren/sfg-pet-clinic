package com.astarostin.sfgpetclinic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class VetsController {

    @RequestMapping({"vets/", "vets/index"})
    public String listOfVets(){
        return "vets/index";
    }
}
