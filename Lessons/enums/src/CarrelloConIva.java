import java.util.Arrays;

public class CarrelloConIva implements Carrello{

    private Articolo[] articoli;
    public CarrelloConIva(Articolo[] articoli) {
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
