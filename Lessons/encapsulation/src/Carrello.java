import java.util.Arrays;

public class Carrello {

    private double prezzoFinale;

    private Articolo[] articoli;

    public Carrello (Articolo[] articoli) {
        setArticoli(articoli);
    }


    public Articolo[] getArticoli() {
        return articoli;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
        this.prezzoFinale = 0.0;

        for (Articolo articolo : articoli) {
            prezzoFinale += articolo.getPrezzo();
        }
    }

    public double getPrezzoFinale() {
        return prezzoFinale;
    }


    @Override
    public String toString() {
        return "Carrello{" +
                "prezzoFinale=" + prezzoFinale +
                ", articoli=" + Arrays.toString(articoli) +
                '}';
    }
}
