package com.fabiofrau.Exercise2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private UserSerivce userService;

    public UserController(UserSerivce userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/addUser")
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto user) {
        UserDto savedUser = userService.addUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/getSingle/{id}")
    public ResponseEntity<Optional<UserDto>> getUserById(@PathVariable long id) {
        Optional<UserDto> userSearched = userService.getUserById(id);
        if(userSearched.isPresent()) {
            return new ResponseEntity<>(userSearched, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(userSearched, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<UserResponse> deleteUserById(@PathVariable long id) {
        return userService.deleteUserById(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Optional<UserDto>> updateUser(@PathVariable long id,
                                                        @RequestBody UserDto user) {
        if (!user.getId().equals(id) ) {
            return new ResponseEntity<>(Optional.empty(), HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(userService.updateUser(user), HttpStatus.OK);
        }
    }


}
