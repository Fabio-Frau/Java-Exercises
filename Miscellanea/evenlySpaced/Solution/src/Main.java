/*Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced, so the difference between small
 and medium is the same as the difference between medium and large.*/

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

    }

    public boolean evenlySpaced(int a, int b, int c) {
        int small = Integer.min(a,b);
        small = Integer.min(small,c);

        int large = Integer.max(a,b);
        large = Integer.max(large,c);

        int medium;

        if (a != small && a != large) {
            medium = a;
        } else if (b != small && b != large) {
            medium = b;
        } else {
            medium = c;
        }

        if ((medium - small) == (large - medium)) {
            return true;
        } else {
            return false;
        }
    }


}
