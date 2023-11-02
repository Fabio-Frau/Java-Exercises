import java.math.BigDecimal;
import java.time.Duration;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Sim {

    private final int numero;
    private BigDecimal credito;
    private ArrayList<Telefonata> telefonate;


    public Sim(int numero, BigDecimal credito, ArrayList<Telefonata> telefonate) {
        this.numero = numero;
        this.credito = credito;
        this.telefonate = telefonate;
    }

    public ArrayList<Telefonata> filtraTelefonate(ArrayList<Telefonata> registro) {
        ArrayList<Telefonata> registroLocale = new ArrayList<Telefonata>();
        for (Telefonata telefonata : registro) {
            if (telefonata.getNumUscita() == numero || telefonata.getNumEntrata() == numero ) {
                registroLocale.add(telefonata);
            }
        }
        return registroLocale;
    }

    public Duration durataTelefonate(ArrayList<Telefonata> registro) {
        int sum = 0;
        for (Telefonata telefonata : filtraTelefonate(registro)) {
            sum += telefonata.getDurata();
        }


        return Duration.ofMinutes(sum);
    }

    public int getNumero() {
        return numero;
    }

    public BigDecimal getCredito() {
        return credito;
    }

    public ArrayList<Telefonata> getTelefonate() {
        return telefonate;
    }
}
