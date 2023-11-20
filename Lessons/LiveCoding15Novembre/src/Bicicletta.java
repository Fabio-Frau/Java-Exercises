public class Bicicletta extends Veicolo{


    private Tipo tipo;
    private Boolean marce;
    private String telaio;
    private double dimensioneRuote;

    public Bicicletta(String marca, String modello, String propulsione,
                      String colore, int posti, Boolean noleggiato,
                      Tipo tipo, Boolean marce, String telaio, double dimensioneRuote) {
        super(marca, modello, propulsione, colore, posti, noleggiato);
        this.tipo = tipo;
        this.marce = marce;
        this.telaio = telaio;
        this.dimensioneRuote = dimensioneRuote;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Boolean getMarce() {
        return marce;
    }

    public void setMarce(Boolean marce) {
        this.marce = marce;
    }

    public String getTelaio() {
        return telaio;
    }

    public void setTelaio(String telaio) {
        this.telaio = telaio;
    }

    public double getDimensioneRuote() {
        return dimensioneRuote;
    }

    public void setDimensioneRuote(double dimensioneRuote) {
        this.dimensioneRuote = dimensioneRuote;
    }
}
