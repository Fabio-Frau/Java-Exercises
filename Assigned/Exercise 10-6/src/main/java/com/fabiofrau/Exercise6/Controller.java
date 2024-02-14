package com.fabiofrau.Exercise6;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/v1")
public class Controller {


    private Random random;

    public Controller(Random random) {
        this.random = random;
    }

    @GetMapping("/randomInt")
    public int getRandomInt() {
        int num1 = random.nextInt();
        int num2 = random.nextInt();

        return num1 + num2;
    }


}
