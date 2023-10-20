/*Write a program that fills an array A of size 5 filled with random integers in the range 1 to 100
and prints it out (for testing purposes). Write programs that then after creating such a random array,
 do each of the following:
(a) Calculate the sum of the elements of A and print it out.
(b) Count the number of elements in A whose contents are less than 10.
(c) Create a new array B of size 5 such that for all B[i] , B[i] = A[0] + A[1] + ... + A[i]*/


import java.util.Arrays;
import java.util.Random;

public class EsercizioTeamA {

    static Random random = new Random();
    static int[] A;
    static int[] B;

    public static void esegui() {
        A = createRandomIntArray(5);
        System.out.println("Tha array A is:");
        System.out.println(Arrays.toString(A));
        System.out.println("Sum of elements of A is:");
        System.out.println(sumArray(A));
        System.out.println("The number of elements less than 10 is:");
        System.out.println(lessThanTen(A));
        B = createSummationArray(A);
        System.out.println("The array B is:");
        System.out.println(Arrays.toString(B));
        int[] C = createSummationArray1(A);
        System.out.println("The array C is:");
        System.out.println(Arrays.toString(C));
    }

    public static int[] createSummationArray(int[] array) {

        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j <= i; j++) {
                newArray[i] += array[j];
            }
        }

        return newArray;
    }

    public static int[] createSummationArray1(int[] array) {

        int[] newArray = new int[array.length];
        newArray[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            newArray[i] = newArray[i-1] + array[i];
        }

        return newArray;
    }


    public static int[] createRandomIntArray(int size) {

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,101);
        }

        return array;
    }


    public static int sumArray(int[] array){

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int lessThanTen(int[] array) {
        int count = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i] < 10) {
                count++;
            }
        }

        return count;
    }


}
