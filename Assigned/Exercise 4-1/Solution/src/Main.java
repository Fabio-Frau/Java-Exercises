public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(isInRangeWithException(5,0,10));

        System.out.println(isInRangeWithException(5,10,20));

        //System.out.println(isInRangeWithError(5,10,20));

        //System.out.println(isInRangeWithRuntimeException(5,10,20));
    }

    public static boolean isInRangeWithException(int value, int lowerBound,int upperBound) throws Exception{
        if((value >= lowerBound) && (value <= upperBound)) {
            return true;
        } else {
            throw new OutOfRangeException("Value is not between " + lowerBound + " and " + upperBound);
        }
    }

    public static boolean isInRangeWithError(int value, int lowerBound, int upperBound ) {
        if((value >= lowerBound) && (value <= upperBound)) {
            return true;
        } else {
            throw new OutOfRangeError("Value is not between " + lowerBound + " and " + upperBound);
        }
    }

    public static boolean isInRangeWithRuntimeException(int value, int lowerBound,int upperBound) {
        if((value >= lowerBound) && (value <= upperBound)) {
            return true;
        } else {
            throw new OutOfRangeRuntimeException("Value is not between " + lowerBound + " and " + upperBound);
        }
    }



}
