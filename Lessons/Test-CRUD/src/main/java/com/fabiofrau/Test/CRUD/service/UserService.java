package com.fabiofrau.Test.CRUD.service;

import com.fabiofrau.Test.CRUD.entities.User;
import com.fabiofrau.Test.CRUD.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void setUserActivationStatus(long userId, boolean isActive) {
        Optional<User> user = userRepository.findById(userId);

        if(user.isEmpty()) {
            return;
        } else {
            user.get().setActive(isActive);
            userRepository.save(user.get());
        }

    }

}
