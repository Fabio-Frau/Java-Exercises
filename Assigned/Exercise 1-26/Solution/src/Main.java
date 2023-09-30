import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] testArray = {1,0,2,0,3,4,1,5,6,6,7,8,7,2};
        int[] removedDuplicates = removeDuplicates(testArray);

        System.out.println("Original array:");
        System.out.println(Arrays.toString(testArray));
        System.out.println("Removed duplicates array:");
        System.out.println(Arrays.toString(removedDuplicates));



    }

    public static int[] removeDuplicates(int[] intArray) {

        /*I initialize a dummy array in which I will store the unique elements, the size of this array
        * is the same as the incoming one because worst case alle elements are unique*/
        int[] tempArray = new int[intArray.length];

        /*The first element of my dummy array will be equal to the first element of the incoming array
        * because is the first element that I'm going to check if it is duplicated*/
        tempArray[0] = intArray[0];

        /*I need to keep track of the number of unique element because I want to know the final size of the
        * returning array, furthermore I need to update this information inside the inner loop condition so
        * that I will only look up unique elements and not the zeros inserted as array initialization values */
        int uniqueElements = 1;

        /* The outer loop is looping over the incoming array.
        I skip the first element of the incoming array because is already inserted in the dummy array*/
        for (int i = 1; i < intArray.length; i++) {


            /*I use a boolean to keep track of the uniqueness of the i-th element of the incoming array,
            * as first hypothesis I set this as true, if inside the loop a match is found then this will be
            * changed to false */
            boolean isUnique = true;

            /*The inner loop is looping over the unique values found until the i-th step of the outer loop.
            * This is achieved thanks to the variable "uniqueElements" as mentioned before*/
            for (int j = 0; j <= (uniqueElements - 1) ; j++) {

                /*This block of code checks if the ith element of the incoming array is
                * equal to one of the unique element already stored in the dummy array.
                * If it's equal then the isUnique variable is set to false and I break the loop.
                * I already know that the ith element is duplicated, so I don't need to loop further over
                * the incoming array*/
                if (tempArray[j] == intArray[i]) {
                    isUnique = false;
                    break;
                }
            }

            /*If the inner loop exits with the isUnique variable set to false I found a value already stored
            in the array of unique elements, so I skip to the next iteration of the outer loop.
            Else, if isUnique equals true it means that no match was found then I have a new unique element
            to store in the array and I need to update the unique elements count as well*/
            if (isUnique) {
                uniqueElements += 1;
                tempArray[uniqueElements - 1] = intArray[i];
            }
        }

        /*Finally I create a new array which has the same size as the number of unique elements
        * and I copy those elements from the dummy array, so I don't have extra zeros.*/
        int[] result = new int[uniqueElements];
        for (int k = 0; k < uniqueElements; k++) {

            result[k] = tempArray[k];
        }

        System.out.println("The number of unique element is : " + uniqueElements + "; I removed " + (intArray.length - uniqueElements) + " duplicates");
        return result;
    }



}
