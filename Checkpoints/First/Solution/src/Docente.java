public class Docente {

    private String nome;
    private String cognome;
    private int eta;
    private String codice;

    public Docente(String nome, String cognome, int eta, String codice) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }
}
