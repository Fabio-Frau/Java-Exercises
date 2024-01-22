package com.fabiofrau.Third.Checkpoint.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Libro {

    private Long id;
    private String titolo;
    private String autore;

}
