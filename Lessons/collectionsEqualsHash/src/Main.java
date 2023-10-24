public class Main {

    public static void main(String[] args) {

        Articolo article1 = new Articolo("Pizza",1.50);
        Articolo article2 = new Articolo("Pizza",1.50);

        System.out.println("article1 : " + article1);
        System.out.println("article2 : " + article2);

        Boolean areEqual = article1.equals(article2);
        System.out.println("Are equals? : " + areEqual);
    }
}
