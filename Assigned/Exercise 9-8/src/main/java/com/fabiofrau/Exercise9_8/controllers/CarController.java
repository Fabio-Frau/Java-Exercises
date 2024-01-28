package com.fabiofrau.Exercise9_8.controllers;

import com.fabiofrau.Exercise9_8.domain.dto.CarDTO;
import com.fabiofrau.Exercise9_8.domain.entities.CarEntity;
import com.fabiofrau.Exercise9_8.repositories.CarRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/cars")
public class CarController {

    private CarRepository carRepository;

    //Constructor injection
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @PostMapping("/car")
    public @ResponseBody ResponseEntity<CarEntity> createCar(@RequestBody CarEntity car) {
        car.setId(null);
        return new ResponseEntity<CarEntity>(carRepository.saveAndFlush(car), HttpStatus.CREATED);
    }

    @GetMapping
    public @ResponseBody ResponseEntity<List<CarEntity>> getAll() {

        return new ResponseEntity<>(carRepository.findAll(), HttpStatus.OK);

    }

    @GetMapping("/car/{id}")
    public @ResponseBody ResponseEntity<CarEntity> getSingle(@PathVariable long id) {

        if (carRepository.existsById(id)) {
            return new ResponseEntity<>(carRepository.findById(id).get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new CarEntity(), HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping("/car/{id}")
    public @ResponseBody ResponseEntity<CarEntity> updateType(
            @PathVariable long id,
            @RequestParam(name = "type") String updateType) {

        if(carRepository.existsById(id)) {
            CarEntity car= carRepository.findById(id).get();
            car.setType(updateType);
            return new ResponseEntity<>(car, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new CarEntity(), HttpStatus.NOT_FOUND);
        }

    }


    @DeleteMapping("/car/{id}")
    public HttpStatus deleteCar(@PathVariable long id) {
        if(carRepository.existsById(id)) {
            carRepository.deleteById(id);
            return HttpStatus.OK;
        } else {
            return HttpStatus.CONFLICT;
        }
    }

    @DeleteMapping
    public HttpStatus deleteAll() {
        carRepository.deleteAll();
        return HttpStatus.OK;
    }

}




