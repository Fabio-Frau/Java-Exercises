import domain.Aeromobile;
import domain.Biglietto;

import java.util.ArrayList;

public class CompagniaAerea {

    private ArrayList<Aeromobile> aeromobili = new ArrayList<>();
    private ArrayList<Biglietto> biglietti = new ArrayList<>();




    public boolean verificaDisponibilita(Aeromobile aereo) {
        int numeroBigliettiVenduti = 0;

        for(Biglietto b : biglietti) {
            if (b.getAeromobile().equals(aereo)) {
                numeroBigliettiVenduti++;
            }
        }



        return numeroBigliettiVenduti <= aereo.getNumeroPosti();

    }

    public ArrayList<Biglietto> cercaVolo(String partenza, String destinazione) {
        ArrayList<Biglietto> risultato = new ArrayList<>();
        for (Biglietto biglietto : biglietti) {
            if (biglietto.getCittaPartenza().equalsIgnoreCase(partenza) &&
                    biglietto.getCittaDestinazione().equalsIgnoreCase(destinazione)) {
                risultato.add(biglietto);
            }
        }
        return risultato;
    }

    public CompagniaAerea(ArrayList<Aeromobile> aeromobili, ArrayList<Biglietto> biglietti) {
        this.aeromobili = aeromobili;
        this.biglietti = biglietti;
    }

    public ArrayList<Aeromobile> getAeromobili() {
        return aeromobili;
    }

    public void setAeromobili(ArrayList<Aeromobile> aeromobili) {
        this.aeromobili = aeromobili;
    }

    public ArrayList<Biglietto> getBiglietti() {
        return biglietti;
    }

    public void setBiglietti(ArrayList<Biglietto> biglietti) {
        this.biglietti = biglietti;
    }
}
