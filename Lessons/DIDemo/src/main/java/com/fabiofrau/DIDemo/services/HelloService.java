package com.fabiofrau.DIDemo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
public class HelloService {

    @Value("${spring.helloMessage}")
    private String helloMessage;

    public String getHello() {
        return helloMessage;
    }

}
