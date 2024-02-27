package com.fabiofrau.JWT.Security.Authentication.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serial;
import java.io.Serializable;

@Table(name = "users",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "firstName"),
        @UniqueConstraint(columnNames = "lastName"),
        @UniqueConstraint(columnNames = "email")
    }
)
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User implements Serializable, UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String firstName;
    String lastName;
    String email;
    String password;
    String userRole;



}
