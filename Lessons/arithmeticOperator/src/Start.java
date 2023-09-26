public class Start {
    public static void main(String[] args) {

        int x = 20;
        int y = 50;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int resultSum = x + y;
        System.out.println("Sum = " + resultSum);

        int resultSub = x - y;
        System.out.println("Subtraction = " + resultSub);

        int resultMulti = x * y;
        System.out.println("Multiplication = " + resultMulti);

        int resultDiv = x / y;
        System.out.println("Division = " + resultDiv);

        int resultMod = x % y;
        System.out.println("Modulo = " + resultMod);

        x++;
        System.out.println("x incremented = " + x);

        x--;
        System.out.println("x decremented = " + x);

        /*Post increment, in this case first the original value of x is assigned to
        * resultInc and then the value of x is incremented*/
        int resultInc = x++;
        System.out.println("resultInc = " + resultInc +", x = " + x);

    }
}
