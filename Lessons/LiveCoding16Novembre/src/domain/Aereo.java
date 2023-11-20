package domain;

public class Aereo extends Aeromobile{

    private TipoClasse tipoClasse;

    public Aereo(String id, String modello, int numeroPosti, int numeroMotori,
                 double velocita, String unitaMisuraVelocita, String colore, TipoClasse tipoClasse) {
        super(id, modello, numeroPosti, numeroMotori, velocita, unitaMisuraVelocita, colore);
        this.tipoClasse = tipoClasse;
    }

    public TipoClasse getTipoClasse() {
        return tipoClasse;
    }

    public void setTipoClasse(TipoClasse tipoClasse) {
        this.tipoClasse = tipoClasse;
    }
}

