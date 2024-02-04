package com.fabiofrau.Exercise1.controllers;

import com.fabiofrau.Exercise1.dto.StudentDto;
import com.fabiofrau.Exercise1.entities.StudentEntity;
import com.fabiofrau.Exercise1.repositories.StudentRepository;
import com.fabiofrau.Exercise1.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/students")
public class StudentController {


    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public ResponseEntity<StudentEntity> createStudent(@RequestBody StudentEntity student) {

        return studentService.createStudent(student);
    }

    @GetMapping
    public ResponseEntity<List<StudentEntity>> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Optional<StudentEntity>> getStudentById(@PathVariable long id) {
        return studentService.getStudentById(id);
    }

    @PatchMapping("/student/updateIsWorking/{id}")
    public ResponseEntity<Optional<StudentEntity>> updateIsWorking(@PathVariable long id,
                                                         @RequestBody boolean isWorking) {

        return studentService.updateIsWorking(id, isWorking);
    }

    @PutMapping("/student/updateStudent/{id}")
    public ResponseEntity<Optional<StudentEntity>>  updateStudent(@PathVariable long id,
                                                       @RequestBody StudentDto student) {

        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable long id) {
        studentService.deleteStudentById(id);
    }

}
