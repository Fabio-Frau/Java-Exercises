package com.fabiofrau.Exercise6.repositories;

import com.fabiofrau.Exercise6.entities.EnrollmentEntity;
import com.fabiofrau.Exercise6.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<EnrollmentEntity, Long> {
}
