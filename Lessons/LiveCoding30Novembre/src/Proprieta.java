public class Proprieta {

    private int idProprieta;
    private String nome;
    private String indirizzo;
    private int capienzaMassima;

    public Proprieta(int idProprieta, String nome, String indirizzo, int capienzaMassima) {
        this.idProprieta = idProprieta;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.capienzaMassima = capienzaMassima;
    }

    public int getIdProprieta() {
        return idProprieta;
    }

    public void setIdProprieta(int idProprieta) {
        this.idProprieta = idProprieta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getCapienzaMassima() {
        return capienzaMassima;
    }

    public void setCapienzaMassima(int capienzaMassima) {
        this.capienzaMassima = capienzaMassima;
    }
}
