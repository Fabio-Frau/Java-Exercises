package com.fabiofrau.UploadDownloadFiles.services;

import com.fabiofrau.UploadDownloadFiles.entities.User;
import com.fabiofrau.UploadDownloadFiles.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    private FileStorageService fileStorageService;

    public UserService(UserRepository userRepository,
                       FileStorageService fileStorageService) {
        this.userRepository = userRepository;
        this.fileStorageService = fileStorageService;
    }

    public User uploadProfilePicture(Long userId, MultipartFile profilePicture) throws Exception {
        Optional<User> optionalUser = userRepository.findById(userId);

        if(!optionalUser.isPresent()) throw new Exception("User is not present");

        String fileName = fileStorageService.upload(profilePicture);

        User user = optionalUser.get();
        user.setProfilePicture(fileName);
        return userRepository.save(user);
    }
}
