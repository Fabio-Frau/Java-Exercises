public class Start {
    public static void main(String[] args) {

        String text = "Hello";
        System.out.println("The length of the string \"" + text + "\" is " + strLength(text));

    }

    public static int strLength(String s) {
        return s.length();
    }
}
