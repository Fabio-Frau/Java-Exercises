public class Main {
    public static void main(String[] args) {

        System.out.println("Printing using the for loop");
        printUntil(10);

        System.out.println("\nPrinting using the while loop");
        printUntil1(10);
    }


    public static void printUntil(int number) {
        for (int i = 0; i <= number; i++) {
            if (i == 5) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }


    public static void printUntil1(int number) {

        int i = 0;
        while ( i <= number) {
            if (i == 5) {
                i++; /*If you forget to increment i here the loop will keep going
                       with the variable i stuck with the value 5*/
                continue;
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
