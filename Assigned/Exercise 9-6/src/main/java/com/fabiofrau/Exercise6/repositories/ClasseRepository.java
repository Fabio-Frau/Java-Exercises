package com.fabiofrau.Exercise6.repositories;

import com.fabiofrau.Exercise6.entities.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClasseRepository extends JpaRepository<ClassEntity,Long> {
}
