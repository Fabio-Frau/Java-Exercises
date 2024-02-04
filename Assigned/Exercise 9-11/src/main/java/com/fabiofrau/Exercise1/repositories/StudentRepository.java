package com.fabiofrau.Exercise1.repositories;

import com.fabiofrau.Exercise1.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
}
