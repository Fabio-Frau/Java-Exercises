package com.fabiofrau.Live8Feb.giocatore;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/giocatore")
public class GiocatoreController {

    private GiocatoreService giocatoreService;

    public GiocatoreController(GiocatoreService giocatoreService) {
        this.giocatoreService = giocatoreService;
    }

    @PostMapping("/addGiocatore")
    public Giocatore addGiocatore(Giocatore giocatore) {
        return giocatoreService.addGiocatore(giocatore);
    }

    @GetMapping("/getGiocatori")
    public List<Giocatore> getGiocatori() {
        return giocatoreService.getGiocatori();
    }

    @GetMapping("/getGiocatore/{id}")
    public Optional<Giocatore> getGiocatore(@PathVariable long id) {
        return giocatoreService.getGiocatore(id);
    }

    @DeleteMapping("/deleteGiocatore/{id}")
    public void deleteGiocatore(@PathVariable long id) {
        giocatoreService.deleteGiocatore(id);
    }

}
