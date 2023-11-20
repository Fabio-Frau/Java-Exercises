/*Progettare una applicazione che simula un operatore di telefonia cellulare. Si devono quindi gestirei dati
 relativi ad una carta SIM ed in particolare: il numero di telefono, il credito disponibile, la lista delle
  telefonate effettuate e la durata di ogni telefonata. La classe SIM dovrà fornire, inoltre, le seguenti
   funzionalità: un costruttore parametrizzato che crea una SIM con numero di telefono, un credito e la
    lista delle telefonate vuota; un metodo per inserire una telefonata con i relativi dati; un metodo
    per il calcolo dei minuti totali di conversazione; metodo per il calcolo delle telefonate effettuate
     verso un determinato numero; metodo per la stampa dei dati della SIM e l’elenco delle telefonate.*/

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Sim sim1 = new Sim(123456789, BigDecimal.valueOf(100), "Fabio",
                PianoTariffario.MEGA_GIGA, new ArrayList<>() );

        Sim sim2 = new Sim(987456321, BigDecimal.valueOf(1000000), "Maria Grazia",
                PianoTariffario.MINUTI_ILLIMITATI, new ArrayList<>() );

        Sim sim3 = new Sim(55555555, BigDecimal.valueOf(1), "Germano Mosconi",
                PianoTariffario.SCATTO_ALLA_RISPOSTA, new ArrayList<>() );

        ArrayList<Sim> listaClienti = new ArrayList<>();
        listaClienti.add(sim1);
        listaClienti.add(sim2);
        listaClienti.add(sim3);


        GestoreTelefonico gestore = new GestoreTelefonico(listaClienti, new ArrayList<>());
        gestore.creaTelefonata(sim1, sim2, 30.5);
        gestore.creaTelefonata(sim1, sim2, 5);
        gestore.creaTelefonata(sim3, sim2, 35);
        gestore.creaTelefonata(sim1, sim3, 65);
        gestore.creaTelefonata(sim3, sim1, 87.1);

        System.out.println("Lista clienti");
        for(Sim s : gestore.getClienti()) {
            System.out.println(s);
        }

        System.out.println("--------------------");
        System.out.println("Lista telefonate gestore telefonico");

        for(Telefonata t : gestore.getTelefonate()) {
            System.out.println(t);
        }


        System.out.println("------------------------");
        System.out.println("Lista chiamate singolo cliente");
        for (Sim s : gestore.getClienti()) {
            System.out.println("Lista chiamate del numero " + s.getNumeroTelefono());
            for (Telefonata t : s.getListaChiamate()) {
                System.out.println(t);
            }
            System.out.println();
        }

        System.out.println("------------------------");
        System.out.println("Durata totale chiamate per singolo cliente");
        for (Sim s : gestore.getClienti()) {
            System.out.println("Durata totale telefonate di " + s.getNumeroTelefono());
            System.out.println(s.getDurataTotale());
            System.out.println();
        }


        System.out.println("-------------");
        System.out.println("Durata totale chiamate sim1 (123456789)");
        System.out.println(sim1.getDurataTotale());
        System.out.println("Durata totale in uscita verso 987456321");
        System.out.println(sim1.getDurataTotaleDaMittente(987456321));
        System.out.println("Durata totale in ingresso da 987456321");
        System.out.println(sim1.getDurataTotaleDaDestinatario(987456321));

        System.out.println("-------------");
        System.out.println("Durata totale chiamate sim1 (123456789)");
        System.out.println(sim1.getDurataTotale());
        System.out.println("Durata totale in uscita verso 55555555");
        System.out.println(sim1.getDurataTotaleDaMittente(55555555));
        System.out.println("Durata totale in ingresso da 55555555");
        System.out.println(sim1.getDurataTotaleDaDestinatario(55555555));




    }




}
