package com.fabiofrau.Demo.Crud.repositories;


import com.fabiofrau.Demo.Crud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
