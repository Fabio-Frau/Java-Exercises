public class Start {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        isNotEqual(x,y);

        int u = 25;
        int w = 25;
        isNotEqual(u,w);

        char a = 'a';
        char z = 'z';
        isNotEqual(a,z);

        char r = 'r';
        char r1 = 'r';
        isNotEqual(r,r1);


    }

    public static boolean isNotEqual(int first, int second) {

        boolean result = first != second;
        System.out.println("Are " + first + " and " + second + " different? = " + result);
        return result;

    }

    /*Building upon the previous exercise I decided that this is a situation where I can use
    * the method overloading*/
    public static boolean isNotEqual(char first, char second) {

        boolean result = first != second;
        System.out.println("Are " + first + " and " + second + " different? = " + result);
        return result;

    }
}
