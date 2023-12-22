package Esempio;

public class DolceInventario {

    private Dolce dolce;
    private int quantita;

    public DolceInventario(Dolce dolce, int quantita) {
        this.dolce = dolce;
        this.quantita = quantita;
    }

    public Dolce getDolce() {
        return dolce;
    }

    public void setDolce(Dolce dolce) {
        this.dolce = dolce;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "Esempio.DolceInventario{" +
                "dolce=" + dolce +
                ", quantita=" + quantita +
                '}';
    }
}
