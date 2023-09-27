public class Start {
    public static void main(String[] args) {

        String str1 = "Short";
        String str2 = "This is a very long string longer than 10 characters";
        String str3 = "Fabio Frau";

        checkStringLength(str1);
        checkStringLength(str2);
        checkStringLength(str3);
    }

    public static void checkStringLength(String str) {
        int length = str.length();

        if (length > 10) {
            System.out.println("The length is greater than 10");
        } else if (length < 10) {
            System.out.println("The length is less than 10");
        } else {
            System.out.println("The length is equal to 10");
        }
    }
}
