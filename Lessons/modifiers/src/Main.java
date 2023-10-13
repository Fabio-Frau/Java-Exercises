public class Main {
    public static void main(String[] args) {

        Articolo article1 = new Articolo("Pizza Napoli", 3.99, 0.1);
        Articolo article2 = new Articolo("Coca Cola", 0.99, 0.22);
        Articolo article3 = new Articolo("Tiramisu", 2.49, 0.22);

        Articolo[] articoli = new Articolo[] {article1, article2};

        CarrelloSenzaIva carrelloSenzaIva = new CarrelloSenzaIva(articoli);
        System.out.println("Carrello senza Iva:");
        System.out.println("Numero di articoli: " + carrelloSenzaIva.getArticoli().length);
        System.out.println("Prezzo finale): " + carrelloSenzaIva.getPrezzoFinale());
        System.out.println("CarrelloSenzaIVA toString: " + carrelloSenzaIva);

        CarrelloConIva carrelloConIva = new CarrelloConIva(articoli);
        System.out.println("Carrello con Iva:");
        System.out.println("Numero di articoli: " + carrelloConIva.getArticoli().length);
        System.out.println("Prezzo finale: " + carrelloConIva.getPrezzoFinale());
        System.out.println("CarrelloConIva toString: " + carrelloConIva);
    }
}
