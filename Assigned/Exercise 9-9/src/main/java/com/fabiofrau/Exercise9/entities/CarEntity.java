package com.fabiofrau.Exercise9.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "cars")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String modelName;

    @Column(nullable = false, unique = true)
    private Long serialNumber;

    @Column(nullable = true)
    private BigDecimal currentPrice;


}
