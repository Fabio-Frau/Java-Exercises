public class Main {
    public static void main(String[] args) throws NotANumberException {

        char c = '3';
        System.out.println("Is " + c + " a number? : " + isANumber(c));

        char c1 ='p';
        System.out.println("Is " + c1 + " a number? : " + isANumber(c1));

    }

    public static boolean isANumber(char value) throws NotANumberException {

        if (Character.isDigit(value)) {
            return true;
        } else {
            throw new NotANumberException("The provided character is not a number");
        }

    }
}
