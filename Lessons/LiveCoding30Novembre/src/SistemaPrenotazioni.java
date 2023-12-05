import java.time.OffsetDateTime;
import java.util.ArrayList;

public class SistemaPrenotazioni {

    private ArrayList<Proprieta> proprieta;
    private ArrayList<Utente> utenti;
    private ArrayList<Prenotazione> prenotazioni;

    public SistemaPrenotazioni(ArrayList<Proprieta> proprieta, ArrayList<Utente> utenti,
                               ArrayList<Prenotazione> prenotazioni) {
        this.proprieta = proprieta;
        this.utenti = utenti;
        this.prenotazioni = prenotazioni;
    }

        public Prenotazione creaPrenotazione(Proprieta proprieta, Utente utente,
                                         OffsetDateTime dataInizio, OffsetDateTime dataFine)
    {
        if( checkDisponibilità(proprieta, dataInizio, dataFine)) {
            Prenotazione prenotazione = new Prenotazione(this.prenotazioni.size(), utente.getIdUtente(),proprieta.getIdProprieta(), dataInizio, dataFine);
            prenotazioni.add(prenotazione);
            return prenotazione;
        } else {
            return null;
        }
    }

    ///mettere id proprieta
    public boolean checkDisponibilità(Proprieta proprieta, OffsetDateTime dataInizio,
                                      OffsetDateTime dataFine) {

        return getStanzeDisponibili(proprieta, dataInizio, dataFine) > 0;
    }

    public int getStanzeDisponibili(Proprieta proprieta, OffsetDateTime dataInizio,
                                    OffsetDateTime dataFine) {
        int stanzeOccupate = 0;
        for(Prenotazione prenotazione : this.prenotazioni) {
            if(prenotazione.getIdProprieta() == proprieta.getIdProprieta() &&
                    (prenotazione.getDateFine().isAfter(dataInizio) && prenotazione.getDataInizio().isBefore(dataFine))) {
                stanzeOccupate++;
            }
        }

        return proprieta.getCapienzaMassima() - stanzeOccupate;
    }

    public void printPrenotazioni() {
        for(Prenotazione prenotazione : this.prenotazioni) {
            System.out.println(prenotazione);
        }
    }

    public ArrayList<Proprieta> getProprieta() {
        return proprieta;
    }

    public void setProprieta(ArrayList<Proprieta> proprieta) {
        this.proprieta = proprieta;
    }

    public ArrayList<Utente> getUtenti() {
        return utenti;
    }

    public void setUtenti(ArrayList<Utente> utenti) {
        this.utenti = utenti;
    }

    public ArrayList<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(ArrayList<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }
}
