public class Main {
    public static void main(String[] args) {

        String[] array = new String[] {"Ciao","Belli","Adamantio",
                            "andiamo", "cane", "Gatto", "Ajeje Brazorf"};


        System.out.println("The number of Strings that starts with an a is: " + startsWithA(array));

    }


    public static int startsWithA(String[] array) {

        int counter = 0;

        for(int i = 0; i < array.length; i++) {
            if ( array[i].toUpperCase().startsWith("A")) {
                counter++;
            }
        }

        return counter;
    }
}
