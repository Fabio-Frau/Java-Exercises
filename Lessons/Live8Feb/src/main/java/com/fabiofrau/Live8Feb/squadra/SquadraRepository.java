package com.fabiofrau.Live8Feb.squadra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SquadraRepository extends JpaRepository<Squadra,Long> {
}
