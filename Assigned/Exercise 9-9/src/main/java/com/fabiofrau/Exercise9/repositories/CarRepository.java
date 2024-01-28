package com.fabiofrau.Exercise9.repositories;

import com.fabiofrau.Exercise9.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
