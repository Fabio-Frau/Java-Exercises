import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> mappa = new HashMap<String,String>();
        mappa.put("PA", "Palermo");
        mappa.put("TO", "Torino");
        mappa.put("MI", "Milano");
        System.out.println(mappa);

        //Java 9
        Map<String, String> mappaVuota = Map.of();
        System.out.println(mappaVuota);

        //10 pair maximum using Map.of
        Map<String, String> mappa2 = new HashMap<String, String>(Map.of("Pa", "Palermo",
                                    "TO", "Torino", "MI", "Milano"));
        System.out.println(mappa2);

        //Java 9 can use any number of key value pair
        Map<String, String> mappa3 = new HashMap<String, String>(Map.ofEntries(
                new AbstractMap.SimpleEntry<String, String>("PA", "Palermo"),
                new AbstractMap.SimpleEntry<String, String>("TO", "Torino"),
                new AbstractMap.SimpleEntry<String, String>("MI", "Milano")
                ));
        System.out.println(mappa3);


        /*----------------------------------*/

        Articolo article1 = new Articolo("Pizza",1.50);
        Articolo article2 = new Articolo("Coca Cola",0.5);
        Articolo article3 = new Articolo("Tiramisu", 1.00);

        //Mutable
        Map<String,Articolo> articleMap = new HashMap<>();
        articleMap.put("Cibo", article1);
        articleMap.put("Bibita", article2);
        articleMap.put("Dolce", article3);
        System.out.println("------------------------------");
        System.out.println(articleMap);

        //Immutable
        Map<String, Articolo> articleMap2 = Map.of("Cibo", article1,"Bibita", article2,"Dolce", article3);
        System.out.println(articleMap2);

        //Mutable
        Map<String, Articolo> articleMap5 = new HashMap<>(Map.of("Cibo", article1,"Bibita", article2,"Dolce", article3));

        //Mutable
        Map<String, Articolo> articleMap3 = new HashMap<String, Articolo>(Map.ofEntries(
                                new AbstractMap.SimpleEntry<String,Articolo>("Cibo", article1),
                                new AbstractMap.SimpleEntry<String,Articolo>("Bibita", article2),
                                new AbstractMap.SimpleEntry<String,Articolo>("Dolce", article3)
        ));
        System.out.println(articleMap3);


        //Immutable
        Map<String, Articolo> articleMap4 = Map.ofEntries(
                new AbstractMap.SimpleEntry<String,Articolo>("Cibo", article1),
                new AbstractMap.SimpleEntry<String,Articolo>("Bibita", article2),
                new AbstractMap.SimpleEntry<String,Articolo>("Dolce", article3)
        );
        System.out.println(articleMap4);



        System.out.println(articleMap.get("Bibita"));
        System.out.println(articleMap.get("Dolce"));
        System.out.println(articleMap.get("Cibo"));

        articleMap.remove("Dolce");
        System.out.println(articleMap);


        //Immutable => cannot remove or add key, but I can change the values
        articleMap4.get("Dolce").prezzo = 50.0;
        System.out.println(articleMap4);

        System.out.println(articleMap.containsKey("Cibo"));
        System.out.println(articleMap.containsKey("Pizza"));
        System.out.println(articleMap.containsValue("Pizza"));
        System.out.println(articleMap.containsValue(article1));






    }
}
