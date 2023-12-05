import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Prodotto p1 = new Prodotto("Coca Cola", "Coca Cola HBC", 10,
                TipoProdotto.BIBITA, BigDecimal.valueOf(1.9),
                OffsetDateTime.now());

         Prodotto p2 = new Prodotto("Liquirizia", "Haribo", 100,
                TipoProdotto.ALIMENTO, BigDecimal.valueOf(0.9),
                 OffsetDateTime.now());

         Prodotto p3 = new Prodotto("Pollo arrosto", "Paolino", 5,
                TipoProdotto.GASTRONOMIA, BigDecimal.valueOf(0.9),
                 OffsetDateTime.now());

        ArrayList<Prodotto> lista = new ArrayList<>();

        ProdottoUtility pu = new ProdottoUtility(lista);

        pu.aggiungiProdotto(p1);
        pu.aggiungiProdotto(p2);
        pu.aggiungiProdotto(p3);

        System.out.println(pu.getListaProdotti());


    }

}
