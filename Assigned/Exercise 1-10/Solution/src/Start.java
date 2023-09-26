public class Start {
    public static void main(String[] args) {

        double x = 13.6;
        double y = 5.8;
        double increment = 2.6;

        incrAndMult(x,y,increment);

    }

    public static double incrAndMult(double x, double y, double increment) {

        x += increment;
        y += increment;
        double result = x * y;
        System.out.println("The result of incrementing x and y by \"increment\" and" +
                " then multiplying them together is equal to " + result);
        return result;

    }
}
