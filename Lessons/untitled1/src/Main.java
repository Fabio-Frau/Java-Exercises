public class Main {

    public static void main(String[] args) {

        for ( int i = 0; i <= 100; i++) {
            System.out.println(i + " : " + func(i));
        }

    }

    public static int func(int n) {
        int c = 0;
        while ( n>= 0) {
            n = n-2;
            c = c + n -2;
        }
        return n;
    }

}
