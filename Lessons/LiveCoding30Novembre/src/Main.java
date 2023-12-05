/*Immagina di dover creare un sistema di prenotazione di alloggi per una piattaforma di viaggi.
Il sistema deve gestire proprietà, utenti, prenotazioni. Ogni proprietà ha un nome, un indirizzo
 e un numero di stanze disponibili. Ogni utente ha un nome, un'email e può effettuare prenotazioni.
  Le prenotazioni collegano un utente a una proprietà per un periodo specifico.

Definire un metodo di ricerca di prenotazione per una data.
Definire un metodo che visualizzi tutte le prenotazioni.*/

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Proprieta prop1 = new Proprieta(1,"Hotel1", "Via dei pazzi", 3);
        Proprieta prop2 = new Proprieta(2,"Hotel il Ponte", "sotto il cavalcavia", 2);

        Utente u1 = new Utente(1,"Fabio", "fabio@mail.com");
        Utente u2 = new Utente(2,"Paperino", "paperino@mail.com");
        Utente u3 = new Utente(3,"Topolino", "topolino@mail.com");

        ArrayList<Proprieta> prop = new ArrayList<>();
        prop.add(prop1);
        prop.add(prop2);

        Prenotazione pren1 = new Prenotazione(1,1,2,
                OffsetDateTime.of(2023,12,30,10,30,0,0, ZoneOffset.UTC),
                OffsetDateTime.of(2024,01,30,10,30,0,0, ZoneOffset.UTC));

        Prenotazione pren2 = new Prenotazione(2,1,2,
                OffsetDateTime.of(2024,01,6,10,30,0,0, ZoneOffset.UTC),
                OffsetDateTime.of(2024,01,18,10,30,0,0, ZoneOffset.UTC));


        ArrayList<Prenotazione> pren = new ArrayList<>();
        pren.add(pren1);
        pren.add(pren2);


        SistemaPrenotazioni sp = new SistemaPrenotazioni(prop,null, pren );

        boolean test = sp.checkDisponibilità(prop2, OffsetDateTime.of(2024,1,7,10,30,0,0, ZoneOffset.UTC),
                OffsetDateTime.of(2024,1,15,10,30,0,0, ZoneOffset.UTC));

        boolean test1 = sp.checkDisponibilità(prop2, OffsetDateTime.of(2024,1,18,10,30,0,0, ZoneOffset.UTC),
                OffsetDateTime.of(2024,1,20,10,30,0,0, ZoneOffset.UTC));

        System.out.println(test);
        System.out.println(test1);

        sp.printPrenotazioni();

        sp.creaPrenotazione(prop1,u3, OffsetDateTime.of(2024,1,18,10,30,0,0, ZoneOffset.UTC),
                OffsetDateTime.of(2024,1,20,10,30,0,0, ZoneOffset.UTC));


        System.out.println("\nPrenotazioni dopo nuovo inserimento");
        sp.printPrenotazioni();

    }

}
