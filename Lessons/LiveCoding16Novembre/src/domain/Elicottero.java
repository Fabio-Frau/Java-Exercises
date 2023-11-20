package domain;

public class Elicottero extends Aeromobile{

    private int altezzaMassima;
    String unitaMisuraAltezza;

    public Elicottero(String id, String modello, int numeroPosti, int numeroMotori,
                      double velocita, String unitaMisuraVelocita, String colore,
                      int altezzaMassima, String unitaMisuraAltezza) {
        super(id, modello, numeroPosti, numeroMotori, velocita, unitaMisuraVelocita, colore);
        this.altezzaMassima = altezzaMassima;
        this.unitaMisuraAltezza = unitaMisuraAltezza;
    }

    public int getAltezzaMassima() {
        return altezzaMassima;
    }

    public void setAltezzaMassima(int altezzaMassima) {
        this.altezzaMassima = altezzaMassima;
    }

    public String getUnitaMisuraAltezza() {
        return unitaMisuraAltezza;
    }

    public void setUnitaMisuraAltezza(String unitaMisuraAltezza) {
        this.unitaMisuraAltezza = unitaMisuraAltezza;
    }
}
