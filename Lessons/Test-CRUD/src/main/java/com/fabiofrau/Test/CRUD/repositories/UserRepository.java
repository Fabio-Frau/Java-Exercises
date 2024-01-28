package com.fabiofrau.Test.CRUD.repositories;

import com.fabiofrau.Test.CRUD.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
