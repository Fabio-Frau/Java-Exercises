public class Main {
    public static void main(String[] args) {
        System.out.println("Risultato con if/else");
        System.out.println(checkString("Questa è una stringa"));
        System.out.println("Risultato con ternary operator");
        System.out.println(checkStringTernaryOperator("Questa è una stringa"));

        System.out.println("Risultato con ternary operator stringa minore di 10");
        System.out.println(checkStringTernaryOperator("Fabio"));

    }

    public static String checkStringTernaryOperator(String value) {
        return value.length() >= 10 ? "Lunghezza maggiore o uguale di 10" : "Lunghezza minore di 10";
    }

    private static String checkString(String value) {
        String result;
        if (value.length() >= 10) {
            result = "Lunghezza maggiore o uguale di 10";
        } else {
            result = "Lunghezza minore di 10";
        }
        return result;
    }
}
