package com.fabiofrau.Exercise1;

import com.fabiofrau.Exercise1.dto.StudentDto;
import com.fabiofrau.Exercise1.entities.StudentEntity;

public class TestUtils {


    public static StudentDto createStudentDto () {
        StudentDto student = new StudentDto();
        student.setName("UpdatedName");
        student.setSurname("UpdatedSurname");
        student.setIsWorking(false);

        return  student;
    }

    public static StudentEntity createStudent1() {
        StudentEntity studentTest = new StudentEntity();
        studentTest.setName("Fabio");
        studentTest.setSurname("Frau");
        studentTest.setIsWorking(true);
        return studentTest;
    }

    public static StudentEntity createStudent2() {
        StudentEntity studentTest = new StudentEntity();
        studentTest.setName("Donald");
        studentTest.setSurname("Duck");
        studentTest.setIsWorking(true);
        return studentTest;
    }

    public static StudentEntity createStudent3() {
        StudentEntity studentTest = new StudentEntity();
        studentTest.setName("Mickey");
        studentTest.setSurname("Mouse");
        studentTest.setIsWorking(true);
        return studentTest;
    }

}
