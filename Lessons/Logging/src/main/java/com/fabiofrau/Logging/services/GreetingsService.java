package com.fabiofrau.Logging.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GreetingsService {

    Logger logger = LoggerFactory.getLogger(GreetingsService.class);

    public String doGreeting() {
        logger.info("Starting greeting");

        logger.info("Ending greeting");

        return "Greetings";
    }
}
