package com.fabiofrau.Live8Feb.giocatore;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GiocatoreService {

    private GiocatoreRepository giocatoreRepository;

    public GiocatoreService(GiocatoreRepository giocatoreRepository) {
        this.giocatoreRepository = giocatoreRepository;
    }

    public Giocatore addGiocatore(Giocatore giocatore) {
        return giocatoreRepository.saveAndFlush(giocatore);
    }

    public List<Giocatore> getGiocatori() {
        return giocatoreRepository.findAll();
    }

    public Optional<Giocatore> getGiocatore(long id) {
        return giocatoreRepository.findById(id);
    }

    public void deleteGiocatore(long id) {
        giocatoreRepository.deleteById(id);
    }
}
