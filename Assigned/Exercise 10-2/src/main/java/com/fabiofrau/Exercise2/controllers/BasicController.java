package com.fabiofrau.Exercise2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {

    @GetMapping("/get")
    public String greet() {
        return "Welcome dear user";
    }

}
