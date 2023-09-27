public class Start {
    public static void main(String[] args) {

        int x = 20;
        int y = 150;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        /*AND operator &&*/
        boolean xyAnd = (x > 10) && (y < 100);
        System.out.println("Is x greater than 10 and y less than 100? " + xyAnd);

        /*OR operator ||*/
        boolean xyOr = (x > 10) || (y < 100);
        System.out.println("Is x greater than 10 or y less than 100? " + xyOr);

        /*NOT operator !*/
        boolean xyNor = !((x > 10) || (y < 100));
        System.out.println("Nor between x and y equals to: " + xyNor);

    }
}
