
public class Main {

    public static void main(String[] args) {

        Articolo article1 = new Articolo("Pizza Napoli", 3.99, 0.1);
        System.out.println("Article1: " + article1);
        Articolo article2 = new Articolo("Coca Cola", 0.99, 0.22);
        System.out.println("Article2: " + article2);
        Carrello carrello = new Carrello(new Articolo[] {article1, article2});
        System.out.println("Numero di articoli: " + carrello.getArticoli().length);
        System.out.println("Prezzo finale senza iva: " + carrello.getPrezzoFinale(false));
        System.out.println("Prezzo finale con iva: " + carrello.getPrezzoFinale(true));



        Articolo article3 = new Articolo("Tiramisu", 2.49 , 0.5);
        carrello = new Carrello(new Articolo[] {article1, article2, article3});
        System.out.println("Numero di articoli: " + carrello.getArticoli().length);
        System.out.println("Prezzo finale senza iva: " + carrello.getPrezzoFinale(false));
        System.out.println("Prezzo finale con iva: " + carrello.getPrezzoFinale(true));


    }





}
