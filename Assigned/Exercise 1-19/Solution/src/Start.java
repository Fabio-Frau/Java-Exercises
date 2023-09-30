public class Start {
    public static void main(String[] args) {

        int upper = 5;
        System.out.println("The sum of all integer numbers between 0 and " + upper +
                " (not included) is equal to " + sumOfAllIntegers(upper));

    }



    public static int sumOfAllIntegers(int upperBound) {

        int i = 0;
        int sum = 0;

        while (i < upperBound) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
            i++;
        }

        return sum;

    }
}
