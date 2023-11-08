import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        BigDecimal bd1 = BigDecimal.valueOf(Long.MAX_VALUE);
        bd1 = bd1.multiply(BigDecimal.valueOf(10));

        BigDecimal bd2 = BigDecimal.valueOf(Long.MAX_VALUE);
        bd2 = bd2.multiply(BigDecimal.valueOf(20));

        Operations op = chooseOperation();
        BigDecimal result = executeOperation(bd1, bd2, op);
        String output = stringOutput(bd1,bd2, result, op);
        System.out.println(output);




    }

    public static String stringOutput(BigDecimal num1, BigDecimal num2, BigDecimal result, Operations operations) {
        return "The result of the operation " + operations.toString() + " between " + num1 + " and " + num2 + " is equal to " + result;
    }

    public static BigDecimal executeOperation(BigDecimal num1, BigDecimal num2, Operations operation) {
        BigDecimal result = null;
        switch (operation) {
            case ADD:
                return addition(num1, num2);
            case SUBTRACT:
                return subtraction(num1, num2);
            case MULTIPLY:
                return multiplication(num1, num2);
            case DIVIDE:
                return division(num1, num2);
            case MAXIMUM:
                return maximum(num1, num2);
            case MINIMUM:
                return minimum(num1, num2);
            default:
                throw new UnsupportedOperationException("Unsupported operation");
        }
    }

    public static Operations chooseOperation() {

        while (true) {
            System.out.println("Choose an operation:\n" +
                    "    ADD,\n" +
                    "    SUBTRACT,\n" +
                    "    MULTIPLY,\n" +
                    "    DIVIDE,\n" +
                    "    MINIMUM,\n" +
                    "    MAXIMUM ");
            try {
                String choice = sc.next();
                return Operations.valueOf(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Unsupported operation");
            }
        }
    }

    public static BigDecimal addition(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }

    public static BigDecimal subtraction(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }

    public static BigDecimal multiplication(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }

    public static BigDecimal division(BigDecimal num1, BigDecimal num2) {
        return num1.divide(num2);
    }

    public static BigDecimal minimum(BigDecimal num1, BigDecimal num2) {
        return num1.min(num2);
    }

    public static BigDecimal maximum(BigDecimal num1, BigDecimal num2) {
        return num1.max(num2);
    }
}
