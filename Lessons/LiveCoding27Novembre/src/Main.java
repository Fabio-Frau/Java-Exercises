/*Realizzare la classe Canzone che i seguenti tre attributi: nome, cantante e durata.
 Di tale classe si implementi i costruttore di default, quello parametrizzato,
 i metodi get, set ed il metodo toString.

Implementare la classe MainCanzone in cui il metodo main deve permettere
all'utente di inserire la propria playlist preferita. In particolare nele main si deve:
chiedere all'utente da quante canzoni è costituita la propria playlist
 preferita (almeno una canzone);

dichiarare e inizializzare un vettore in grado di contenere tali canzoni;
(Suggerimento: bisogna creare un vettore di tipo Canzone.
Per capire come crearlo è sufficiente ricordare come si crea un vettore
 di interi e sostituire al posto della parola "int" la parola "Canzone").
all'interno di un ciclo for, che itera in base al numero di canzoni, creare le
 canzoni e memorizzarle nel vettore.
stampare a schermo la playlist;
indicare il nome della canzone più lunga e la media della durata delle canzoni contenute nella playlist.*/

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<Canzone> playList = createPlaylist();
        printPlaylist(playList);
        System.out.println("The longest song is: ");
        System.out.println(getLongestSong(playList).getNome());
        System.out.println("The average duration is: ");
        System.out.println(averageDuration(playList));



    }

    public static long averageDuration(ArrayList<Canzone> playlist) {
        long sumOfDurations = 0;
        for (Canzone canzone : playlist) {
            sumOfDurations += canzone.getDurata().getSeconds();
        }

        return sumOfDurations/playlist.size();
    }

    public static Canzone getLongestSong(ArrayList<Canzone> playlist) {
        Canzone longest = playlist.get(0);
        long maxDurata = playlist.get(0).getDurata().getSeconds();
        for(Canzone canzone : playlist) {
            if (canzone.getDurata().getSeconds() > maxDurata) {
                longest = canzone;
            }
        }

        return longest;
    }


    public static ArrayList<Canzone> createPlaylist() {
        ArrayList<Canzone> playlist = new ArrayList<>();

        System.out.println("Inserisci numero massimo di canzoni:");

        int capienza = sc.nextInt();


        for (int i = 0; i < capienza; i++) {
            System.out.println("Inserisci il nome della canzone");
            String nome = sc.next();
            System.out.println("Inserisci il nome dell'artista");
            String artista = sc.next();
            System.out.println("Inserisci la durata in secondi");
            int secondi = sc.nextInt();
            Duration duration = Duration.of(secondi, ChronoUnit.SECONDS);
            playlist.add(new Canzone(nome, artista, duration));
        }

        return playlist;
    }

    public static void printPlaylist(ArrayList<Canzone> playlist) {

        for(Canzone canzone : playlist) {
            System.out.println(canzone.getNome() + " " + canzone.getCantante() + " " + canzone.getDurata().toSeconds());
        }
    }

}
