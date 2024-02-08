package com.fabiofrau.Exercise4;

import jakarta.persistence.NamedNativeQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<FlightEntity,Long> {

   @Query(value = "SELECT * FROM flights WHERE status = 'ONTIME'", nativeQuery = true)
    List<FlightEntity> findOnTime();

    @Query(value = "SELECT * FROM flights ORDER BY from_airport", nativeQuery = true)
    Page<FlightEntity> getAllPaged(Pageable pageable);

    public List<FlightEntity> findFlightByStatus(Status status);

    public List<FlightEntity> findFlightByStatusOrStatus(Status status1, Status status2);

}
