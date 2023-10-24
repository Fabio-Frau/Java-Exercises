/*Leggere un array di interi di 10 posizioni e dire se in tutte
le posizioni pari dell’array è memorizzato un numero pari*/

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int size = 10;
        int [] array = fillArrayOrdered(size);
        System.out.println(Arrays.toString(array));
        System.out.println(checkEvenPositions(array));

        int [] array1 = fillArrayRandom(size);
        System.out.println(Arrays.toString(array1));
        System.out.println(checkEvenPositions(array1));

    }

    public static int[] fillArrayRandom(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(0,100);
        }

        return array;
    }

    public static int[] fillArrayOrdered(int size) {

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        return array;
    }

    public static boolean checkEvenPositions(int[] array) {
        for ( int i = 0; i < array.length; i+=2) {
            if ( array[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
