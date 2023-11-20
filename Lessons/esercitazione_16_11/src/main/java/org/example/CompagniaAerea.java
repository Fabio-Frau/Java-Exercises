package org.example;

import org.example.domain.Aeromobile;
import org.example.domain.Biglietto;
import org.example.domain.Passeggero;

import java.time.OffsetDateTime;
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

    public ArrayList<Aeromobile> cercaVolo(String partenza, String destinazione) {
        ArrayList<Aeromobile> risultato = new ArrayList<>();
        if (checkInputNotNull(partenza, destinazione) && checkInputNotBlankOrEmpty(partenza, destinazione)) {
            for (Biglietto b : biglietti) {
                if (b.getCittaPartenza().equals(partenza) && b.getCittaDestinazione().equals(destinazione) && !risultato.contains(b.getAeromobile())) {
                    risultato.add(b.getAeromobile());
                }
            }
        }

        return risultato;
    }

    public Boolean checkInputNotNull(String partenza, String destinazione) {
        return (partenza != null && destinazione != null);
    }

    public Boolean checkInputNotBlankOrEmpty(String partenza, String destinazione) {
        return (!partenza.isBlank() && !destinazione.isBlank());
    }

    /*public boolean verificaDisponibilita(Aeromobile aereo) {
        int numeroBigliettiVenduti = 0;

        for (Biglietto b : biglietti) {
            if (b.getAeromobile().equals(aereo)) {
                numeroBigliettiVenduti++;
            }
        }

        if (numeroBigliettiVenduti < aereo.getNumeroPosti()) {
            return true;
        } else  {
            return false;
        }

        return numeroBigliettiVenduti <= aereo.getNumeroPosti();
    }*/

    public Boolean verificaDisponibilita(Aeromobile aereo) {
        return conteggioVenduti(aereo) < aereo.getNumeroPosti();
    }

    public int conteggioVenduti(Aeromobile aereo) {
        int numeroBigliettiVenduti = 0;

        for (Biglietto b : biglietti) {
            if (b.getAeromobile().equals(aereo)) {
                numeroBigliettiVenduti++;
            }
        }
        return numeroBigliettiVenduti;
    }


    public Biglietto creaBiglietto(Passeggero p, Aeromobile ar) {
        return new Biglietto(
                "000001",
                "Napoli",
                "Gubbio",
                OffsetDateTime.parse("2023-11-17T09:10:40.000050Z"),
                OffsetDateTime.parse("2023-11-17T19:10:40.000050Z"),
                "10F",
                "G6",
                ar,
                p
        );
    }
}
