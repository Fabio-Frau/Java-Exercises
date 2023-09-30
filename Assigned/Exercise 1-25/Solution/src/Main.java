import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int arraySize = 15;
       char[] charArray = createAndPrintArray(arraySize);
       countAndPrinta(charArray);
    }



    public static char[] createAndPrintArray(int size)
    {
        Random random = new Random();
        char[] myArray = new char[size];


        /*I decided to play with the creation of the array using some randomness.
        * I generate a random number between 97 and 122. The reason for this is that in the
        * ASCII code all lower case letters are between these two numbers.
        * Then I cast the random int value into a char obtaining a random lower case letter
        * between a and z*/

        int aCount = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (char)random.nextInt(97,122);

        }

        System.out.println(Arrays.toString(myArray));

        return myArray;

    }


    public static void countAndPrinta(char[] aArray) {

        int aCount = 0;
        for (char character : aArray) {
            if (character == 'a') {
                aCount += 1;
                System.out.println(character);
            }
        }

        if (aCount > 0) {
            System.out.println("There are " + aCount + " occurrences of the character 'a'");
        } else {
            System.out.println(0);
        }
    }
}
