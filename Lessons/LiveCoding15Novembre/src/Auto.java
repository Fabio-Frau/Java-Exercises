public class Auto extends Veicolo{

    private int cilindrata;
    private String targa;
    private int numeroPorte;
    private Segmento segmento;

    public Auto(String marca, String modello, String propulsione, String colore,
                int posti, Boolean noleggiato, int cilindrata, String targa,
                int numeroPorte, Segmento segmento) {
        super(marca, modello, propulsione, colore, posti, noleggiato);
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.numeroPorte = numeroPorte;
        this.segmento = segmento;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public Segmento getSegmento() {
        return segmento;
    }

    public void setSegmento(Segmento segmento) {
        this.segmento = segmento;
    }
}
