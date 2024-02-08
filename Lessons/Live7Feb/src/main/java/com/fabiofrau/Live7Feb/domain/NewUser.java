package com.fabiofrau.Live7Feb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewUser {

    private String nome;
    private String cognome;
    private String email;
    //
    // private LocalDate dataNascita;

}
