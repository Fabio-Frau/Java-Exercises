package com.fabiofrau.Exercise3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping("/createFlights")
    public List<FlightEntity> create50Flights() {
        return flightService.create50Flights();
    }

    @GetMapping("/getAll")
    public List<FlightEntity> getAll() {
        return flightService.getAll();
    }




}
