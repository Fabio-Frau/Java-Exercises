package com.fabiofrau.UploadDownloadFiles.controllers;

import com.fabiofrau.UploadDownloadFiles.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public void getAll() {

    }

    @GetMapping("/{id}")
    public void getOne() {

    }

    @GetMapping("/{id}/profile")
    public void getProfileImage() {

    }

    @PostMapping("/{id}/profile")
    public void uploadImage() {

    }

    @PostMapping
    public void create() {

    }

    @PutMapping("/{id}")
    public void update() {

    }

    @DeleteMapping("/{id}")
    public void delete() {

    }

}
