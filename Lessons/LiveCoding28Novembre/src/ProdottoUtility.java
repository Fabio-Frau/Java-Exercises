import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;

public class ProdottoUtility {

    private ArrayList<Prodotto> listaProdotti;

    public ProdottoUtility(ArrayList<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public ArrayList<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(ArrayList<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public ArrayList<Prodotto> aggiungiProdotto(Prodotto prodotto) {
        this.listaProdotti.add(prodotto);
        return this.listaProdotti;
    }

    public ArrayList<Prodotto> rimuoviProdotto(Prodotto prodotto) {
        if( !(this.listaProdotti.isEmpty()) && this.listaProdotti.contains(prodotto)) {
            this.listaProdotti.remove(prodotto);
        }
        return this.listaProdotti;
    }

    public ArrayList<Prodotto> checkExpirationDate( int daysAfter) {

        ArrayList<Prodotto> expiringProd = new ArrayList<>();

        for (Prodotto prodotto : this.listaProdotti) {
            if (prodotto.getScadenza().isAfter(OffsetDateTime.now().plusDays(daysAfter))) {
                expiringProd.add(prodotto);

            }
        }
        return expiringProd;

    }

    public ArrayList<Prodotto> checkExpirationDate1( int daysAfter) {

        ArrayList<Prodotto> expiringProd = new ArrayList<>();


        for (Prodotto prodotto : this.listaProdotti) {
            long d = Duration.between(prodotto.getScadenza(), OffsetDateTime.now().plusDays(daysAfter)).toDays();
            if (d > 0) {
                expiringProd.add(prodotto);
            }
        }
        return expiringProd;

    }
}
