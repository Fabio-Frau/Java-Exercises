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

    public double getPrezzoFinale() {
        double prezzoFinale = 0.0;

        for (Articolo articolo : getArticoli()) {
            prezzoFinale += articolo.getPrezzo(isIva());
        }

        return  prezzoFinale;
    }

    protected abstract boolean isIva();


    @Override
    public String toString() {
        return "Carrello{" +
                "articoli=" + Arrays.toString(getArticoli()) +
                '}';
    }
}
