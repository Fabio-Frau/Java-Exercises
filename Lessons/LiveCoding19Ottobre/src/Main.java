/*Leggere un array di interi di 5 posizioni e dopo averlo letto cercare
al suo interno il massimo e scrivere il massimo e la posizione della cella
in cui è memorizzato.*/


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = fillRandomArray(10,0,101);
        System.out.println(Arrays.toString(array));

        int[] risultato = findMax(array);
        System.out.println("The max value is: " + risultato[0]);
        System.out.println("The max is found at index: " + risultato[1]);


    }

    public static int[] fillRandomArray(int size, int lowerBound, int upperBound) {

        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(lowerBound,upperBound);
        }

        return array;

    }

    public static int[] findMax(int[] array) {


        int max = 0;
        int maxIndex = 0;
        for( int i = 0; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        return new int[]{max, maxIndex};


    }
}
