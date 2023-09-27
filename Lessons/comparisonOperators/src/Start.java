public class Start {
    public static void main(String[] args) {

        int x = 20;
        int y = 50;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        /*You cannot use the following line of code, it will result in an error,
        * you must put the comparison inside parentheses so the compiler will
        * correctly do first the comparison and convert the resulting boolean
        * to a String for concatenation*/

        //System.out.println("Equals: " + x == y);

        System.out.println("Equals: " + (x == y));

        /*Another solution is to store the result of the comparison inside a variable
        * and then use this variable for concatenation*/

        boolean xyEquals = x == y;
        System.out.println("Are x and y equals?: " + xyEquals);

        boolean xyNotEquals = x != y;
        System.out.println("Are x and y different? " + xyNotEquals);

        boolean isGreater = x > y;
        System.out.println("Is x greater than y? " + isGreater);

        boolean isLess = x < y;
        System.out.println("Is x less than y? " + isLess);

        boolean isGreatOrEq = x >= y;
        System.out.println("Is x greater or equal to y? " + isGreatOrEq);

        boolean isLessOrEq = x <= y;
        System.out.println("Is x less or equal to y? " + isLessOrEq);
    }
}