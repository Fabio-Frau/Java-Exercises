public class Main {

    public static void main(String[] args) {

        //Metodo 1
        for (int i = 1; i <= 100; i++) {
            System.out.println("Valore: " + i);
            System.out.println(i % 5 == 0 ? "FizzBuzz" : "Buzz");
        }

        //Metodo 2
        for (int i = 1; i <= 100; i++) {
            System.out.println("Valore: " + i);
            System.out.println(checkValueTernayOperator(i));
        }

    }

    public static String checkValueTernayOperator(int value) {
        return value % 5 == 0 ? "FizzBuzz" : "Buzz";
    }

    private static String checkValue(int value) {
        String result = "";

        if (value % 5 == 0) {
            result = "FizzBuzz";
        } else  {
            result = "Buzz";
        }
        return result;
    }
}
