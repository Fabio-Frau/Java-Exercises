package com.fabiofrau.Logging.controllers;

import com.fabiofrau.Logging.services.GreetingsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private GreetingsService greetingsService;

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/debug")
    public void getDebug() {
        logger.debug("This is a debug logging");
    }

    @GetMapping("/info")
    public void getInfo() {
        logger.info("This is a info logging");
    }

    @GetMapping("/warning")
    public void getWarning() {
        logger.warn("This is a warning logging");
    }

    @GetMapping("/errors")
    public void getError() {
        logger.error("This is a error logging");
    }

    @GetMapping("/greetings")
    public String greeting() {
        logger.info("Greeting in CONTROLLER");
        return greetingsService.doGreeting();
    }

}
