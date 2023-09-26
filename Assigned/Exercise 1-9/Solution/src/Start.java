public class Start {
    public static void main(String[] args) {

        double x =20.1;
        double y = 30.6;
        double z = 15.8;

        mean3(x,y,z);


    }

    public static double mean3(double x, double y, double z) {
        double result = (x + y + z) / 3;
        System.out.println("The mean of the three numbers is equal to " + result);
        return result;
    }
}
