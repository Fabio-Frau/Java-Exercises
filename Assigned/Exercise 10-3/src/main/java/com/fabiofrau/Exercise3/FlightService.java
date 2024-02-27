package com.fabiofrau.Exercise3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class FlightService {

    private FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<FlightEntity> getAll() {
        return flightRepository.findAll();
    }

    public List<FlightEntity> create50Flights() {
        Random random = new Random();
        List<FlightEntity> flights = new ArrayList<>();
        for(int i = 1; i < 52; i++) {
            FlightEntity flight = FlightEntity.builder()
                    .description("Flight #" + i)
                    .fromAirport(generateRandomString(random))
                    .toAirport(generateRandomString(random))
                    .status(Status.ONTIME)
                    .build();

            flights.add(flight);
        }
        flightRepository.saveAllAndFlush(flights);
        return flights;
    }


    private String generateRandomString(Random random) {
        return IntStream.range(0, 5)
                .mapToObj(i -> String.valueOf((char) ('A' + random.nextInt(26))))
                .collect(Collectors.joining());
    }

    public List<FlightEntity> findCustom() {
        return flightRepository.findCustom();
    }

}
