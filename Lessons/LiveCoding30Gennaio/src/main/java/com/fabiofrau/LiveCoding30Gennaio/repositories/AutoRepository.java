package com.fabiofrau.LiveCoding30Gennaio.repositories;

import com.fabiofrau.LiveCoding30Gennaio.entities.AutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends JpaRepository<AutoEntity,Long> {
}
