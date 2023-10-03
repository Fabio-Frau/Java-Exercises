public class Main {
    public static void main(String[] args) {

        Articolo article1 = new Articolo();
        article1.nome = "Pizza Napoli";
        article1.prezzo = 3.99;

        Articolo article2 = new Articolo();
        article2.nome = "Coca Cola";
        article2.prezzo = 0.99;

        System.out.println("Articolo 1: " + article1);
        System.out.println("Articolo 2: " + article2);

        Carrello carrello = new Carrello();
        carrello.articoli = new Articolo[] {article1, article2};
        carrello.prezzoFinale = article1.prezzo + article2.prezzo;

        System.out.println("Carrello: " + carrello);
    }
}
