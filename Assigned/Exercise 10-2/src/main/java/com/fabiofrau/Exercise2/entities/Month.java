package com.fabiofrau.Exercise2.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Month {

    private int monthNumber;
    private String englishName;
    private String italianName;
    private String germanName;

}
