public class Barca extends Veicolo{

    private int CV;
    private String tipoMotore;
    private int lunghezza;
    private Boolean flyingBridge;
    private Boolean delfiniera;
    private String gps;

    public Barca(String marca, String modello, String propulsione, String colore,
                 int posti, Boolean noleggiato, int CV, String tipoMotore,
                 int lunghezza, Boolean flyingBridge, Boolean delfiniera, String gps) {
        super(marca, modello, propulsione, colore, posti, noleggiato);
        this.CV = CV;
        this.tipoMotore = tipoMotore;
        this.lunghezza = lunghezza;
        this.flyingBridge = flyingBridge;
        this.delfiniera = delfiniera;
        this.gps = gps;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }

    public String getTipoMotore() {
        return tipoMotore;
    }

    public void setTipoMotore(String tipoMotore) {
        this.tipoMotore = tipoMotore;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public Boolean getFlyingBridge() {
        return flyingBridge;
    }

    public void setFlyingBridge(Boolean flyingBridge) {
        this.flyingBridge = flyingBridge;
    }

    public Boolean getDelfiniera() {
        return delfiniera;
    }

    public void setDelfiniera(Boolean delfiniera) {
        this.delfiniera = delfiniera;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }
}
