package com.fabiofrau.DIDemo.controllers;

import com.fabiofrau.DIDemo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



    @RestController
    public class HelloController {

        @Autowired
        private HelloService helloService;

        @GetMapping
        public String get() {
            return helloService.getHello();
        }

        @GetMapping("/pippo")
        public String getPippo() {
            return "Ciao mi chiamo Pippo";
        }

    }
