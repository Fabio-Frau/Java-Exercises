package com.fabiofrau.Exercise9.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class BasicController {


    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @GetMapping
    public String hello() {

        return "Hello users";
    }

    @GetMapping("/exp")
}
