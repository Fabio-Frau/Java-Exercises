package com.fabiofrau.Live8Feb.giocatore;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiocatoreRepository extends JpaRepository<Giocatore,Long> {
}
