package com.example.rest_api_sunat.controllers;


import com.example.rest_api_sunat.model.Algoritmo;
import com.example.rest_api_sunat.model.PruebaTCambio;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
import java.text.ParseException;

@RestController
public class SunatController {



    @GetMapping("/")
    public String hello()
    {
        return "index";
    }


    @GetMapping("/cambio/{fecha}")
    public PruebaTCambio getCambio(@PathVariable String fecha) throws MalformedURLException, ParseException {
        return new Algoritmo().dolares_a_soles(fecha);
    }

}
