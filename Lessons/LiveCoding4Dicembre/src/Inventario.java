import java.math.BigDecimal;
import java.util.ArrayList;

public class Inventario {

    private ArrayList<Prodotto> prodotti;

    public int getQuantita(String nome) {
        int sum = 0;
        for(Prodotto prodotto : this.prodotti) {
            if(prodotto.getNome().equals(nome)) {
                sum++;
            }
        }
        return sum;
    }

    public BigDecimal calcolaValoreTotale() {
        BigDecimal sum = BigDecimal.ZERO;
        for(Prodotto prodotto : this.prodotti) {
            sum = sum.add(prodotto.getPrezzo());
        }

        return sum;
    }

    public Prodotto rimuoviProdotto(int id) {

        for(Prodotto prodotto : prodotti) {
            if (prodotto.getId() == id) {
                prodotti.remove(prodotto);
                return prodotto;
            }
        }

        return null;
    }

    public Prodotto aggiungiProdotto(Prodotto prodotto) {
        this.prodotti.add(prodotto);
        return prodotto;
    }

    public Inventario(ArrayList<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    public ArrayList<Prodotto> getProdotti() {
        return prodotti;
    }

    public void setProdotti(ArrayList<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "prodotti=" + prodotti +
                '}';
    }
}
