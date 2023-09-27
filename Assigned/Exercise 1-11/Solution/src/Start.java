public class Start {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        isNotEqual(x,y);

        int u = 25;
        int w = 25;
        isNotEqual(u,w);
    }

    public static boolean isNotEqual(int num1, int num2) {

        boolean result = num1 != num2;
        System.out.println("Are " + num1 + " and " + num2 + " different? = " + result);
        return result;

    }
}
