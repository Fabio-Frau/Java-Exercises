public class Veicolo {

    private String targa;
    private String modello;

    public Veicolo(String targa, String modello) {
        this.targa = targa;
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
}
