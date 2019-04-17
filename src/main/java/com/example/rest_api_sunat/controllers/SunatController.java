package com.example.rest_api_sunat.controllers;


import com.example.rest_api_sunat.model.Algoritmo;
import com.example.rest_api_sunat.model.PruebaTCambio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.text.ParseException;

@RestController
public class SunatController {


    @RequestMapping("/cambio")
    public PruebaTCambio getCambio(@RequestParam(value = "fecha" ,defaultValue = "") String fecha) throws MalformedURLException, ParseException {
        return new Algoritmo().dolares_a_soles(fecha);
    }

}
