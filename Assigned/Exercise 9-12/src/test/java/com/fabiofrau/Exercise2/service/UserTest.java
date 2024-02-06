package com.fabiofrau.Exercise2.service;

import com.fabiofrau.Exercise2.TestUtils;
import com.fabiofrau.Exercise2.UserDto;
import com.fabiofrau.Exercise2.UserResponse;
import com.fabiofrau.Exercise2.UserSerivce;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class UserTest {

    private UserSerivce userSerivce;

    @Autowired
    public UserTest(UserSerivce userSerivce) {
        this.userSerivce = userSerivce;
    }

    @Test
    void userServiceLoads() {
        assertThat(userSerivce).isNotNull();
    }

    @Test
    void createUserValidTest() {

        UserDto user = TestUtils.createUserDto1();
        UserDto userSaved = userSerivce.addUser(user);

        assertThat(userSaved.getId()).isEqualTo(1);
        assertThat(userSaved.getName()).isEqualTo(user.getName());
        assertThat(userSaved.getSurname()).isEqualTo(user.getSurname());
        assertThat(userSaved.getAge()).isEqualTo(user.getAge());

    }

    @Test
    void getAllUsers() {
        UserDto user1 = TestUtils.createUserDto1();
        UserDto user2 = TestUtils.createUserDto2();
        UserDto user3 = TestUtils.createUserDto3();

        userSerivce.addUser(user1);
        userSerivce.addUser(user2);
        userSerivce.addUser(user3);

        List<UserDto> users = userSerivce.getAllUsers();

        assertThat(users).containsOnly(user1, user2, user3);
    }

    @Test
    void getUserByIdSuccess() {
        UserDto user1 = TestUtils.createUserDto1();
        userSerivce.addUser(user1);

        Optional<UserDto> user = userSerivce.getUserById(user1.getId());
        assertThat(user.get()).isEqualTo(user1);
    }

    @Test
    void getUserByIdFail() {
        Optional<UserDto> user = userSerivce.getUserById(-10L);
        assertThat(user).isEqualTo(Optional.empty());
    }

    @Test
    void updateUserTestSuccess() {
        UserDto user1 = TestUtils.createUserDto1();
        userSerivce.addUser(user1);

        UserDto user2 = TestUtils.createUserDto2();
        user2.setId(1L);

        Optional<UserDto> user = userSerivce.updateUser(user2);
        assertThat(user.get().getId()).isEqualTo(1L);
        assertThat(user.get().getName()).isEqualTo(user2.getName());
        assertThat(user.get().getSurname()).isEqualTo(user2.getSurname());
        assertThat(user.get().getAge()).isEqualTo(user2.getAge());

    }

    @Test
    void updateUserTestFail() {
        UserDto user1 = TestUtils.createUserDto1();
        userSerivce.addUser(user1);

        UserDto user2 = TestUtils.createUserDto2();
        user2.setId(1000L);

        Optional<UserDto> user = userSerivce.updateUser(user2);
        assertThat(user).isEqualTo(Optional.empty());
    }

    @Test
    void deleteSuccess() {
        UserDto user1 = TestUtils.createUserDto1();
        UserDto userSaved = userSerivce.addUser(user1);

        Long id = userSaved.getId();
        ResponseEntity<UserResponse> response = userSerivce.deleteUserById(id);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NO_CONTENT);

    }

    @Test
    void deleteFail() {
        ResponseEntity<UserResponse> response = userSerivce.deleteUserById(-100L);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);
    }



}
