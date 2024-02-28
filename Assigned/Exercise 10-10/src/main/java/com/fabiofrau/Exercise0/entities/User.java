package com.fabiofrau.Exercise0.entities;

import com.fabiofrau.Exercise0.dto.UserResponseDto;
import com.fabiofrau.Exercise0.repositories.UserRepository;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String profileImg;


    public UserResponseDto convertEntityToUserResponse() {
        return UserResponseDto.builder()
                .id(this.id)
                .firstName(this.firstName)
                .lastName(this.lastName)
                .profileImg(this.profileImg)
                .build();
    }
}
