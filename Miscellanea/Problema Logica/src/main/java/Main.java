//dato un array di interi di lunghezza n scrivere un metodo che lo stampi con l'ordinamento descritto nell'esempio
//Esempio:
//int array[] = {14, 5, 23, 89, 4, 50};
//Stamp: 14, 50, 5, 4, 23, 89


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] sample = {14, 5, 23, 89, 4, 50};

        System.out.println(Arrays.toString(getOutputArray(sample)));

    }


    public static int[] getOutputArray(int[] inputArray) {

        int[] output = new int[inputArray.length];
        int size = inputArray.length;
        int aux = 0;


        for( int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                output[i] = inputArray[aux];
            } else {
                output[i] = inputArray[size - 1 - aux];
                aux++;
            }
        }

        return output;

    }

}
