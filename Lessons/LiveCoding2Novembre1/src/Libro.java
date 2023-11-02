import java.math.BigDecimal;

public class Libro {
    private String titolo;
    private String autore;
    private int numeroPagine;
    private Versione versione;
    private BigDecimal prezzoLancio;
    private BigDecimal prezzoAttuale;

    public void applicaSconto10() {
        this.prezzoAttuale = this.prezzoAttuale.multiply(BigDecimal.valueOf(0.9));
    }

    public void applicaSconto(int percentuale) {
        this.prezzoAttuale = this.prezzoAttuale.multiply(BigDecimal.valueOf(1).subtract(BigDecimal.valueOf(percentuale/100)));
    }

    public Libro(String titolo, String autore, int numeroPagine, Versione versione,
                 BigDecimal prezzoLancio, BigDecimal prezzoAttuale) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
        this.versione = versione;
        this.prezzoLancio = prezzoLancio;
        this.prezzoAttuale = prezzoAttuale;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public Versione getVersione() {
        return versione;
    }

    public void setVersione(Versione versione) {
        this.versione = versione;
    }

    public BigDecimal getPrezzoLancio() {
        return prezzoLancio;
    }

    public void setPrezzoLancio(BigDecimal prezzoLancio) {
        this.prezzoLancio = prezzoLancio;
    }

    public BigDecimal getPrezzoAttuale() {
        return prezzoAttuale;
    }

    public void setPrezzoAttuale(BigDecimal prezzoAttuale) {
        this.prezzoAttuale = prezzoAttuale;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", numeroPagine=" + numeroPagine +
                ", versione=" + versione +
                ", prezzoLancio=" + prezzoLancio +
                ", prezzoAttuale=" + prezzoAttuale +
                '}';
    }
}
