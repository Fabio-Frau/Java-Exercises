package org.example;

import org.example.domain.Aeromobile;
import org.example.domain.Biglietto;

import java.util.ArrayList;

public class CompagniaAerea {

    private ArrayList<Aeromobile> aereomobili;
    private ArrayList<Biglietto> biglietti;

    public CompagniaAerea(ArrayList<Aeromobile> aereomobili, ArrayList<Biglietto> biglietti) {
        this.aereomobili = aereomobili;
        this.biglietti = biglietti;
    }

    public ArrayList<Aeromobile> getAereomobili() {
        return aereomobili;
    }

    public void setAereomobili(ArrayList<Aeromobile> aereomobili) {
        this.aereomobili = aereomobili;
    }

    public ArrayList<Biglietto> getBiglietti() {
        return biglietti;
    }

    public void setBiglietti(ArrayList<Biglietto> biglietti) {
        this.biglietti = biglietti;
    }

    public ArrayList<Biglietto> cercaVolo(String partenza, String destinazione) {
        ArrayList<Biglietto> risultato = new ArrayList<>();
        for (Biglietto b : biglietti) {
            if (b.getCittaPartenza().equals(partenza) && b.getCittaDestinazione().equals(destinazione)) {
                risultato.add(b);
            }
        }

        return risultato;
    }

    public boolean verificaDisponibilita(Aeromobile aereo) {
        int numeroBigliettiVenduti = 0;

        for (Biglietto b : biglietti) {
            if (b.getAeromobile().equals(aereo)) {
                numeroBigliettiVenduti++;
            }
        }

        /*if (numeroBigliettiVenduti < aereo.getNumeroPosti()) {
            return true;
        } else  {
            return false;
        }*/

        return numeroBigliettiVenduti <= aereo.getNumeroPosti();
    }
}
