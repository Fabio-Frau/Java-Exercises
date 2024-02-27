package com.fabiofrau.Exercise9.service;


import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BasicService {

    private Environment environment;
    @Value("${value1}")
    private double value1;

    @Value("${value2}")
    private double value2;

    Logger logger = LoggerFactory.getLogger(BasicService.class);

    public double doCalculation() {
        logger.debug("Starting calculations");
        logger.debug("Calculating the result of {}^{}", this.value1, this.value2);
        double result = Math.pow(this.value1, this.value2);
        logger.debug("The result is: {}", result);
        return result;

    }
}
