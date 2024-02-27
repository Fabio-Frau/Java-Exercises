package com.fabiofrau.UploadDownloadFiles.controllers;

import com.fabiofrau.UploadDownloadFiles.entities.User;
import com.fabiofrau.UploadDownloadFiles.repositories.UserRepository;
import com.fabiofrau.UploadDownloadFiles.services.FileStorageService;
import com.fabiofrau.UploadDownloadFiles.services.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;
    private UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getOne(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @GetMapping("/{id}/profile")
    public void getProfileImage(@PathVariable Long id) {
        userService.downloadProfilePicture(id);
    }

    @PostMapping("/{id}/profile")
    public User uploadProfileImage(@PathVariable Long id,
                                   @RequestParam MultipartFile profilePicture) throws Exception {

        return userService.uploadProfilePicture(id, profilePicture);

    }

    @PostMapping
    public User create(@RequestBody User user) {
        user.setId(null);
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody User user,@PathVariable Long id) {
        user.setId(id);
        userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

}
