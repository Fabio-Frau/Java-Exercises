import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("1) Mutable Map:");
        Map<String, String> superheroes = new HashMap<>();
        superheroes.put("Deadpool","Wade Wilson");
        superheroes.put("Batman","Bruce Wayne");
        superheroes.put("Superman","Clark Kent");
        superheroes.put("Spider-Man","Peter Benjamin Parker");
        System.out.println("Map<String, String> superheroes = new HashMap<>()");
        System.out.println("superheroes.put(\"Key\",\"Value\")");
        System.out.println(superheroes);
        System.out.println();


        System.out.println("2) Mutable Map, maximum 10 pairs");
        Map<String,String> superheores1 = new HashMap<>(Map.of(
                "Deadpool","Wade Wilson",
                "Batman","Bruce Wayne",
                "Superman","Clark Kent",
                "Spider-Man","Peter Benjamin Parker"
        ));

        System.out.println("Map<String,String> superheores1 = new HashMap<>(Map.of(\"Key\",\"Value\"))");
        System.out.println(superheores1);
        System.out.println();

        System.out.println("3) Immutable Map, maximum 10 pairs");
        Map<String,String> superheroes2 = Map.of(
                "Deadpool","Wade Wilson",
                "Batman","Bruce Wayne",
                "Superman","Clark Kent",
                "Spider-Man","Peter Benjamin Parker"
        );

        System.out.println("Map<String,String> superheroes2 = Map.of(\"Key\",\"Value\")");
        System.out.println(superheroes2);
        System.out.println();

        System.out.println("4) Mutable, any number of pairs");
        Map<String,String> superheroes3 = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<String,String>("Deadpool","Wade Wilson"),
                new AbstractMap.SimpleEntry<String,String>("Batman","Bruce Wayne"),
                new AbstractMap.SimpleEntry<String,String>("Superman","Clark Kent"),
                new AbstractMap.SimpleEntry<String,String>("Spider-Man","Peter Benjamin Parker")
        ));

        System.out.println("Map<String,String> superheroes3 = new HashMap<>(Map.ofEntries( new AbstractMap.SimpleEntry<String,String>(\"Key\",\"Value\")))");
        System.out.println(superheroes3);
        System.out.println();

        System.out.println("5) Immutable, any number of pairs");
        Map<String,String> superheroes4 = Map.ofEntries(
                new AbstractMap.SimpleEntry<String,String>("Deadpool","Wade Wilson"),
                new AbstractMap.SimpleEntry<String,String>("Batman","Bruce Wayne"),
                new AbstractMap.SimpleEntry<String,String>("Superman","Clark Kent"),
                new AbstractMap.SimpleEntry<String,String>("Spider-Man","Peter Benjamin Parker")
        );

        System.out.println("Map<String,String> superheroes4 = Map.ofEntries(\n" +
                "                new AbstractMap.SimpleEntry<String,String>(\"Key\",\"Value\"))");
        System.out.println(superheroes4);
        System.out.println();











    }
}
