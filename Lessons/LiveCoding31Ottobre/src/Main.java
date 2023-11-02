import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Telefonata telefonata1 = new Telefonata(123456789, 64644, OffsetDateTime.now(), 50);
        Telefonata telefonata2 = new Telefonata(123456789, 4512, OffsetDateTime.now(), 60);
        Telefonata telefonata3 = new Telefonata(55555, 00000, OffsetDateTime.now(), 73);

        ArrayList<Telefonata> lista = new ArrayList<>();
        lista.add(telefonata1);
        lista.add(telefonata2);
        lista.add(telefonata3);


        Sim sim1 = new Sim(123456789, BigDecimal.valueOf(50.2), lista);
        ArrayList<Telefonata> registroPersonale = sim1.filtraTelefonate(sim1.getTelefonate());
        for(Telefonata telefonata : registroPersonale) {
            System.out.println(telefonata);
        }

        System.out.println("Durata totale: " + sim1.durataTelefonate(lista));

    }
}
