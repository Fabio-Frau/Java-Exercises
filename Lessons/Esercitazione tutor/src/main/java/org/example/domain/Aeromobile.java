package org.example.domain;

public class Aeromobile {
    private String id;
    private String modello;
    private int numeroPosti;
    private int numeroMotori;
    private double velocita;
    private String unitaMisuraVelocita;
    private String colore;

    public Aeromobile(String id, String modello, int numeroPosti, int numeroMotori, double velocita, String unitaMisuraVelocita, String colore) {
        this.id = id;
        this.modello = modello;
        this.numeroPosti = numeroPosti;
        this.numeroMotori = numeroMotori;
        this.velocita = velocita;
        this.unitaMisuraVelocita = unitaMisuraVelocita;
        this.colore = colore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    public int getNumeroMotori() {
        return numeroMotori;
    }

    public void setNumeroMotori(int numeroMotori) {
        this.numeroMotori = numeroMotori;
    }

    public double getVelocita() {
        return velocita;
    }

    public void setVelocita(double velocita) {
        this.velocita = velocita;
    }

    public String getUnitaMisuraVelocita() {
        return unitaMisuraVelocita;
    }

    public void setUnitaMisuraVelocita(String unitaMisuraVelocita) {
        this.unitaMisuraVelocita = unitaMisuraVelocita;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
}
