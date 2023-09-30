public class Start {
    public static void main(String[] args) {


        System.out.println("break inside a for loop");
        for (int x = 0; x <= 5; x++) {
            System.out.println("Value of x = " + x);
            if (x == 3) {
                break;
            }
        }


        System.out.println("\ncontinue inside for loop");
        for (int y = 0; y <= 5; y++) {

            if (y == 3) {
                continue;
            }
            System.out.println("Value of y = " + y);
        }

        System.out.println("nested for loops");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Value of i = " + i);

            for (int j = 0; j <= 5; j++) {
                System.out.println("Value of j = " + j);
            }


        }
    }
}
