package org.example;

/*
* Si richiede di implementare un sistema di gestione per una compagnia aerea,
* la compagnia aerea opera con diverse tipologie di aeromobili (aerei ed elicotteri), voli e passeggeri.
Si definiscano dei metodi per cui un passeggero possa riservare un posto su un velivolo con una certa destinazione.
*/

import org.example.domain.Aeromobile;

public class Main {

    public static void main(String[] args) {
        DataUtils du = new DataUtils();
        CompagniaAerea ca = new CompagniaAerea(du.aeromobili, du.biglietti);
        Aeromobile risultatoRicerca = ca.cercaVolo("Napoli", "Milano").get(0);
        System.out.println(ca.verificaDisponibilita(risultatoRicerca));
    }
}
