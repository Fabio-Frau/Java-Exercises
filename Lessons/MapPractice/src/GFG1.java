/*Sort LinkedHashMap by Keys in Java
*Approach:

Take LinkedHashMap as an input.
Create new TreeMap.
Pass LinkedHashMap object into the constructor of TreeMap.
Print Keys of TreeMap object. */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class GFG1 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, Integer> lMap = new LinkedHashMap<>();
        lMap.put(5,4);
        lMap.put(3,44);
        lMap.put(4,15);
        lMap.put(1,20);
        lMap.put(2,11);

        for(Map.Entry<Integer,Integer> element : lMap.entrySet()) {
            System.out.println(element.getKey() + " = " + element.getValue());
        }

        Map<Integer,Integer> map = new TreeMap<>(lMap);

        for(Integer sKey : map.keySet()) {
            System.out.println("Key -> " + sKey + " : Value -> " + map.get(sKey));
        }




    }
}
