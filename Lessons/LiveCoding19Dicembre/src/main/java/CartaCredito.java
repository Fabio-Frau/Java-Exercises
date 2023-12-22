import java.math.BigDecimal;

public class CartaCredito implements MetodoDiPagamento{

    private final String numeroCarta;
    private  final String titolare;

    public CartaCredito(String numeroCarta, String titolare) {
        this.numeroCarta = numeroCarta;
        this.titolare = titolare;
    }

    public String getNumeroCarta() {
        return numeroCarta;
    }

    public String getTitolare() {
        return titolare;
    }

    @Override
    public Boolean effettuaPagamento(BigDecimal amount) {
        System.out.println("Effettuo il pagamento con importo: " + amount + " attraverso " + getTipoPagamento() +
                " con carta " + getNumeroCarta());
        return true;
    }

    @Override
    public String getTipoPagamento() {
        return "CARTA DI CREDITO";
    }
}
