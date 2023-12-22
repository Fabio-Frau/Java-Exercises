import java.math.BigDecimal;

public interface MetodoDiPagamento {

    public Boolean effettuaPagamento(BigDecimal amount);
    String getTipoPagamento();
}
