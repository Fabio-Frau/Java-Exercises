public class Start {
    public static void main(String[] args) {

        int x = 0;
        System.out.println("while loop");
        while (x < 5) {
            System.out.println("Value of x = " + x);
            x++;
        }

        System.out.println("\ndo while loop");
        x = 0;
        do {
            System.out.println("Value of x = " + x);
            x++;
        } while (x <= 5);


    }
}
