package com.fabiofrau.Exercise1.services;

import com.fabiofrau.Exercise1.TestUtils;
import com.fabiofrau.Exercise1.dto.StudentDto;
import com.fabiofrau.Exercise1.entities.StudentEntity;
import com.fabiofrau.Exercise1.services.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class ServiceTests {

    private StudentService studentService;

    @Autowired
    public ServiceTests(StudentService studentService) {
        this.studentService = studentService;
    }


    @Test
    void studentControllerLoads() {
        assertThat(studentService).isNotNull();
    }

    @Test
    void createStudentValidTest() {
        StudentEntity studentTest = TestUtils.createStudent1();

        ResponseEntity<StudentEntity> studentResponse = studentService.createStudent(studentTest);
        studentTest.setId(studentResponse.getBody().getId());

        assertThat(studentResponse.getBody()).isEqualTo(studentTest);
        assertThat(studentResponse.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    }

    @Test
    void getAllStudentsTest() {

        StudentEntity student1 = TestUtils.createStudent1();
        StudentEntity student2 = TestUtils.createStudent2();
        StudentEntity student3 = TestUtils.createStudent3();

        studentService.createStudent(student1);
        studentService.createStudent(student2);
        studentService.createStudent(student3);

        ResponseEntity<List<StudentEntity>> students = studentService.getAllStudents();

        assertThat(students.getStatusCode()).isEqualTo(HttpStatus.OK);

        assertThat(students.getBody()).containsOnly(student1, student2, student3);

    }

    @Test
    void getStudentByIdSuccessTest() {

        StudentEntity student1 = TestUtils.createStudent1();
        ResponseEntity<StudentEntity> studentCreated = studentService.createStudent(student1);

        ResponseEntity<Optional<StudentEntity>> response = studentService.getStudentById(studentCreated.getBody().getId());

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody().get()).isEqualTo(studentCreated.getBody());

    }

    @Test
    void getStudentByIdFailure() {

        ResponseEntity<Optional<StudentEntity>> response = studentService.getStudentById(-1000L);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
        assertThat(response.getBody()).isEqualTo(Optional.empty());

    }


    @Test
    void updateIsWorkingTrueSuccess() {
        StudentEntity student1 = TestUtils.createStudent1();
        student1.setIsWorking(false);
        ResponseEntity<StudentEntity> studentCreated = studentService.createStudent(student1);

        ResponseEntity<Optional<StudentEntity>> studentUpdated =
                studentService.updateIsWorking(studentCreated.getBody().getId(), true);

        assertThat(studentUpdated.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(studentUpdated.getBody().get().getId()).isEqualTo(studentCreated.getBody().getId());
        assertThat(studentUpdated.getBody().get().getIsWorking()).isTrue();


    }

    @Test
    void updateIsWorkingFalseSuccess() {
        StudentEntity student1 = TestUtils.createStudent1();
        ResponseEntity<StudentEntity> studentCreated = studentService.createStudent(student1);

        ResponseEntity<Optional<StudentEntity>> studentUpdated =
                studentService.updateIsWorking(studentCreated.getBody().getId(), false);

        assertThat(studentUpdated.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(studentUpdated.getBody().get().getId()).isEqualTo(studentCreated.getBody().getId());
        assertThat(studentUpdated.getBody().get().getIsWorking()).isFalse();


    }

    @Test
    void updateIsWorkingNotFoundFail() {

        ResponseEntity<Optional<StudentEntity>> studentUpdated =
                studentService.updateIsWorking(-100L, false);

        assertThat(studentUpdated.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
        assertThat(studentUpdated.getBody()).isEqualTo(Optional.empty());

    }

    @Test
    void updateStudentSuccess() {

        StudentEntity student1 = TestUtils.createStudent1();
        ResponseEntity<StudentEntity> studentCreated = studentService.createStudent(student1);

        StudentDto studentToUpdate = TestUtils.createStudentDto();

        ResponseEntity<Optional<StudentEntity>> response =
                studentService.updateStudent(studentCreated.getBody().getId(), studentToUpdate);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody().get().getId()).isEqualTo(studentCreated.getBody().getId());
        assertThat(response.getBody().get().getName()).isEqualTo(studentToUpdate.getName());
        assertThat(response.getBody().get().getSurname()).isEqualTo(studentToUpdate.getSurname());
        assertThat(response.getBody().get().getIsWorking()).isEqualTo(studentToUpdate.getIsWorking());

    }

    @Test
    void updateStudentFailure() {

        StudentEntity student1 = TestUtils.createStudent1();
        ResponseEntity<StudentEntity> studentCreated = studentService.createStudent(student1);

        StudentDto studentToUpdate = TestUtils.createStudentDto();

        ResponseEntity<Optional<StudentEntity>> response =
                studentService.updateStudent(-10L, studentToUpdate);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
        assertThat(response.getBody()).isEqualTo(Optional.empty());
    }

    @Test
    void deleteSuccess() {

        StudentEntity student1 = TestUtils.createStudent1();
        ResponseEntity<StudentEntity> studentCreated = studentService.createStudent(student1);

        Long id = studentCreated.getBody().getId();

        studentService.deleteStudentById(id);

        ResponseEntity<Optional<StudentEntity>> response = studentService.getStudentById(id);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
        assertThat(response.getBody()).isEqualTo(Optional.empty());

    }


}
