/*Java Program to Sort LinkedHashMap By Values
* Procedure:

Create an object of LinkedHashMap Class where the object is declared of type Integer and String.
Add elements to the above object created of the map using the put() method. Elements here are key-value pairs.
Retrieve above all entries from the map and convert them to a list using entrySet() method.
Sort the value of the list using the custom comparator.
Now use the Collections class sort method inside which we are using a custom comparator to compare the value of a map.
Print the above list object using for each loop.*/


import java.util.*;

public class GFG {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("Due",2);
        map.put("Tre",3);
        map.put("Uno",1);
        System.out.println(map);

        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        System.out.println(list);

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue() - entry2.getValue();
            }
        });

        for (Map.Entry<String ,Integer> l :list) {
            System.out.println("Key -> " + l.getKey() + ": Value -> " + l.getValue());
        }

    }
}
