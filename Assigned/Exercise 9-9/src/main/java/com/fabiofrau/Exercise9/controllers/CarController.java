package com.fabiofrau.Exercise9.controllers;

import com.fabiofrau.Exercise9.entities.CarEntity;
import com.fabiofrau.Exercise9.repositories.CarRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cars")
public class CarController {

    private CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @PostMapping("/car")
    public ResponseEntity<CarEntity> create(@RequestBody CarEntity car) {
        car.setId(null);
        return new ResponseEntity<CarEntity>(carRepository.saveAndFlush(car), HttpStatus.CREATED) ;
    }

}
