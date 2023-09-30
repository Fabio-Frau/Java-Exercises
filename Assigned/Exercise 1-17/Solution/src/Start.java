public class Start {
    public static void main(String[] args) {

        System.out.println("First version");
        System.out.println(dayOfTheWeek(5));

        System.out.println("\nSecond version");
        System.out.println(dayOfTheWeekV1(1));


    }



    public static String dayOfTheWeek(int day) {

        String result;

        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "ERROR: you must provide an integer number between 1 and 7";
                break;
        }

        return result;
    }


    /*Using the return statement inside the "case" you must not use the break statement or
    * the code won't compile. The return itself exit from the code block.*/
    public static String dayOfTheWeekV1(int day)  {

        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return  "Sunday";
            default:
                return "ERROR: you must provide an integer number between 1 and 7";
        }

    }
}
