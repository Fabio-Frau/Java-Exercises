package com.fabiofrau.Exercise0.repositories;

import com.fabiofrau.Exercise0.entities.ProgramLangEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramLangRepo extends JpaRepository<ProgramLangEntity,Long> {
}
