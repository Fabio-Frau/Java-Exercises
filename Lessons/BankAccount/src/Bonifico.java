import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Bonifico {

    private final String beneficiario;
    private final String ordinante;
    private final String ibanBeneficiario;
    private final String ibanOrdinante;

    private final Valuta divisa;
    private final BigDecimal importo;
    private final String causale;
    private final OffsetDateTime dataOrdine;
   private final int idTransazione;

    public Bonifico(String beneficiario, String ordinante, String ibanBeneficiario, String ibanOrdinante,
                    Valuta divisa, BigDecimal importo, String causale, OffsetDateTime dataOrdine) {
        this.beneficiario = beneficiario;
        this.ordinante = ordinante;
        this.ibanBeneficiario = ibanBeneficiario;
        this.ibanOrdinante = ibanOrdinante;
        this.divisa = divisa;
        this.importo = importo;
        this.causale = causale;
        this.dataOrdine = dataOrdine;
        this.idTransazione = this.toString().hashCode();
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public String getOrdinante() {
        return ordinante;
    }

    public String getIbanBeneficiario() {
        return ibanBeneficiario;
    }

    public String getIbanOrdinante() {
        return ibanOrdinante;
    }

    public Valuta getDivisa() {
        return divisa;
    }

    public BigDecimal getImporto() {
        return importo;
    }

    public String getCausale() {
        return causale;
    }

    public OffsetDateTime getDataOrdine() {
        return dataOrdine;
    }

    @Override
    public String toString() {
        return "Bonifico{" +
                "beneficiario='" + beneficiario + '\'' +
                ", ordinante='" + ordinante + '\'' +
                ", ibanBeneficiario='" + ibanBeneficiario + '\'' +
                ", ibanOrdinante='" + ibanOrdinante + '\'' +
                ", divisa=" + divisa +
                ", importo=" + importo +
                ", causale='" + causale + '\'' +
                ", dataOrdine=" + dataOrdine +
                ", idTransazione=" + idTransazione +
                '}';
    }
}
