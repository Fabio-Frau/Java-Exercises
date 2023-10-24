import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Articolo article1 = new Articolo("Pizza",1.50);
        Articolo article2 = new Articolo("Coca Cola", 0.5);
        Articolo article3 = new Articolo("Tiramisù", 1.00);

        List<Articolo> lista1 = Arrays.asList(article1, article2, article3);
        List<Articolo> lista2 = new ArrayList<>();
        lista2.add(article1);
        lista2.add(article2);
        lista2.add(article3);


        System.out.println("lista1 : " + lista1);
        System.out.println("lista2 : " + lista2);

        lista2.remove(0);
        System.out.println("lista2 removed : " + lista2);
        System.out.println("lista2[0] = " + lista2.get(0));

        lista2.set(0, new Articolo("Fanta",0.5));
        System.out.println("lista2[0] = " + lista2.get(0));

        System.out.println("Print articles using for loop");
        for (Articolo article : lista2) {
            System.out.println(article);
        }

        System.out.println("lista2 size = " + lista2.size());

        lista2.clear();
        System.out.println("lista2 size = " + lista2.size());

        List<String> stringList = Arrays.asList("Pizza", "Coca Cola", "Tiramisu");
        System.out.println("stringList: " + stringList);

        Collections.sort(stringList);
        System.out.println("Sorted stringList: " + stringList);

        List<String> stringList2 = Arrays.asList("Pizza", "coca Cola", "Tiramisu");
        Collections.sort(stringList2);
        System.out.println("Sorted stringList2: " + stringList2);

        stringList2.sort(Comparator.naturalOrder());
        System.out.println("stringList2 naturalOrder: " + stringList2);
        stringList2.sort(Comparator.reverseOrder());
        System.out.println("stringList2 reverseOrder: " + stringList2);
        stringList2.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("stringList2 CASE_INSENSITIVE_ORDER : " + stringList2);


        System.out.println("lista1 : " + lista1);
        lista1.sort(Comparator.comparing(Articolo::getNome));
        System.out.println("lista1 Comparator.comparing by name : " + lista1);

        lista1.sort(Comparator.comparing(Articolo::getPrezzo));
        System.out.println("lista1 Comparator.comparing by prezzo : " + lista1);

        List<Articolo> lista3 = Arrays.asList(article1, article2, article3);
        System.out.println("lista3 : " + lista3);
        lista3.sort(new Comparator<Articolo>() {
            @Override
            public int compare(Articolo o1, Articolo o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println("lista3 sort(new Comparator) by name: \n" + lista3);

        lista3.sort(new Comparator<Articolo>() {
            @Override
            public int compare(Articolo o1, Articolo o2) {
                return o1.getPrezzo().compareTo(o2.getPrezzo());
            }
        });

        System.out.println("lista3 sort(new Comparator) by price: \n" + lista3);

        List<Articolo> lista4 = Arrays.asList(article1, article2, article3);
        System.out.println("lista4 : " + lista4);
        Collections.sort(lista4, new Comparator<Articolo>() {
            @Override
            public int compare(Articolo o1, Articolo o2) {
                return o1.getPrezzo().compareTo(o2.getPrezzo());
            }
        });

        System.out.println("lista4 sort(new Comparator) by price: \n" + lista4);

    }
}
