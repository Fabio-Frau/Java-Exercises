public class Start {
    public static void main(String[] args) {


        /* Hard coded exercise */
        System.out.println("Solution of the FizzBuzz exercise");
        checkNumber(1);
        checkNumber(2);
        checkNumber(3);
        checkNumber(4);
        checkNumber(5);
        checkNumber(6);
        checkNumber(7);
        checkNumber(8);
        checkNumber(9);
        checkNumber(10);
        checkNumber(11);
        checkNumber(12);
        checkNumber(13);
        checkNumber(14);
        checkNumber(15);


        /*Exercise done using recursion*/
        System.out.println("\n\n\n\nRecursive solution just for fun");
        checkNumberRecursively(1);



    }

    public static void checkNumber(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }

    /*Recursive method for fun.
    * The input number is the starting number of the FizzBuzz game.
    * As a safety mechanism against too many recursion steps I decided
    * to bound the interval with two hard coded values (lower and upper). */
    public static void checkNumberRecursively (int number) {

        int lower = 1;
        int upper = 100;

        if ((number >= lower ) && (number <= upper)) {

            checkNumber(number);
            number++;
            checkNumberRecursively(number);

        }

    }


}
