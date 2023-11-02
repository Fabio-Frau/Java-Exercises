import java.math.BigDecimal;
import java.util.ArrayList;

public class ContoCorrente {

    private final String intestatario;
    private final String iban;
    private BigDecimal saldo;
    private Valuta valuta;

    private ArrayList<Bonifico> listaMovimentiConto;

    public void aggiornaListaMovimenti(Bonifico bonifico) {
        this.listaMovimentiConto.add(bonifico);
    }

    public void versamento(BigDecimal importo) {
        this.saldo = this.saldo.add(importo);
    }

    public void prelievo(BigDecimal importo) {
        if ( this.saldo.compareTo(importo) < 0) {
            System.out.println("Fondi insufficienti");
        } else {
            this.saldo = this.saldo.subtract(importo);
        }
    }

    public ContoCorrente(String intestatario, String iban, BigDecimal saldo, Valuta valuta) {
        this.intestatario = intestatario;
        this.iban = iban;
        this.saldo = saldo;
        this.valuta = valuta;
        this.listaMovimentiConto = new ArrayList<>();
    }

    public String getIntestatario() {
        return intestatario;
    }

    public String getIban() {
        return iban;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Valuta getValuta() {
        return valuta;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }

    @Override
    public String toString() {
        return "ContoCorrente{" +
                "intestatario='" + intestatario + '\'' +
                ", iban='" + iban + '\'' +
                ", saldo=" + saldo +
                ", valuta=" + valuta +
                '}';
    }
}
