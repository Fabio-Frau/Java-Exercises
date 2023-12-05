import java.time.OffsetDateTime;

public class Viaggio {

    private int id;
    private String mezzo_di_trasporto;
    private OffsetDateTime data_inizio;
    private OffsetDateTime data_fine;
    private String descrizione;
    private boolean disponibilita;
    private double costo;

    public Viaggio(int id, String mezzo_di_trasporto, OffsetDateTime data_inizio, OffsetDateTime data_fine, String descrizione, boolean disponibilita, double costo) {
        this.id = id;
        this.mezzo_di_trasporto = mezzo_di_trasporto;
        this.data_inizio = data_inizio;
        this.data_fine = data_fine;
        this.descrizione = descrizione;
        this.disponibilita = disponibilita;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMezzo_di_trasporto() {
        return mezzo_di_trasporto;
    }

    public void setMezzo_di_trasporto(String mezzo_di_trasporto) {
        this.mezzo_di_trasporto = mezzo_di_trasporto;
    }

    public OffsetDateTime getData_inizio() {
        return data_inizio;
    }

    public void setData_inizio(OffsetDateTime data_inizio) {
        this.data_inizio = data_inizio;
    }

    public OffsetDateTime getData_fine() {
        return data_fine;
    }

    public void setData_fine(OffsetDateTime data_fine) {
        this.data_fine = data_fine;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public boolean isdisponibilita() {
        return disponibilita;
    }

    public void setdisponibilita(boolean disponibilita) {
        this.disponibilita = disponibilita;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Viaggio{" +
                "id=" + id +
                ", mezzo_di_trasporto='" + mezzo_di_trasporto + '\'' +
                ", data_inizio=" + data_inizio +
                ", data_fine=" + data_fine +
                ", descrizione='" + descrizione + '\'' +
                ", disponibilita=" + disponibilita +
                ", costo=" + costo +
                '}';
    }
}
