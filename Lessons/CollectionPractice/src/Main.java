import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> lista = new HashSet<String>(Arrays.asList("1","2","3"));
        Set<String> lista1 = new HashSet<String>();

        lista1.add("1");
        lista1.add("2");
        lista1.add("3");

        System.out.println("lista: " + lista);
        System.out.println("lista1: " + lista1);

        lista.add("4");
        lista1.remove("2");
        System.out.println("lista: " + lista);
        System.out.println("lista1: " + lista1);

//        for (String element : lista) {
//            System.out.println("Element: " + element);
//
//            if (Objects.equals(element, "3")) {
//                lista.remove(element);
//            }
//        }


        System.out.println("lista: " + lista);
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            iterator.remove();
        }

        System.out.println("lista: " + lista);




    }
}
