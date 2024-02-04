package com.fabiofrau.LiveCoding30Gennaio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class AutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String modelName;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private int displacement;

    @Column(nullable = false)
    private double cv;

    @Column(nullable = false)
    private double kw;

}
