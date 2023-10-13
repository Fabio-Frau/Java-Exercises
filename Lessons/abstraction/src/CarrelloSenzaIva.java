import java.util.Arrays;

public class CarrelloSenzaIva extends Carrello {

    public CarrelloSenzaIva(Articolo[] articoli) {
        super(articoli);
    }

    @Override
    public double getPrezzoFinale() {
        double prezzoFinale = 0.0;

        for (Articolo articolo : getArticoli()) {
            prezzoFinale += articolo.getPrezzo(false);
        }

        return prezzoFinale;
    }

    @Override
    public String toString() {
        return "CarrelloSenzaIva{" +
                "articoli=" + Arrays.toString(getArticoli()) +
                "prezzo=" + getPrezzoFinale() +
                '}';
    }

}
