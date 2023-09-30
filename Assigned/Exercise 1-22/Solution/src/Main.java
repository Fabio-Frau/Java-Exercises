public class Main {
    public static void main(String[] args) {

        System.out.println("Using for loop");
        printUntil(16);

        System.out.println("\nUsing while loop");
        printUntil1(10);

        System.out.println("\nUsing while loop without break");
        printUntil2(60);

    }


    public static void printUntil(int number) {
        for ( int i = 0; i <= number; i++) {
            if (i == 5) {
                i++;
                break;
            } else {
                System.out.println(i);
            }

        }
    }

    public static void printUntil1(int number) {
        int i = 0;

        while ( i <= number) {
            if ( i == 5) {
                break;
            } else {
                System.out.println(i);
                i++;
            }
        }

    }

    public static void printUntil2(int number) {
        int i = 0;
        while ((i <= number) && (i != 5)) {
            System.out.println(i);
            i++;
        }
    }
}
