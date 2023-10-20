import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {

        HashSet<Studente> studenti = fillHashSet(4);
        System.out.println("The HashSet is:");
        System.out.println(studenti);

        Studente studente1 = new Studente("Iron", "Man", 3000);
        Studente studente2 = new Studente("Fabio0", "Frau", 18);

        System.out.println("studente1:");
        System.out.println(studente1);
        System.out.println("studente2:");
        System.out.println(studente2);
        System.out.println();

        System.out.println("Is studente1 contained in studenti? = " + studenti.contains(studente1));
        System.out.println("Is studente2 contained in studenti? = " + studenti.contains(studente2));
        System.out.println();

        System.out.println("Removing studente1:");
        System.out.println("HashSet size before: " + studenti.size());
        System.out.println(removeElement(studenti,studente1));
        System.out.println("HashSet size after: " + studenti.size());
        System.out.println();

        System.out.println("Removing studente2:");
        System.out.println("HashSet size before: " + studenti.size());
        System.out.println(removeElement(studenti,studente2));
        System.out.println("HashSet size after: " + studenti.size());
        System.out.println();

        System.out.println("Clearing the HashSet:");
        System.out.println("HashSet size before: " + studenti.size());
        studenti.clear();
        System.out.println("HashSet size after: " + studenti.size());
        System.out.println("The HashSet after clearing is: " + studenti);


    }

    public static HashSet<Studente> fillHashSet(int size) {

        HashSet<Studente> studenti = new HashSet<Studente>();

        for (int i = 0; i < size; i++) {
            studenti.add(new Studente("Fabio" + i, "Frau" , 18 + i));
        }

        return studenti;
    }

    public static HashSet<Studente> removeElement(HashSet<Studente> studenti, Studente studenteToRemove) {

        Iterator<Studente> iterator = studenti.iterator();
        while(iterator.hasNext()) {
            if( iterator.next().equals(studenteToRemove)) {
                iterator.remove();
            }
        }

        return studenti;
    }
}
