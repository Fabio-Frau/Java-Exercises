import java.math.BigDecimal;

public class ContoBancario {

    private String iban;
    private BigDecimal saldo;

    public ContoBancario(String iban, BigDecimal saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
