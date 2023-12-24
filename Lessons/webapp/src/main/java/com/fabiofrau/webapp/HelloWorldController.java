package com.fabiofrau.webapp;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "/ciao")
    public String ciao(@RequestParam(required = true) String nome,
                       @RequestParam(required = false, defaultValue = "") String cognome) {
        return "Ciao " + nome + " " + cognome + "!";
    }

}
