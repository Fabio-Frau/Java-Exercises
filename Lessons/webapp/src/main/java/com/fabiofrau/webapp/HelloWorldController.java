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

    @GetMapping(path = "/greet/{id}")
    public String greet(@PathVariable long id,
                        @RequestParam(required = true) String nome,
                        @RequestParam(required = false, defaultValue = "") String cognome
    ) {
        return "Ciao, " + nome + " " + cognome + " id = " + id ;
    }

    @GetMapping(path = "/getUser/{id}")
    public User getUser(@PathVariable long id,
                        @RequestParam(required = true) String nome,
                        @RequestParam(required = false, defaultValue = "") String cognome
    ) {
        return new User(id,nome,cognome);
    }





}
