package com.fabiofrau.Exercise3.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/names")
public class NameController {

    @GetMapping("/name/straight")
    public String getStraightName(@RequestParam(required = true, name = "name") String name) {
        return name;
    }

    @PostMapping("/name/reverse")
    public String getReverseName(@RequestParam(required = true, name = "name") String name) {
        StringBuilder sb = new StringBuilder(name);
        return sb.reverse().toString();
    }

}
