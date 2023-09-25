public class Start {
    public static void main(String[] args) {
        int x = 15;
        int y = 25;
        int z = x + y;
        /* Please note:
         * In Java, when you perform division on two integer values, the result will always be an integer.
         * This means that any fractional part of the result will be truncated, and the result will be
         * rounded down to the nearest integer.
         * When I divide x by y ( 15 / 25 ) the result is 0.6 so truncating the fractional part I get 0.
         * When I divide y by x ( 25 / 15 ) the result is 1.6666 so truncating I get 1.
         *  */
        int w = x / y;
        int u = y / x;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Sum of x + y = " + z);
        System.out.print("The division x / y is equal to " + w);
        System.out.print("The division y / x is equal to " + u);
    }
}
