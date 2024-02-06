package com.fabiofrau.Exercise2;

public class TestUtils {

    public static UserDto createUserDto1() {
        UserDto userDto = new UserDto();
        userDto.setId(1L);
        userDto.setName("Fabio");
        userDto.setSurname("Frau");
        userDto.setAge(32);

        return  userDto;
    }

    public static UserDto createUserDto2() {
        UserDto userDto = new UserDto();
        userDto.setId(2L);
        userDto.setName("Donald");
        userDto.setSurname("Duck");
        userDto.setAge(3200);

        return  userDto;
    }

    public static UserDto createUserDto3() {
        UserDto userDto = new UserDto();
        userDto.setId(3L);
        userDto.setName("Mickey");
        userDto.setSurname("Mouse");
        userDto.setAge(9999);

        return  userDto;
    }

}
