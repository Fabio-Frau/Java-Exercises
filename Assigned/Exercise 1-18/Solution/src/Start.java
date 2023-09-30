public class Start {
    public static void main(String[] args) {


        System.out.println(checkOperation('+'));
        System.out.println(checkOperation('-'));
        System.out.println(checkOperation('*'));
        System.out.println(checkOperation('/'));
        System.out.println(checkOperation('f'));

    }

    public static String checkOperation(char operator) {

        String result = "";

        switch (operator) {
            case '+':
                result = "Addition";
                break;
            case '-':
                result = "Subtraction";
                break;
            case '*':
                result = "Multiplication";
                break;
            case '/':
                result = "Division";
                break;
            default:
                result = "Error: invalid operator";
                break;
        }

        return result;
    }
}
