/*Implementare un metodo statico di nome
stringaCorta che prende come parametro un array di oggetti String
 e che restituisce la stringa dell’array avente lunghezza minima.
 Nel caso vi fossero due o più stringhe con la lunghezza
minima, il metodo ne deve restituire una arbitrariamente.*/
public class Main {
    public static void main(String[] args) {

        String[] array = new String[] {"Ciao", "Belli", "come", "state", "tre",
                                        "un", "due"};

        System.out.println("The shortest String is: " + stringaCorta(array));

    }


    public static String stringaCorta(String[] array) {
        String shortest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].length() < shortest.length()) {
                shortest = array[i];
            }
        }

        return shortest;
    }
}
