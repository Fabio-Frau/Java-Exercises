package com.fabiofrau.Exercise6.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "classes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @OneToMany
    @JoinColumn(name = "classID")
    private List<EnrollmentEntity> enrollmentEntity;

}
