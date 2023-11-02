import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] array1 = new int[] {1,2,3,4,5,6};
        int[] array2 = new int[] {9,8,7,4,5,6,4,2,6,4,6};
        System.out.println(Arrays.toString(metodo77(array1,array2)));


    }

    public static int[] metodo77(int[] array1, int[] array2) {

        int[] result = new int[2];

        result[0] = array1[0];
        result[1] = array2[ array2.length - 1];
        return  result;
    }
}
