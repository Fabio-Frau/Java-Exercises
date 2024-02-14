package com.fabiofrau.Exercise5;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/")
public class Controller {

    private Environment environment;

    public Controller(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/dev")
    public String getDev() {
        return environment.getProperty("devName");
    }

}
