import java.time.OffsetDateTime;

public class Task {

    private String descrizione;
    private boolean stato;
    private OffsetDateTime scadenza;

    public Task(String descrizione, boolean stato, OffsetDateTime scadenza) {
        this.descrizione = descrizione;
        this.stato = stato;
        this.scadenza = scadenza;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public boolean isStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    public OffsetDateTime getScadenza() {
        return scadenza;
    }

    public void setScadenza(OffsetDateTime scadenza) {
        this.scadenza = scadenza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (stato != task.stato) return false;
        if (!descrizione.equals(task.descrizione)) return false;
        return scadenza.equals(task.scadenza);
    }

    @Override
    public int hashCode() {
        int result = descrizione.hashCode();
        result = 31 * result + (stato ? 1 : 0);
        result = 31 * result + scadenza.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "descrizione='" + descrizione + '\'' +
                ", stato=" + stato +
                ", scadenza=" + scadenza +
                '}';
    }
}


  /*  La classe Task dovrebbe rappresentare un singolo compito. Ogni compito ha una descrizione una scadenza e uno stato che indica se è stato completato o meno.
        La classe dovrebbe avere i seguenti attributi privati:
        description: la descrizione del compito.
        completed: uno stato che indica se il compito è stato completato o meno.
        expiration: rappresenta la scadenza prefissata per quel compito.
        La classe dovrebbe avere un costruttore che accetta la descrizione del compito, la scadenza e il valore di completato.
        Deve fornire metodi pubblici (getter e setter) per tutti i parametri definiti.*/
