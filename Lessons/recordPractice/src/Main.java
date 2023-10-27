import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Articolo article1 = new Articolo("Pizza", 1.5);
        Articolo article2 = new Articolo("Coca Cola", 0.5);
        Articolo article3 = new Articolo("Tiramisu", 1.0);

        Map<String,Articolo> articlesMap = new HashMap<>();
        articlesMap.put("Cibo",article1);
        articlesMap.put("Bibita",article2);
        articlesMap.put("Dolce",article3);

        System.out.println(articlesMap);

        ArticoloRecord articleR1 = new ArticoloRecord("Pizza", 1.5);
        ArticoloRecord articleR2 = new ArticoloRecord("Bibita", 0.5);
        ArticoloRecord articleR3 = new ArticoloRecord("Tiramisu", 1.0);

        Map<String ,ArticoloRecord> articleRecordMap = new HashMap<>();
        articleRecordMap.put("Cibo", articleR1);
        articleRecordMap.put("Bibita", articleR2);
        articleRecordMap.put("Dolce", articleR3);
        System.out.println(articleRecordMap);

        System.out.println("articleR1.nome() = " + articleR1.nome());
        System.out.println("articleR1.prezzo() = " + articleR1.prezzo());

        ArticoloRecord articleR1copy = new ArticoloRecord("Pizza", 1.5);
        System.out.println("is articleR1 equal articleR1copy = " + articleR1copy.equals(articleR1));



    }
}
