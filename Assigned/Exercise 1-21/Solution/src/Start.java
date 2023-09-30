public class Start {

    public static void main(String[] args) {

        printReverse(6,3);
    }

    public static void printReverse(int start, int howMany) {

        for (int i = start; i > (start - howMany); i--) {
            System.out.print(i + " ");
        }
    }
}
