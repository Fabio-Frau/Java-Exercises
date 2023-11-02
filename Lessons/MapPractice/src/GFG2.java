/*Sorting a Hashmap according to values
*Solution: The idea is to store the entry set in a list and sort the list on the basis of values.
*  Then fetch values and keys from the list and put them in a new hashmap. Thus, a new hashmap
*  is sorted according to values. */

import java.util.*;

public class GFG2 {

    public static void main(String[] args) {

    }

    public static HashMap<String, Integer> sortByValue(HashMap<String,Integer> hm) {

        List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return
            }
        });
    }

}
