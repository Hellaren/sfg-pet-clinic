package com.astarostin.sfgpetclinic.controllers;

import com.astarostin.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/vets"})
@Controller
public class VetsController {
    private final VetService vetService;

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/", "/index"})
    public String listOfVets(Model model)
    {
        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
