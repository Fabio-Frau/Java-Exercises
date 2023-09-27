public class Start {
    public static void main(String[] args) {

        int value1 = 4;
        int value2 = 7;
        System.out.println("The number " + value1 + " is odd? " + checkOdd(value1));
        System.out.println("The number " + value2 + " is odd? " + checkOdd(value2));
    }

    public static boolean checkOdd(int value) {
        boolean isEven = value % 2 == 0;
        boolean isOdd = !isEven;
        return isOdd;
    }
}
