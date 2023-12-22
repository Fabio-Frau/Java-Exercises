package Esempio;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Pasticceria {

    private ArrayList<DolceInventario> inventarioDolci;
    private ArrayList<DolceInventario> vendite;


    public Pasticceria(ArrayList<DolceInventario> inventarioDolci, ArrayList<DolceInventario> vendite) {
        this.inventarioDolci = inventarioDolci;
        this.vendite = vendite;
    }

    public ArrayList<DolceInventario> rimuoviDolce(Dolce dolce) {
        if (dolce != null) {
           for(DolceInventario d : this.inventarioDolci) {
               if (d.getDolce().getNome().equals(dolce.getNome())) {
                   if (d.getQuantita() <= 0) {
                       throw new ArithmeticException("Quantità a magazzino nulla");
                   } else {
                       d.setQuantita(d.getQuantita() - 1);
                       return this.inventarioDolci;
                   }
               }
           }
           throw new RuntimeException("Esempio.Dolce non trovato");
        } else {
            throw new NullPointerException("Il dolce è nullo");
        }
    }

    public ArrayList<DolceInventario> aggiungiDolce(Dolce dolce) {
        if (dolce != null) {
            for (DolceInventario d : this.inventarioDolci) {
                if (d.getDolce().getNome().equals((dolce.getNome()))) {
                    d.setQuantita(d.getQuantita() + 1);
                    return this.inventarioDolci;
                }
            }
            this.inventarioDolci.add(new DolceInventario(dolce,1));
            return this.inventarioDolci;
        } else {
            throw new NullPointerException("Il dolce è null");
        }

    }

    public BigDecimal calcolaVenditeTotale() {
        BigDecimal totale = BigDecimal.ZERO;
        for(DolceInventario dolce : this.vendite) {
            totale = totale.add(dolce.getDolce().getPrezzo().multiply(BigDecimal.valueOf(dolce.getQuantita())));
        }
        return totale;
    }

    public void stampaInventario() {
        if (!inventarioDolci.isEmpty()) {
            for(DolceInventario dolce : this.inventarioDolci) {
                System.out.println(dolce);
            }
        } else {
            System.out.println("L'inventario è vuoto");
        }
    }


}
