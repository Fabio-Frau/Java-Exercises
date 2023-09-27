public class Start {
    public static void main(String[] args) {

        int lower = 10;
        int upper = 100;
        double myValue = 50.6;

        checkInterval(lower, upper, myValue);
        checkInterval(lower, upper, myValue*10);

    }

    public static boolean checkInterval(int inf, int sup, double value) {

        boolean isInside = (value >= inf) && (value <= sup);
        System.out.println("Is " + value +" between " + inf + " and "
                + sup + " ? = " + isInside);

        return isInside;
    }
}
