package com.fabiofrau.Live8Feb.squadra;

import org.springframework.stereotype.Service;

@Service
public class SquadraService {

    private SquadraRepository squadraRepository;

    public SquadraService(SquadraRepository squadraRepository) {
        this.squadraRepository = squadraRepository;
    }

}
