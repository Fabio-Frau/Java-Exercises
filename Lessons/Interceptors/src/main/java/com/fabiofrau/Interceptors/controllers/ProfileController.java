package com.fabiofrau.Interceptors.controllers;

import com.fabiofrau.Interceptors.entities.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @GetMapping("")
    public User get(HttpServletRequest request) {
        User user = (User)request.getAttribute("LoggedUserInterceptor-user");
        return user;
    }

}
