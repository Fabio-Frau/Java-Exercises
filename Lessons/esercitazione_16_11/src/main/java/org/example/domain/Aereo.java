package org.example.domain;

public class Aereo extends Aeromobile {
    private ClassType classType;

    @Override
    public String toString() {
        return "Aereo{" +
                "classType=" + classType +
                "} " + super.toString();
    }

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
