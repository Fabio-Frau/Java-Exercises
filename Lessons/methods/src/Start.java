public class Start {
    public static void main(String[] args) {

        double x = 1.0;
        double y = 3.0;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Sum of x and y is equal to " + summation(x,y));

        int u = 4;
        int w = 5;
        System.out.println("u = " + u);
        System.out.println("w = " + w);
        System.out.println("Sum of u and w is equal to " + summation(u,w));



    }

//    public static int summation (double x, double y) {
//        int z = (int)x + (int)y;
//        return z;
//    }

    /*Method overloading */
    public static String summation(double x, double y) {
        int z = (int)x +(int)y;
        return  String.valueOf(z);
    }

    public static String summation(int x, int y) {
        int z = x + y;
        return String.valueOf(z);
    }
}