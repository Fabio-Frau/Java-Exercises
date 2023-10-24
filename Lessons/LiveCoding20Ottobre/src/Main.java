/*Leggere un array di interi di 6 posizioni, leggere un ulteriore numero
 intero e dire quanti numeri memorizzati nell’array sono inferiori e
  quanti superiori dell’ultimo numero letto.*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int size = 6;
        int value = 20;
        int[] array = randomArray(size);

        int [] risultato = lessGreaterEqualThan(array,value);

        System.out.println(Arrays.toString(array));
        System.out.println("In the array there are " + risultato[0] + " numbers less than " + value);
        System.out.println("In the array there are " + risultato[1] + " numbers equals to " + value);
        System.out.println("In the array there are " + risultato[2] + " numbers greater than " + value);




    }


    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(0,100);
        }
        return array;
    }

    public static int[] lessGreaterEqualThan(int[] array, int value ) {
        int countLess = 0;
        int countGreater = 0;
        int countEqual = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                countEqual++;
            } else if (array[i] > value) {
                countGreater++;
            } else {
                countLess++;
            }
        }



        return new int[] {countLess, countEqual, countGreater};

    }
}


