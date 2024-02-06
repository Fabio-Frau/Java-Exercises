package com.fabiofrau.Exercise2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private Long id;

    private String name;

    private String surname;

    private Integer age;

    public UserEntity toEntity() {
        return new UserEntity(this.id, this.name, this.surname, this.age);
    }

}
