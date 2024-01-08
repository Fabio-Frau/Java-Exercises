package com.fabiofrau.Exercise2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class GreetingController {

    @GetMapping(path="/ciao/{provincia}")
    public UserGreeting greet(@PathVariable String provincia,
                             @RequestParam String nome) {
        return new UserGreeting(nome, provincia);
    }

}
