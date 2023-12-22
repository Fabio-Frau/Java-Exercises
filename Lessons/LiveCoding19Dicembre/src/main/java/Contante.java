import java.math.BigDecimal;

public class Contante implements MetodoDiPagamento{

    @Override
    public Boolean effettuaPagamento(BigDecimal amount) {
        System.out.println("Effettuo il pagamento con importo: " + amount + " attraverso " + getTipoPagamento());
        return true;
    }

    @Override
    public String getTipoPagamento() {
        return "CONTANTE";
    }
}
