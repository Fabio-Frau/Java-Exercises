package com.fabiofrau.LiveCoding19Gennaio.repositories;

import com.fabiofrau.LiveCoding19Gennaio.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity,Long> {


}
