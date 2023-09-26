public class Start {
    public static void main(String[] args) {

        int x = 1;
        int y = 3;
        /*Using (double) in front of x and y I am casting those variable from int type
        * to double type. It is an explicit conversion*/
        double z = (double)x / (double)y;
        char c = 'c';
        char d = 'd';
        /*String is an Object not a primitive type, therefore I cannot cast something to String
        * the same way as before. I must use a method of the String class */
        String sumCd = String.valueOf(c) + String.valueOf(d);
        boolean bool = true;
        String text = "Text";

        System.out.print("x = " + x);
        System.out.println(", y = " + y);
        System.out.println("Division of x/y = " + z);
        System.out.println("Value of char c = " + c);
        System.out.println("value of boolean bool = " + bool);
        System.out.println("Value of String text = " + text);
        System.out.println("sumCd = " + sumCd);

        double x1 = 1.0;
        double y1 = 3.0;
        int z1 = (int)x1 / (int)y1;

        System.out.print("x1 = " + x1);
        System.out.println(", y1 = " + y1);
        System.out.println("Division of x1/y1 = " + z1);




    }
}
