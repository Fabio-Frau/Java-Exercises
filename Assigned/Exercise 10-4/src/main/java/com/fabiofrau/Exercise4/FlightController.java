package com.fabiofrau.Exercise4;


import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping("/createFlights")
    public List<FlightEntity> createFlights(@RequestParam(defaultValue = "100") int number) {
        return flightService.createFlights(number);
    }

    @GetMapping("/getAll")
    public List<FlightEntity> getAll() {
        return flightService.getAll();
    }

    @GetMapping("/getOnTime")
    public List<FlightEntity> getOnTime() {
        return flightService.findOnTime();
    }

    @GetMapping("/getAllPaged")
    public Page<FlightEntity> getAllPaged(@RequestParam(name = "page", defaultValue = "0") int page,
                                          @RequestParam(name = "size", defaultValue = "10") int size) {
        return flightService.getAllPaged(page,size);
    }

    @GetMapping("/findByStatus")
    public List<FlightEntity> findByStatus(@RequestParam Status status) {
        return flightService.findByStatus(status);
    }

    @GetMapping("findByTwoStatus")
    public List<FlightEntity> findBy2Status(@RequestParam Status status1,
                                            @RequestParam Status status2) {
        return flightService.findByStatusOrStatus(status1, status2);
    }




}
