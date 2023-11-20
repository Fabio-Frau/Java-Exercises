public class Veicolo {

    private String marca;
    private String modello;
    private String propulsione;
    private String colore;
    private int posti;
    private Boolean noleggiato;

    public Veicolo(String marca, String modello, String propulsione,
                   String colore, int posti, Boolean noleggiato) {
        this.marca = marca;
        this.modello = modello;
        this.propulsione = propulsione;
        this.colore = colore;
        this.posti = posti;
        this.noleggiato = noleggiato;
    }

    public Boolean getNoleggiato() {
        return noleggiato;
    }

    public void setNoleggiato(Boolean noleggiato) {
        this.noleggiato = noleggiato;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getPropulsione() {
        return propulsione;
    }

    public void setPropulsione(String propulsione) {
        this.propulsione = propulsione;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getPosti() {
        return posti;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }



}
