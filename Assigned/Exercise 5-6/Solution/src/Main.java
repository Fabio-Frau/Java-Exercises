public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(1.0, 2.5);
        Point point2 = new Point(335.6, -91.5);
        Point point3 = new Point(1.0, 2.5);

        System.out.println("point1 = " + point1);
        System.out.println("point2 = " + point2);
        System.out.println("point3 = " + point3);

        System.out.println("Are point1 and point2 equals? = " + point1.equals(point2));
        System.out.println("Are point1 and point3 equals? = " + point1.equals(point3));
    }
}
