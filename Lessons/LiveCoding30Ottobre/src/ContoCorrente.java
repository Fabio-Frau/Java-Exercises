import java.math.BigDecimal;

public class ContoCorrente {

    private String intestatario;
    private String iban;
    private BigDecimal saldo;
    private Valuta valuta;



    public ContoCorrente(String intestatario,String iban, BigDecimal saldo, Valuta valuta) {
        this.saldo = saldo;
        this.intestatario = intestatario;
        this.iban = iban;
        this.valuta = valuta;
    }

    public Valuta getValuta() {
        return valuta;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getIntestatario() {
        return intestatario;
    }

    public void setIntestatario(String intestatario) {
        this.intestatario = intestatario;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
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
