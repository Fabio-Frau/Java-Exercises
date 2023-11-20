public class Utente {

    private String nome;
    private String cognome;
    private int eta;
    private TipoDocumento tipoDocumento;
    private String idDocumento;

    public Utente(String nome, String cognome, int eta, TipoDocumento tipoDocumento,
                  String idDocumento) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.tipoDocumento = tipoDocumento;
        this.idDocumento = idDocumento;
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

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }
}
