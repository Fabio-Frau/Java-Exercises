import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {

        HashSet<Studente> avengers = fillHashSet();
        System.out.println("The HashSet is:");
        System.out.println(avengers);

        Studente hulk = new Studente("Bruce","Banner",55);
        Studente fabio = new Studente("Fabio", "Frau", 31);

        System.out.println("Hulk:");
        System.out.println(hulk);
        System.out.println("Fabio:");
        System.out.println(fabio);

        System.out.println("Is Hulk contained in avengers? = " + avengers.contains(hulk));
        System.out.println("Is Fabio contained in avengers? = " + avengers.contains(fabio));




    }

    public static HashSet<Studente> fillHashSet() {

        HashSet<Studente> studenti = new HashSet<Studente>();

        studenti.add(new Studente("Tony","Stark",53));
        studenti.add(new Studente("Steve","Rogers",105));
        studenti.add(new Studente("Thor",null,1500));
        studenti.add(new Studente("Bruce","Banner",55));
        studenti.add(new Studente("Natasha","Romanoff",39));
        studenti.add(new Studente("Clint","Barton",null));
        studenti.add(new Studente("James Rupert", "\"Rhodey\" Rhodes",null));
        studenti.add(new Studente("Wanda","Maximoff",34));
        studenti.add(new Studente("Visione",null,8));
        studenti.add(new Studente("Sam","Wilson",null));
        studenti.add(new Studente("Peter","Parker",22));
        studenti.add(new Studente("Carol","Danvers",56));
        studenti.add(new Studente("Scott","Lang",null));

        return studenti;
    }
}
