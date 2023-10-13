import java.util.Arrays;

public abstract class Carrello {

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

    public abstract double getPrezzoFinale();


    @Override
    public String toString() {
        return "Carrello{" +
                "articoli=" + Arrays.toString(getArticoli()) +
                '}';
    }
}
