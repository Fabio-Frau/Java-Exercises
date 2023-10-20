public class Main {
    public static void main(String[] args) {

        Double numerator = 15.0;
        Double denominator = 7.5;
        Double numeratorNull = null;

        System.out.println("Division with not null arguments:");
        System.out.println(divisionTryCatch(numerator,denominator));

        System.out.println("Division with null numerator");
        System.out.println(divisionTryCatch(numeratorNull,denominator));


    }

    public static double division(Double numerator, Double denominator) {

        if ( numerator == null) {
            throw new NullPointerException("The numerator is null");
        }
        if ( denominator == null) {
           throw new NullPointerException("The denominator is nulla");
        }

        return numerator / denominator;

    }

    public static double divisionTryCatch(Double numerator, Double denominator) {
        try {
           return division(numerator, denominator);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        return 0.0;
    }


}
