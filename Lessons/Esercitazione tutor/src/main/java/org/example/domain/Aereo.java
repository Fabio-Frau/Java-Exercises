package org.example.domain;

enum ClassType {
    ECONOMY,
    BUSINESS,
    LUXURY
}

public class Aereo extends Aeromobile {
    private ClassType classType;

    public Aereo(
            String id,
            String modello,
            int numeroPosti,
            int numeroMotori,
            double velocita,
            String unitaMisuraVelocita,
            String colore,
            ClassType classType
    ) {
        super(id, modello, numeroPosti, numeroMotori, velocita, unitaMisuraVelocita, colore);
        this.classType = classType;
    }

    public ClassType getClasse() {
        return classType;
    }

    public void setClasse(ClassType classType) {
        this.classType = classType;
    }

}
