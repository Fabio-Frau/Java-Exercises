package com.fabiofrau.Exercise6.repositories;

import com.fabiofrau.Exercise6.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
}
