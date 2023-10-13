import java.lang.StringIndexOutOfBoundsException;

public class Main {
    public static void main(String[] args) {

        System.out.println(getCharInString("Ciao belli",35));
        System.out.println(getCharInString("Ciao belli",3));


    }

    public static StringBuilder getCharInString(String stringa, int index) {

        StringBuilder risultato = new StringBuilder("Il risultato è: ");

        try {
            char character = stringa.charAt(index);
            risultato.append(character);

        }
        catch (StringIndexOutOfBoundsException e) {
            risultato.append(e.getMessage());
        }

        return risultato;
    }
}
