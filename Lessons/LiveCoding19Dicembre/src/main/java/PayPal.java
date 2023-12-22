import java.math.BigDecimal;

public class PayPal implements MetodoDiPagamento {

    final String email;

    public PayPal(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public Boolean effettuaPagamento(BigDecimal amount) {
        System.out.println("Effettuo il pagamento con importo: " + amount + " attraverso " + getTipoPagamento() +
                " con email " + getEmail());
        return true;
    }

    @Override
    public String getTipoPagamento() {
        return "PAYPAL";
    }
}
