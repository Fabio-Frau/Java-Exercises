package com.fabiofrau.Exercise0.dto;

import com.fabiofrau.Exercise0.entities.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequestDto {

    private String firstName;
    private String lastName;

    public User convertRequestToEntity() {
        return User.builder()
                .firstName(this.firstName)
                .lastName(this.lastName)
                .build();
    }

}
