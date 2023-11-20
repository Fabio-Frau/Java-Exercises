import java.util.ArrayList;
import java.util.Scanner;

public class Noleggio {

    private Utente utente;
    private Veicolo veicolo;

    private static void selezionaVeicolo(Veicolo veicolo, Utente utente) {

        Scanner sc = new Scanner(System.in);

        for(Veicolo v : NoleggioVeicoli.getVeicoli()) {
            System.out.println(v);
        }

    }

    public Noleggio(Utente utente, Veicolo veicolo) {
        this.utente = utente;
        this.veicolo = veicolo;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }
}
