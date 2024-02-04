package com.fabiofrau.Exercise1.services;

import com.fabiofrau.Exercise1.dto.StudentDto;
import com.fabiofrau.Exercise1.entities.StudentEntity;
import com.fabiofrau.Exercise1.repositories.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public ResponseEntity<StudentEntity> createStudent(StudentEntity student) {
        student.setId(null);
        return new ResponseEntity<>(studentRepository.saveAndFlush(student), HttpStatus.CREATED);
    }

    public ResponseEntity<List<StudentEntity>> getAllStudents() {
        return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Optional<StudentEntity>> getStudentById(long id) {
        Optional<StudentEntity> response = (studentRepository.findById(id));

        if(response.isPresent()) {
            return new ResponseEntity<Optional<StudentEntity>>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<Optional<StudentEntity>>(Optional.empty(), HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Optional<StudentEntity>> updateIsWorking(long id, boolean isWorking) {
        Optional<StudentEntity> student = studentRepository.findById(id);

        if(student.isPresent()) {
            student.get().setIsWorking(isWorking);
            return new ResponseEntity<>(student, HttpStatus.OK);
        } else {
            return new ResponseEntity<Optional<StudentEntity>>(Optional.empty(), HttpStatus.NOT_FOUND);
        }

    }

    public ResponseEntity<Optional<StudentEntity>>  updateStudent(long id, StudentDto student) {

        if(studentRepository.existsById(id)) {
           StudentEntity oldStudent = studentRepository.findById(id).get();

           oldStudent.setName(student.getName());
           oldStudent.setSurname(student.getSurname());
           oldStudent.setIsWorking(student.getIsWorking());
           return new ResponseEntity<> (Optional.of(studentRepository.saveAndFlush(oldStudent)), HttpStatus.OK);

        } else {
            return new ResponseEntity<>(Optional.empty(), HttpStatus.NOT_FOUND);
        }

    }

    public void deleteStudentById(long id) {
        studentRepository.deleteById(id);
    }




}
