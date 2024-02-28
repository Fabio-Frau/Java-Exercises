package com.fabiofrau.Exercise0.repositories;

import com.fabiofrau.Exercise0.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
