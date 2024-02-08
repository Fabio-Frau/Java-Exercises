package com.fabiofrau.Exercise4;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    public Page<FlightEntity> getAllPaged(int page, int size) {
        Pageable pageable = Pageable.ofSize(size).withPage(page);
        return flightRepository.getAllPaged(pageable);
    }

    public List<FlightEntity> createFlights(int n) {
        Random random = new Random();
        List<FlightEntity> flights = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            FlightEntity flight = FlightEntity.builder()
                    .description("Flight #" + i)
                    .fromAirport(generateRandomString(random))
                    .toAirport(generateRandomString(random))
                    .status(generateRandomStatus(random))
                    .build();

            flights.add(flight);
        }
        flightRepository.saveAllAndFlush(flights);
        return flights;
    }

    public List<FlightEntity> findOnTime() {
        return flightRepository.findOnTime();
    }

    public List<FlightEntity> findByStatus(Status status) {
        return flightRepository.findFlightByStatus(status);
    }


    public List<FlightEntity> findByStatusOrStatus(Status status1, Status status2) {
        return flightRepository.findFlightByStatusOrStatus(status1, status2);
    }

    private String generateRandomString(Random random) {
        return IntStream.range(0, 5)
                .mapToObj(i -> String.valueOf((char) ('A' + random.nextInt(26))))
                .collect(Collectors.joining());
    }

    private Status generateRandomStatus(Random random) {

        return Status.values()[random.nextInt(Status.values().length)];
    }

}
