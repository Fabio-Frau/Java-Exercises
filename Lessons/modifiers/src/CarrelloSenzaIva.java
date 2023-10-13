import java.util.Arrays;

public class CarrelloSenzaIva extends Carrello {

    public CarrelloSenzaIva(Articolo[] articoli) {
        super(articoli);
    }



    @Override
    protected boolean isIva() {
        return false;
    }

    @Override
    public String toString() {
        return "CarrelloSenzaIva{" +
                "articoli=" + Arrays.toString(getArticoli()) +
                "prezzo=" + getPrezzoFinale() +
                '}';
    }

}
