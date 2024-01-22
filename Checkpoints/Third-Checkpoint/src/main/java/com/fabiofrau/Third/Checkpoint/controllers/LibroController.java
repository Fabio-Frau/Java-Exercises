package com.fabiofrau.Third.Checkpoint.controllers;


import com.fabiofrau.Third.Checkpoint.domain.Libro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/v1/libri")
public class LibroController {

    private ArrayList<Libro> libreria = new ArrayList<>();

    public LibroController() {
        libreria.add(new Libro(1L, "Libro 1", "Autore 1"));
        libreria.add(new Libro(2L, "Libro 2", "Autore 2"));
        libreria.add(new Libro(3L, "Libro 3", "Autore 3"));
        libreria.add(new Libro(4L, "Libro 4", "Autore 4"));
    }

    @GetMapping("/getlibreria")
    public ArrayList<Libro> getLibreria() {
        return libreria;
    }

    @PatchMapping("patchAutore/{id}")
    public Libro updateAutore(@RequestParam String autore, @PathVariable long id) {

        Libro updateLibro = null;
        for(Libro libro : libreria) {
            if (libro.getId() == id) {
                libro.setAutore(autore);
                updateLibro = libro;

                break;
            }
        }
        return updateLibro;


    }


}
