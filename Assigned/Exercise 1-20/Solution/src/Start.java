public class Start {
    public static void main(String[] args) {

        int number = 5;

        multiplicationTable(number);

    }


    public static void multiplicationTable(int number) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(number +" X " + i + " = " + number*i);
        }
    }
}
