package com.fabiofrau.APIStart.controller;

import com.fabiofrau.APIStart.DTO.UserDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpHeaders;

@RestController
@RequestMapping("/api")
public class EchoController {

    @GetMapping(value ="/echo")
    public String getRoute(@PathVariable String id,
                           @RequestParam(required = false) Integer quantity,
                           @RequestHeader HttpHeaders header) {

        return "Ciao io sono il GET " + id + " quantity is: " + quantity;
    }

    @PostMapping(value = "/echo")
    public String postRoute(@RequestBody UserDTO user,
                            HttpServletRequest request,
                            HttpServletResponse response) {
        return user.toString();
    }

    @DeleteMapping(value = "/echo")
    public String deleteRoute() {
        return "Ciao sono il DELETE";
    }

}
