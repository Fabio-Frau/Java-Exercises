public class Main {
    public static void main(String[] args) {

        createAndPrintArray();
        createAndPrintArray1();
    }

    public static void createAndPrintArray() {

        int [] myArray = new int[10];
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
            sum += i + 1;
        }

        System.out.println("The sum is equal to " + sum);

    }

    public static void createAndPrintArray1() {

        int [] myArray = new int[10];
        int sum = 0;
        for (int i = 1; i <= myArray.length; i++) {
            myArray[i - 1] = i;
            sum += i;
        }

        System.out.println("The sum is equal to " + sum);

    }


}
