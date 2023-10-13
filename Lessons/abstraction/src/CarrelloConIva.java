import java.util.Arrays;

public class CarrelloConIva extends Carrello{

    public CarrelloConIva(Articolo[] articoli) {
        super(articoli);
    }

    @Override
    public double getPrezzoFinale() {
        double prezzoFinale = 0.0;

        for (Articolo articolo : getArticoli()) {
            prezzoFinale += articolo.getPrezzo(true);
        }

        return prezzoFinale;
    }

    @Override
    public String toString() {
        return "CarrelloConIva{" +
                "articoli=" + Arrays.toString(getArticoli()) +
                "prezzo=" + getPrezzoFinale() +
                '}';
    }
}
