package Esempio;

import java.math.BigDecimal;

public class Dolce extends Prodotto{

    private TipoDolce tipoDolce;

    public Dolce(String nome, BigDecimal prezzo, TipoDolce tipoDolce) {
        super(nome, prezzo);
        this.tipoDolce = tipoDolce;
    }

    public TipoDolce getTipoDolce() {
        return tipoDolce;
    }

    public void setTipoDolce(TipoDolce tipoDolce) {
        this.tipoDolce = tipoDolce;
    }

    @Override
    public String toString() {
        return "Esempio.Dolce{" +
                "tipoDolce=" + tipoDolce +
                "} " + super.toString();
    }
}
