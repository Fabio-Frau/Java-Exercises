package com.fabiofrau.LiveCoding24Gennaio.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Auto {

    private String marca;
    private String modello;
    private String targa;

}
