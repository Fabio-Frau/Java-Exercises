import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Lavoratore {

    public Lavoratore(String nome, String cognome, String email, String identificativo,
                      BigDecimal ral, double bonusPercentage) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.identificativo = identificativo;
        this.ral = ral;
        this.bonusPercentage = bonusPercentage;
    }

    private String nome;
    private String cognome;
    private String email;
    private String identificativo;
    private BigDecimal ral;
    private double bonusPercentage;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(String identificativo) {
        this.identificativo = identificativo;
    }

    public BigDecimal getRal() {
        return ral;
    }

    public void setRal(BigDecimal ral) {
        this.ral = ral;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public BigDecimal getBonus() {
        return ral.multiply(BigDecimal.valueOf(bonusPercentage / 100)).setScale(2, RoundingMode.HALF_EVEN);
    }
}
