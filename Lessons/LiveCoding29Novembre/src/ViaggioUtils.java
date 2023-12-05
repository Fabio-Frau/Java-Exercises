import java.util.ArrayList;

public class ViaggioUtils {


    ArrayList<Viaggio> viaggi = new ArrayList<>();

    public ViaggioUtils(ArrayList<Viaggio> viaggi) {
        this.viaggi = viaggi;
    }

    public ArrayList<Viaggio> getViaggi() {
        return viaggi;
    }

    public void setViaggi(ArrayList<Viaggio> viaggi) {
        this.viaggi = viaggi;
    }

    public ArrayList<Viaggio> aggiunta (Viaggio viaggio) {
        viaggi.add(viaggio);
        return viaggi;
    }

    public ArrayList<Viaggio> rimozione (Viaggio viaggio) {
        viaggi.remove(viaggio);
        return viaggi;
    }

    public ArrayList<Viaggio> disponibili () {
        ArrayList<Viaggio> viaggiDisponibili = new ArrayList<>();
        for(Viaggio x : viaggi) {
            if(x.isdisponibilita()) {
                viaggiDisponibili.add(x);
            }
        } return viaggiDisponibili;
    }


    public ArrayList<Viaggio> prenotati () {
        ArrayList<Viaggio> viaggiPrenotati = new ArrayList<>();
        for(Viaggio x : viaggi) {
            if(!(x.isdisponibilita())) {
                viaggiPrenotati.add(x);
            }
        } return viaggiPrenotati;
    }

    public Viaggio dettagliViaggio (int id) {
        for (Viaggio x : viaggi) {
            if (x.getId()== id) {
                return x;
            }
        }
        return null;
    }

    public double ricavoTotatle () {
        double sum = 0;
        for(Viaggio x : viaggi) {
            sum += x.getCosto();
        } return sum;
    }



}


//        Aggiungere un nuovo viaggio all'agenzia
//        Rimuovere un viaggio
//        Visualizzare l'elenco di tutti i viaggi disponibili
//        Visualizzare l'elenco di viaggi prenotati
//        Visualizzare i dettagli di un viaggio specifico
//        Calcolare e restituire il ricavo totale dell'agenzia