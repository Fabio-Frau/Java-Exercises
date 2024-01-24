package com.fabiofrau.LiveCoding24Gennaio.controllers;


import com.fabiofrau.LiveCoding24Gennaio.domain.Auto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/autos")
public class AutoController {

    private ArrayList<Auto> autos;


    @GetMapping
    public ArrayList<Auto> getAutos() {

    }

}
