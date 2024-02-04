package com.fabiofrau.LiveCoding30Gennaio.services;

import com.fabiofrau.LiveCoding30Gennaio.entities.AutoEntity;
import com.fabiofrau.LiveCoding30Gennaio.repositories.AutoRepository;

public class AutoService {

    private AutoRepository autoRepository;

    public AutoService(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    public AutoEntity convertCvToKw(AutoEntity auto) {
        auto.setKw((auto.getCv()/1.36));
        return autoRepository.saveAndFlush(auto);
    }

}
