import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Sviluppatore extends Lavoratore{

    private ArrayList<String> linguaggi;

    public Sviluppatore(String nome, String cognome, String email, String identificativo, BigDecimal ral, double bonusPercentage, ArrayList<String> linguaggi) {
        super(nome, cognome, email, identificativo, ral, bonusPercentage);
        this.linguaggi = linguaggi;
    }

    @Override
    public BigDecimal getBonus() {
        setBonusPercentage(getBonusPercentage() + 0.02*linguaggi.size());
        return this.getRal().multiply(BigDecimal.valueOf(getBonusPercentage())).setScale(2, RoundingMode.HALF_EVEN);
    }
}
