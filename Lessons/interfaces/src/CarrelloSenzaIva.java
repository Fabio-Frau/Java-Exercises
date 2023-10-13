import java.util.Arrays;

public class CarrelloSenzaIva implements Carrello {

    private Articolo[] articoli;

    public CarrelloSenzaIva(Articolo[] articoli) {
        setArticoli(articoli);
    }


    @Override
    public Articolo[] getArticoli() {
        return articoli;
    }

    @Override
    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;

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
