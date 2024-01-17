package com.fabiofrau.Bean.Demo.controllers;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Controller;

@Controller
public class MyController implements DisposableBean {

    @PostConstruct
    public void PostConstruct() {
        System.out.println("[PostConstruct]");
    }

    @PreDestroy
    public void PreDestroy() {
        System.out.println("[PreDestroy]");
    }


    public void get() {

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("[Destroy]");
    }
}
