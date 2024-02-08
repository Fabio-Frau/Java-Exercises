package com.fabiofrau.Live8Feb.squadra;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/squadra")
public class SquadraController {

    private SquadraService squadraService;

    public SquadraController(SquadraService squadraService) {
        this.squadraService = squadraService;
    }

}
