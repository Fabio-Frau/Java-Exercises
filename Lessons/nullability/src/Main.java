public class Main {
    public static void main(String[] args) {

        Boolean userConsent = null;

        if (userConsent == null) {
            System.out.println("Lack of value");
        } else if (userConsent == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        try {
            if (userConsent == true) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } catch (NullPointerException e) {
            System.out.println("Lack of value");
        }


        System.out.println("Program completed");
    }
}
