//


import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Prodotto> lista = new ArrayList<>();

        Prodotto p1 = new Prodotto("CocaCola", "ghfjs", Tipo.BIBITA, 1, BigDecimal.valueOf(1.90), OffsetDateTime.now().plusYears(2));
        Prodotto p2 = new Prodotto("Liquirizia", "Haribo", Tipo.ALIMENTO, 10, BigDecimal.valueOf(1.5), OffsetDateTime.now().plusMonths(10));
        Prodotto p3 = new Prodotto("Tisana", "Haribo", Tipo.BIBITA, 4, BigDecimal.valueOf(1.5), OffsetDateTime.now().plusMonths(10));

        ProdottiUtils lista1 = new ProdottiUtils(lista);
        lista1.aggiungi(p1);
        lista1.aggiungi(p2);
        lista1.aggiungi(p3);

        //System.out.println(lista1.getListaProdotti());

        //lista1.rimuovi(p3);

       // System.out.println(lista1.getListaProdotti());

        Prodotto p4 = new Prodotto("Fanta", "ghfjs", Tipo.BIBITA, 2, BigDecimal.valueOf(1.90), OffsetDateTime.now().plusDays(1));

        lista1.aggiungi(p4);

        lista1.prodInScadenza(2);

    }
}