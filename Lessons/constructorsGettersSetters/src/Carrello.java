import java.util.Arrays;

public class Carrello {


    Articolo[] articoli;

    double prezzoFinale;

    @Override
    public String toString() {
        return "Carrello{" +
                "articoli=" + Arrays.toString(articoli) +
                ", prezzoFinale=" + prezzoFinale +
                '}';
    }
}
