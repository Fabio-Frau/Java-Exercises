import java.util.Arrays;

public class Carrello {
    public double prezzoFinale;

    public Articolo[] articoli;

    @Override
    public String toString() {
        return "Carrello{" +
                "prezzoFinale=" + prezzoFinale +
                ", articoli=" + Arrays.toString(articoli) +
                '}';
    }
}
