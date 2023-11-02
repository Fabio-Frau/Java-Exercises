public class Main {
    public static void main(String[] args) {

        int int1 = 2;
        int int2 = 5;
        char character = 'F';
        Integer Int1 = Integer.valueOf(10); //Boxing
        Integer Int2 = Integer.valueOf(20); //Boxing
        Character character1 = Character.valueOf('R'); //Boxing


        int int3 = Int1; //Unboxing
        int int4 = Int2; //Unboxing
        char character2 = character1; //unboxing

        System.out.println("Using a method with int parameters providing int arguments");
        sumInt(int1, int2);
        System.out.println("Unboxing -- Using a method with int parameters providing Integer arguments");
        sumInt(Int1,Int2);
        System.out.println("Boxing -- Using a method with Integer parameters providing int arguments");
        sumInteger(int1,int2);
        System.out.println("Using a method with Integer parameters providing Integer arguments");
        sumInteger(Int1,Int2);

        System.out.println("Using a method with char parameters providing char arguments");
        printChar(character);
        System.out.println("Unboxing -- Using a method with char parameters providing Character arguments");
        printChar(character1);
        System.out.println("Boxing -- Using a method with Character parameters providing char arguments");
        printCharacter(character);
        System.out.println("Using a method with Character parameters providing Character arguments");
        printCharacter(character1);

    }

    public static int sumInt(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is equal to " + sum);
        return sum;
    }

    public static void printChar(char character) {
        System.out.println("The characters is equal to: " + character);
    }

    public static Integer sumInteger(Integer num1, Integer num2) {
        Integer sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is equal to " + sum);
        return sum;
    }

    public static void printCharacter(Character character) {
        System.out.println("The characters is equal to: " + character);
    }


}
