import java.time.OffsetDateTime;

public class Prenotazione {

    private int idPrenotazione;
    private int idUtente;
    private int idProprieta;
    private OffsetDateTime dataInizio;
    private OffsetDateTime dateFine;

    public Prenotazione(int idPrenotazione, int idUtente, int idProprieta,
                        OffsetDateTime dataInizio, OffsetDateTime dateFine) {
        this.idPrenotazione = idPrenotazione;
        this.idUtente = idUtente;
        this.idProprieta = idProprieta;
        this.dataInizio = dataInizio;
        this.dateFine = dateFine;
    }




    public int getIdPrenotazione() {
        return idPrenotazione;
    }

    public void setIdPrenotazione(int idPrenotazione) {
        this.idPrenotazione = idPrenotazione;
    }

    public int getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }

    public int getIdProprieta() {
        return idProprieta;
    }

    public void setIdProprieta(int idProprieta) {
        this.idProprieta = idProprieta;
    }

    public OffsetDateTime getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(OffsetDateTime dataInizio) {
        this.dataInizio = dataInizio;
    }

    public OffsetDateTime getDateFine() {
        return dateFine;
    }

    public void setDateFine(OffsetDateTime dateFine) {
        this.dateFine = dateFine;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "idPrenotazione=" + idPrenotazione +
                ", idUtente=" + idUtente +
                ", idProprieta=" + idProprieta +
                ", dataInizio=" + dataInizio +
                ", dateFine=" + dateFine +
                '}';
    }
}
