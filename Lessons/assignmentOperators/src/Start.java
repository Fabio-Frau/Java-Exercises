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

        int xInc = x + 2;
        System.out.println("Inc = " + xInc);

        xInc += 2;
        System.out.println();
    }
}