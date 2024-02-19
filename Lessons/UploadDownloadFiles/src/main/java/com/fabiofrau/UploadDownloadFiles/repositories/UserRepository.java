package com.fabiofrau.UploadDownloadFiles.repositories;

import com.fabiofrau.UploadDownloadFiles.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
