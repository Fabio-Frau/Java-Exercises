public class Main {
    public static void main(String[] args) {

        //Declaration
        int [] emptyArray;

        //Declaration and initialization
        int[] fibonacci = {1,1,2,3,5,8,13};

        //Access to an element
        System.out.println("Second term of the Fibonacci sequence: " + fibonacci[1]);

        //Setting the value of an array element
        emptyArray = new int[5];
        emptyArray[0] = 1;

        for (int i = 0; i < emptyArray.length; i++) {
            System.out.println(emptyArray[i]);
        }

        fibonacci[2] = 66;
        System.out.println("New third fibonacci sequence term: " + fibonacci[2]);

        int[] x;
        int[] y = {55, 88};

        System.out.println("y[1] = " + y[1]);



    }
}
