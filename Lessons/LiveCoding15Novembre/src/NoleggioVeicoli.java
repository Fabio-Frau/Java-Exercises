import java.util.ArrayList;

public class NoleggioVeicoli {

    private static ArrayList<Veicolo> veicoli;
    private static ArrayList<Utente> utenti;
    private static ArrayList<Noleggio> storico;

//    public NoleggioVeicoli(ArrayList<Veicolo> veicoli, ArrayList<Utente> utenti,
//                           ArrayList<Noleggio> storico) {
//        this.veicoli = veicoli;
//        this.utenti = utenti;
//        this.storico = storico;
//    }

    public static ArrayList<Veicolo> getVeicoli() {
        return veicoli;
    }

    public void setVeicoli(ArrayList<Veicolo> listaveicoli) {
        veicoli = listaveicoli;
    }

    public static ArrayList<Utente> getUtenti() {
        return utenti;
    }

    public void setUtenti(ArrayList<Utente>listautenti) {
        utenti = listautenti;
    }

    public static ArrayList<Noleggio> getStorico() {
        return storico;
    }

    public void setStorico(ArrayList<Noleggio> listastorico) {
        storico = listastorico;
    }
}
