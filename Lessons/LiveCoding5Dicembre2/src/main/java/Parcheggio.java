import java.util.ArrayList;

public class Parcheggio {

    private String nome;
    private double numPostiMassimo;
    private ArrayList<Veicolo> listaVeicolo;

    public Parcheggio(String nome, double numPostiMassimo, ArrayList<Veicolo> listaVeicolo) {
        this.nome = nome;
        this.numPostiMassimo = numPostiMassimo;
        this.listaVeicolo = listaVeicolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumPostiMassimo() {
        return numPostiMassimo;
    }

    public void setNumPostiMassimo(double numPostiMassimo) {
        this.numPostiMassimo = numPostiMassimo;
    }

    public ArrayList<Veicolo> getListaVeicolo() {
        return listaVeicolo;
    }

    public void setListaVeicolo(ArrayList<Veicolo> listaVeicolo) {
        this.listaVeicolo = listaVeicolo;
    }

    public ArrayList<Veicolo> aggiungiVeicolo(Veicolo veicolo) {
        if ( this.listaVeicolo.size() < this.numPostiMassimo) {
            this.listaVeicolo.add(veicolo);
        } else {
            return null;
        }
    }
}
