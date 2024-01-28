package com.fabiofrau.Test.CRUD.controllers;

import com.fabiofrau.Test.CRUD.entities.User;
import com.fabiofrau.Test.CRUD.repositories.UserRepository;
import com.fabiofrau.Test.CRUD.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PostMapping("")
    public @ResponseBody User create(@RequestBody User user) {
        return userRepository.save(user);

    }

    @GetMapping("/")
    public @ResponseBody List<User> getlist() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody User getSingle(@PathVariable long id) {
        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()) {
            return user.get();
        } else {
            return null;
        }
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody(required = true) User user) {
        user.setId(id);
        userRepository.save(user);

    }

    @PutMapping("/{id}/activation")
    public void setUserActive(@PathVariable long id,
                              @RequestParam("activated") boolean activated) {
        userService.setUserActivationStatus(id, activated);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        userRepository.deleteById(id);
    }

}
