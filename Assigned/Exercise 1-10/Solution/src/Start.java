public class Start {
    public static void main(String[] args) {

        double x = 10.5;
        double y = 26.8;
        double increment = 5.1;

        myMethod(x, y, increment);

    }

    public static double myMethod(double x, double y, double increment) {
        x += increment;
        y += increment;
        double result = x * y;

        System.out.println("The result of incrementing x and y by \"increment\" and multiplying them " +
                "together is equal to " + result);

        return result;
    }
}
