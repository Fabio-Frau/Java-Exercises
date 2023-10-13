import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String test = "Oggi è una bella giornata";
        System.out.println(test);

        System.out.println("Lunghezza: " + test.length());
        System.out.println("Upper case: " + test.toUpperCase());
        System.out.println("Lower case: " + test.toLowerCase());

        String[] array = test.split(" ");
        System.out.println(Arrays.toString(array));
        System.out.println("Numero parole: " + array.length);

        String test2 = "Giorno: Lunedì";
        String[] array2 = test2.split(":");
        System.out.println(Arrays.toString(array2));
        System.out.println(array2[1]);

        String giorno = array2[1].trim();
        System.out.println("giorno:" + giorno);

        if (giorno.equals("Lunedì")) {
            System.out.println("Oggi è Lunedì");
        }

        String test3 = test2.replace("Giorno", "Settimana");
        System.out.println(test3);

        String test4 = "Qualcosa";
        System.out.println(test4);

        test4 = "Qualcos'altro";
        System.out.println(test4);

        StringBuilder test5 = new StringBuilder("TEST");
        test5.append(" altra cosa da aggiungere");
        System.out.println(test5);


    }
}
