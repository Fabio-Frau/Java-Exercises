public class Main {
    public static void main(String[] args) {


        System.out.println(metodo63(12,13));
        System.out.println(metodo63(12,12));
        System.out.println(metodo63(19,25));

    }

    public static int metodo63(int num1,int num2) {

        if ( num1 == num2) {
            return 0;
        } else if ( num1 % 6 == num2 % 6) {
            if (num1 > num2) {
                return num2;
            } else {
                return num1;
            }
        } else {
            if ( num1 > num2) {
                return num1;
            } else {
                return num2;
            }
        }



    }
}
