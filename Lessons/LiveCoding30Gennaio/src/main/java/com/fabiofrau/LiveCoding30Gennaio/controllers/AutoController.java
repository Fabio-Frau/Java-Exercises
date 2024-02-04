package com.fabiofrau.LiveCoding30Gennaio.controllers;

import com.fabiofrau.LiveCoding30Gennaio.entities.AutoEntity;
import com.fabiofrau.LiveCoding30Gennaio.repositories.AutoRepository;
import com.fabiofrau.LiveCoding30Gennaio.services.AutoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/autos")
public class AutoController {

        private AutoService autoService;

    public AutoController(AutoService autoService) {

        this.autoService = autoService;
    }

    @PostMapping("/auto")
    public AutoEntity create(@RequestBody AutoEntity auto) {
        auto.setId(null);
        return autoService.convertCvToKw(auto);
    }



}
