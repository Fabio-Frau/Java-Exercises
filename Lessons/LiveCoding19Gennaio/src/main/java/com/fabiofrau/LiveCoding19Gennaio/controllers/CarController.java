package com.fabiofrau.LiveCoding19Gennaio.controllers;

import com.fabiofrau.LiveCoding19Gennaio.dto.UpdateTypeRequest;
import com.fabiofrau.LiveCoding19Gennaio.entities.CarEntity;
import com.fabiofrau.LiveCoding19Gennaio.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping("/car/create")
    public CarEntity createCar(@RequestBody CarEntity car) {
        return carRepository.saveAndFlush(car);
    }

    @GetMapping("/getAll")
    public List<CarEntity> getAllCars() {
        return carRepository.findAll();
    }

    @PatchMapping("/car/{id}/updateType")
    public Optional<CarEntity> updateType(@RequestBody UpdateTypeRequest request, @PathVariable long id) {
        Optional<CarEntity> oldCar = carRepository.findById(id);
        if (oldCar.isPresent()) {
            oldCar.get().setType(request.getUpdatedType());
            carRepository.saveAndFlush(oldCar.get());
            return oldCar;

        } else {
            return Optional.empty();
        }



    }



}
