package com.fabiofrau.Live7Feb.controllers;

import com.fabiofrau.Live7Feb.domain.NewUser;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class UserController {


    @PostMapping("/signup")
    public NewUser signUpUser(@RequestBody NewUser newuser) {
        return newuser;
    }

    @GetMapping("/block")
    public String block() {
        return "BLOCK!!!";
    }


}
