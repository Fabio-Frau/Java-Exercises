public class Start {
    public static void main(String[] args) {
        int x = 15;
        int y = 25;
        int z = x + y;
        /* Please note:
         * In Java, when you perform division on two integer values, the result will always be an integer.
         * This means that any fractional part of the result will be truncated, and the result will be
         * rounded down to the nearest integer.
         * When I divide x by y ( 15 / 25 ) the result is 0.6 so truncating the fractional part I get 0.
         * When I divide y by x ( 25 / 15 ) the result is 1.6666 so truncating I get 1.
         * Declaring a float variable that will contain the result of a division between two integer types
         * it's not enough to produce a float. The division between the two integer will still result in an
         * integer according to the truncation and rounding rules. This resulting integer will be "converted"
         * into the corresponding float.
         *  */
        float w = x / y;
        float u = y / x;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Sum of x + y = " + z);
        System.out.print("The division x / y is equal to " + w);
        System.out.print("The division y / x is equal to " + u);
/*---------------------------------------------------------------------*/
        float a = 15f;
        int b = 25;
        float c = a / b;
        /*If one of the two division operands is a float, the resulting type will be a float.
        * In this case the integer operand is automatically converted into the corresponding float.
        * Of course the variable that will store the result of the division must be declared as a float,
        * otherwise you get an error message:
        * java: incompatible types: possible lossy conversion from float to int */

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("The division a / b is equal to " + c);
/*---------------------------------------------------------------------*/

        double i = 1d;
        double j = 3d;
        double k = i / j;

        float l = 1f;
        float m = 3f;
        float n = l / m;

        /*the double type has more precision than float, but it takes more space
        * in memory*/
        System.out.println("(double) i = " + i);
        System.out.println("(double)j = " + j);
        System.out.println("(double) The division i / j is equal to " + k);

        System.out.println("(float) l = " + l);
        System.out.println("(float) m = " + m);
        System.out.println("(float) The division l / m is equal to " + n);

/*---------------------------------------------------------------------*/
        char p = 'p';
        char r = 'r';
        System.out.println("Value of char p is " + p);

        boolean bool = true;
        System.out.println("Value of boolean bool is " + bool);

        /*String is not a primitive type, is an Object*/
        String text = "Text";
        System.out.println("Value of String text is " + text);

        /*What's the value of p + r where p and r are of char type?*/
        /*Here I am not concatenating only characters together because the first
        * argument is a string, so the characters are converted to string and then concatenated*/
        System.out.println("The value of p + r is equal to " + p + r);

        /*What's the value of a char + a String? */
        /*The same reasoning as above applies here */
        System.out.println("The value p + text is equal to " + p + text);


        /*The following way to add two characters and store the result in a variable of type
        String doesn't work because this way p and r are converted to integers */
//        String s = p + r;

        /*This way the presence of a String type in the addition ensure that the char types
        * are converted to String types instead of integers*/
        String t ="t" + p + r;
        System.out.println("The value of the String t is " + t);


        /*Please note that if I use the parentheses to add p and r then the two char type are
        * converted to integers, these are added together and the result in converted to String
        * and finally concatenated to the first String */
        String g = "g" + (p + r);
        System.out.println("The value of the String g is " + g);





    }
}
