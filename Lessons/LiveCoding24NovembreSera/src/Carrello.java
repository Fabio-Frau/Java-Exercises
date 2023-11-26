import java.util.ArrayList;

public class Carrello {

    private ArrayList<Prodotto> prodotti;
    private Cliente cliente;

    public Carrello(ArrayList<Prodotto> prodotti, Cliente cliente) {
        this.prodotti = prodotti;
        this.cliente = cliente;
    }

    public ArrayList<Prodotto> getProdotti() {
        return prodotti;
    }

    public void setProdotti(ArrayList<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
