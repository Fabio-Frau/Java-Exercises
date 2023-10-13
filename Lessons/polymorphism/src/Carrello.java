import java.util.Arrays;

public class Carrello {

    private Articolo[] articoli;

    public Carrello(Articolo[] articoli) {
        setArticoli(articoli);
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
    }

    public double getPrezzoFinale() {
        return 0.0;
    }


    @Override
    public String toString() {
        return "Carrello{" +
                "articoli=" + Arrays.toString(getArticoli()) +
                '}';
    }
}
