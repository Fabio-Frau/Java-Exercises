public class Telefonata {

    private int numeroMittente;
    private int numeroDestinatario;
    private double durata;

    public Telefonata(int numeroMittente, int numeroDestinatario, double durata) {
        this.numeroMittente = numeroMittente;
        this.numeroDestinatario = numeroDestinatario;
        this.durata = durata;
    }

    public int getNumeroMittente() {
        return numeroMittente;
    }

    public void setNumeroMittente(int numeroMittente) {
        this.numeroMittente = numeroMittente;
    }

    public int getNumeroDestinatario() {
        return numeroDestinatario;
    }

    public void setNumeroDestinatario(int numeroDestinatario) {
        this.numeroDestinatario = numeroDestinatario;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Telefonata{" +
                "numeroMittente=" + numeroMittente +
                ", numeroDestinatario=" + numeroDestinatario +
                ", durata=" + durata +
                '}';
    }
}
