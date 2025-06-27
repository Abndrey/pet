package com.mypet2.pet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController( value = "")
@RequestMapping(value = "/responsavel")
public class ResponsavelController {

    @GetMapping( value = "/")
    public void imprimir() {
        System.out.println("chamou o método imprimir");
    }

}
