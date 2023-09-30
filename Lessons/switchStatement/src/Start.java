public class Start {
    public static void main(String[] args) {

        int x = 10;

        switch (x){
            case 0:
                xEquals0();
                break;
            case 10:
                xEquals10();
                break;
            default:
                xOtherCases(x);
                break;

        }
    }

    public static void xEquals0() {
        System.out.println("x is equal to 0");
    }

    public static void xEquals10() {
        System.out.println("x is equal to 10");
    }

    public static void xOtherCases (int x) {
        System.out.println("x is equal to " + x);
    }


}
