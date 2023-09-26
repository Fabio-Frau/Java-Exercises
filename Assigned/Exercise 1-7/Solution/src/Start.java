public class Start {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        quotient(x,y);

    }

    public static int quotient(int x, int y) {
        int result = x / y;
        System.out.println("The quotient is equal to " + result);
        return result;
    }
}
