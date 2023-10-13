import java.util.Arrays;

public class CarrelloConIva extends Carrello{

    public CarrelloConIva(Articolo[] articoli) {
        super(articoli);
    }



    @Override
    protected boolean isIva() {
        return true;
    }

    @Override
    public String toString() {
        return "CarrelloConIva{" +
                "articoli=" + Arrays.toString(getArticoli()) +
                "prezzo=" + getPrezzoFinale() +
                '}';
    }
}
