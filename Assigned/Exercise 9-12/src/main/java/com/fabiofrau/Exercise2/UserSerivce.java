package com.fabiofrau.Exercise2;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserSerivce {

    private UserRepository userRepository;

    public UserSerivce(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> getAllUsers() {
        List<UserEntity> userEntities = userRepository.findAll();
        return userEntities.stream().map(UserEntity::toDto).toList();
    }

    public UserDto addUser(UserDto user) {
        UserEntity userEntityToSave = user.toEntity();

        UserEntity userSaved = userRepository.saveAndFlush(userEntityToSave);
        return userSaved.toDto();
    }

    public Optional<UserDto> getUserById(Long id) {
        Optional<UserEntity> userSearched = userRepository.findById(id);
        return userSearched.map(UserEntity::toDto);
    }

    public ResponseEntity<UserResponse> deleteUserById(Long id) {
        boolean userExist = userRepository.existsById(id);
        if (userExist) {
            userRepository.deleteById(id);
            UserResponse.UserDeletedSuccessfully response =
                    new UserResponse.UserDeletedSuccessfully("User successfully deleted.");

            return UserResponse.mapResponseEntity(response);
        } else {
            UserResponse.UserGenericError response =
                    new UserResponse.UserGenericError("Error while deleting user with ID: " + id);

            return UserResponse.mapResponseEntity(response);
        }
    }

    public Optional<UserDto> updateUser(UserDto userDto) {
        if(userRepository.existsById(userDto.getId())) {

            UserEntity userToUpdate = userDto.toEntity();
            UserEntity userUpdated = userRepository.saveAndFlush(userToUpdate);
            return  Optional.of(userUpdated.toDto());
        } else {
            return Optional.empty();
        }

    }
}
