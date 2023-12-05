import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Main {

    Viaggio v1 = new Viaggio(1, "Aereo", OffsetDateTime.parse("2016-12-27T08:15:06.674+01:00"),
            OffsetDateTime.parse("2017-01-07T08:15:06.674+01:00"), "Viaggio in Sardegna", true, 90);

    Viaggio v2 = new Viaggio(2, "Autobus", OffsetDateTime.parse("2016-12-27T08:15:06.674+01:00"),
            OffsetDateTime.parse("2017-01-07T08:15:06.674+01:00"), "Viaggio a Roma", false, 9000);

    Viaggio v3 = new Viaggio(3, "Auto", OffsetDateTime.parse("2016-12-27T08:15:06.674+01:00"),
            OffsetDateTime.parse("2017-01-07T08:15:06.674+01:00"), "Viaggio a Sorpresa", true, 500);

    Cliente c1 = new Cliente("Fabio", "Frau", "fabio@mail.com");
    Cliente c2 = new Cliente("Donald", "Duck", "donald@mail.com");
    Cliente c3 = new Cliente("Mickey", "Mouse", "mickey@mail.com");

}

// viaggio ( Stringa mezzo di trasporto, data di inizio, data di fine, stinga descrizione, costo, disponibilità)
// viaggioUtils (metdi)
// main