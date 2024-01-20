package com.fabiofrau.DemoRepository.repositories;

import com.fabiofrau.DemoRepository.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
}
