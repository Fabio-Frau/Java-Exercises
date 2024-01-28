package com.fabiofrau.Exercise0.controllers;

import com.fabiofrau.Exercise0.entities.ProgramLangEntity;
import com.fabiofrau.Exercise0.repositories.ProgramLangRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/repo-prog-languages")
public class ProgramLangController {

    private ProgramLangRepo programLangRepo;

    public ProgramLangController(ProgramLangRepo programLangRepo) {
        this.programLangRepo = programLangRepo;
    }

    @PostMapping
    public ResponseEntity<ProgramLangEntity> create(@RequestBody ProgramLangEntity progLang) {
        progLang.setId(null);
        return new ResponseEntity<>(programLangRepo.saveAndFlush(progLang), HttpStatus.CREATED);
    }

    @GetMapping
    public Page<ProgramLangEntity> getAll(@RequestParam(required = false, defaultValue = "1") int page) {

        Pageable pageable = PageRequest.of(page,2);
        return programLangRepo.findAll(pageable);

    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProgramLangEntity> updateInventor(@PathVariable long id,
                                                            @RequestParam String newInventor) {
        if(programLangRepo.existsById(id)) {
            ProgramLangEntity updateProg = programLangRepo.findById(id).get();
            updateProg.setInventor(newInventor);
            return new ResponseEntity<>(programLangRepo.saveAndFlush(updateProg), HttpStatus.OK) ;
        } else {
            return new ResponseEntity<>(new ProgramLangEntity(), HttpStatus.NOT_FOUND) ;
        }
    }


}
