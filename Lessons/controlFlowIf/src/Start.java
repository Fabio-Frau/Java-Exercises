public class Start {
    public static void main(String[] args) {
        int x = 50;
        int y = 25;

        if (x > y) {
            xGreaterThanY();
        } else if (x == y) {
            xEqualY();
        } else {
            xLessThanY();
        }

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }


    public static void xGreaterThanY()  {
        System.out.println("x is greater than y");
    }

    public static void xLessThanY() {
        System.out.println("x is less than y");
    }

    public static void xEqualY() {
        System.out.println("x is equal to y");
    }
}
