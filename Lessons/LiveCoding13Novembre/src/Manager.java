import java.math.BigDecimal;

public class Manager extends Lavoratore{

    public Manager(String nome, String cognome, String email, String identificativo, BigDecimal ral, double bonusPercentage) {
        super(nome, cognome, email, identificativo, ral, bonusPercentage);
    }
}
