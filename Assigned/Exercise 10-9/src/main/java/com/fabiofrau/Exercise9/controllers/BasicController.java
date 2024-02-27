package com.fabiofrau.Exercise9.controllers;

import com.fabiofrau.Exercise9.service.BasicService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
@RequiredArgsConstructor
public class BasicController {

    private final BasicService basicService;


    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @GetMapping
    public String hello() {
        logger.info("Hello users");
        return "Hello users";
    }

    @GetMapping("/exp")
    public double doCalculations() {
        return basicService.doCalculation();
    }

    @GetMapping("/get-errrors")
    public void getErrors() throws Exception {
        logger.error("An error has occurred");
        throw new Exception("Custom exception");
    }
}
