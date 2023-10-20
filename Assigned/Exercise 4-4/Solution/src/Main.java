import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] array = new int[]{0, 1, 2, 3, 4};
        double[] arrayd = new double[] {1.1, 2.2, 3.3, 4.4};
        System.out.println("The int array is equal to : " + Arrays.toString(array));
        System.out.println();

        System.out.println("Divide by zero:");
        divideIntArrayByZero(array, 2);
        System.out.println("Index out of bounds:");
        divideIntArrayByZero(array, array.length+5);

        System.out.println("\nPlaying with the collapsed catch");
        System.out.println("Divide by zero:");
        divideIntArrayByZeroCollapsed(array, 2);
        System.out.println("Index out of bounds:");
        divideIntArrayByZeroCollapsed(array, array.length+5);


        System.out.println("\nDividing by zero using doubles");
        System.out.println(divideDoubleArrayByZero(arrayd, 2));
        System.out.println("Out of bounds using doubles");
        System.out.println(divideDoubleArrayByZero(arrayd, arrayd.length+5));





    }

    public static int divideIntArrayByZero(int[] intArray, int index) {

        try {
            return intArray[index] / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            return 0;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public static double divideDoubleArrayByZero(double[] intArray, int index) {

        try {
            return intArray[index] / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            return 0;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public static int divideIntArrayByZeroCollapsed(int[] intArray, int index) {

        try {
            return intArray[index] / 0;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.toString());
            return 0;
        }
    }




}
