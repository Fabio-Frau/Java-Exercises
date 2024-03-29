package com.fabiofrau.TestControllers.controllers;

import com.fabiofrau.TestControllers.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/")
    public @ResponseBody String helloWorld() {
        return "Hello world";
    }

    @GetMapping("/user")
    public @ResponseBody User getUser() {
        return new User("Fabio", "Frau");
    }

}
