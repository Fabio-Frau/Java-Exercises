public class Main {
    public static void main(String[] args) {

        int intNumber = 5;
        double doubleNumber = 10.5;

        System.out.println("Divide by zero with integers: " + DivideByZeroInt(intNumber));
        System.out.println();
        System.out.println("Divide by zero with doubles: " + DivideByZeroDouble(doubleNumber));

    }

    public static int DivideByZeroInt(int value) {
        try {
            return value / 0;
        } catch (ArithmeticException e) {
            System.out.println("The error message is: " + e.getMessage());
            return 0;
        }
    }

    public static double DivideByZeroDouble(double value) {
        return value/0;
    }
}
