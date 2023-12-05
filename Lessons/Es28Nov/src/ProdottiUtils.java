import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;

public class ProdottiUtils {

    ArrayList<Prodotto> listaProdotti;

    public ProdottiUtils(ArrayList<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public ArrayList<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public  ArrayList<Prodotto> aggiungi(Prodotto p){
         listaProdotti.add(p);
         return  listaProdotti;
    }

    public ArrayList<Prodotto> rimuovi(Prodotto p){
        if (!(listaProdotti.isEmpty()) && listaProdotti.contains(p)) {
            listaProdotti.remove(p);
        }
        return listaProdotti;
    }

    public void prodInScadenza(int giorni){
        for (Prodotto p : listaProdotti){
         long d = Duration.between(p.getScadenza(), OffsetDateTime.now().plusDays(giorni)).toDays();
            if (d > 0) {
                System.out.println( p + " è in scadenza");
            } else {
                System.out.println(p + " : Il prodotto puo' rimanere nello scaffale");
            }
        }
    }
}
