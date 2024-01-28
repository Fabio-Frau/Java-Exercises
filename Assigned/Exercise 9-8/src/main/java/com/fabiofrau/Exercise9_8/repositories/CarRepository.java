package com.fabiofrau.Exercise9_8.repositories;

import com.fabiofrau.Exercise9_8.domain.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
