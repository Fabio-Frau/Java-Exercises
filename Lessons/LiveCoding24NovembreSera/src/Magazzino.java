import java.util.ArrayList;

public class Magazzino {

    private ArrayList<Prodotto> inventario;
    private ArrayList<Carrello> ordini;

    public Magazzino(ArrayList<Prodotto> inventario, ArrayList<Carrello> ordini) {
        this.inventario = inventario;
        this.ordini = ordini;
    }

    public ArrayList<Prodotto> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Prodotto> inventario) {
        this.inventario = inventario;
    }

    public ArrayList<Carrello> getOrdini() {
        return ordini;
    }

    public void setOrdini(ArrayList<Carrello> ordini) {
        this.ordini = ordini;
    }
}
