import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class MovimentiBancari {

    private OffsetDateTime timeStamp;

    private String beneficiario;
//    private String ordinante;
//    private BigDecimal importo;
//    private Valuta valuta;

    public static void bonifico(ContoCorrente ordinante, ContoCorrente beneficiario, BigDecimal importo) {
        if ( importo.compareTo(ordinante.getSaldo()) > 0) {
            System.out.println("Fondi insufficienti");
        } else {
            ordinante.setSaldo(ordinante.getSaldo().subtract(importo));
            beneficiario.setSaldo(beneficiario.getSaldo().add(importo));
            System.out.println(ordinante);
            System.out.println(beneficiario);
        }

    }




}
