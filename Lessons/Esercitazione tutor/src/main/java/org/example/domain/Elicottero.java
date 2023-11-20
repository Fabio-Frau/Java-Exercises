package org.example.domain;

public class Elicottero extends Aeromobile {

    private int altezzaMax;
    private String unitaMisuraAltezza;

    public Elicottero(
            String id,
            String modello,
            int numeroPosti,
            int numeroMotori,
            double velocita,
            String unitaMisuraVelocita,
            String colore,
            int altezzaMax,
            String unitaMisuraAltezza
    ) {
        super(id, modello, numeroPosti, numeroMotori, velocita, unitaMisuraVelocita, colore);
        this.altezzaMax = altezzaMax;
        this.unitaMisuraAltezza = unitaMisuraAltezza;
    }

    public int getAltezzaMax() {
        return altezzaMax;
    }

    public void setAltezzaMax(int altezzaMax) {
        this.altezzaMax = altezzaMax;
    }

    public String getUnitaMisuraAltezza() {
        return unitaMisuraAltezza;
    }

    public void setUnitaMisuraAltezza(String unitaMisuraAltezza) {
        this.unitaMisuraAltezza = unitaMisuraAltezza;
    }
}
