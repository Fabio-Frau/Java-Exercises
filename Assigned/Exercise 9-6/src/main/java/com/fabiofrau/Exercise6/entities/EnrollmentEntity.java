package com.fabiofrau.Exercise6.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "enrollments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long studentID;
    private Long classID;

}
