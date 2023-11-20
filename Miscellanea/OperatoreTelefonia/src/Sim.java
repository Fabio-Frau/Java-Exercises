import java.math.BigDecimal;
import java.util.ArrayList;

public class Sim {

    private int numeroTelefono;
    private BigDecimal creditoDisponibile;
    private String intestatario;
    private PianoTariffario piano;
    private ArrayList<Telefonata> listaChiamate;


    public double getDurataTotale() {
        double durata = 0;
        for(Telefonata t : this.listaChiamate) {
            durata += t.getDurata();
        }
        return durata;
    }

    public double getDurataTotaleDaDestinatario (int mittente) {
        if ( !(isMittente(mittente))) {
            return 0;
        } else {
            double durata = 0;
            for(Telefonata t : this.listaChiamate) {
                if (t.getNumeroMittente() == mittente) {
                    durata += t.getDurata();
                }
            }
            return durata;
        }
    }

    public double getDurataTotaleDaMittente(int destinatario) {
        if ( !(isDestinatario(destinatario))) {
            return 0;
        } else {
            double durata = 0;
            for(Telefonata t : this.listaChiamate) {
                if (t.getNumeroDestinatario() == destinatario) {
                    durata += t.getDurata();
                }
            }
            return durata;
        }
    }

    public boolean isDestinatario(int destinatario) {
        for (Telefonata t : this.listaChiamate) {
            if (t.getNumeroDestinatario() == destinatario) {
                return true;
            }
        }
        return false;
    }

    public boolean isMittente(int mittente) {
        for (Telefonata t : this.listaChiamate) {
            if (t.getNumeroMittente() == mittente) {
                return true;
            }
        }
        return false;
    }



    public void aggiungiTelefonata(int mittente, int destinatario, double durata) {
        listaChiamate.add(new Telefonata(mittente, destinatario, durata));
    }

    public void aggiungiTelefonata(Telefonata nuovaTelefonata) {
        listaChiamate.add(nuovaTelefonata);
    }

    public Sim(int numeroTelefono, BigDecimal creditoDisponibile, String intestatario,
               PianoTariffario piano, ArrayList<Telefonata> listaChiamate) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = creditoDisponibile;
        this.intestatario = intestatario;
        this.piano = piano;
        this.listaChiamate = listaChiamate;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public BigDecimal getCreditoDisponibile() {
        return creditoDisponibile;
    }

    public void setCreditoDisponibile(BigDecimal creditoDisponibile) {
        this.creditoDisponibile = creditoDisponibile;
    }

    public String getIntestatario() {
        return intestatario;
    }

    public void setIntestatario(String intestatario) {
        this.intestatario = intestatario;
    }

    public PianoTariffario getPiano() {
        return piano;
    }

    public void setPiano(PianoTariffario piano) {
        this.piano = piano;
    }

    public ArrayList<Telefonata> getListaChiamate() {
        return listaChiamate;
    }

    public void setListaChiamate(ArrayList<Telefonata> listaChiamate) {
        this.listaChiamate = listaChiamate;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "numeroTelefono=" + numeroTelefono +
                ", creditoDisponibile=" + creditoDisponibile +
                ", intestatario='" + intestatario + '\'' +
                ", piano=" + piano +
                ", listaChiamate=" + listaChiamate +
                '}';
    }
}
