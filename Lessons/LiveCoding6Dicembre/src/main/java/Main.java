import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        RimessaBarche rb = new RimessaBarche(new ArrayList<Barca>(), "Rimessa Fabio");
        Barca b1 = new Barca(1,"Bella di mare", "una barca bella", TipoBarca.MOTORE);
        Barca b2 = new Barca(2,"Pesco molto", "una barca da pesca", TipoBarca.MOTORE);
        Barca b3 = new Barca(3,"Zatterona", "una zattera", TipoBarca.VELA);

        rb.aggiungiBarca(b1);
        rb.aggiungiBarca(b2);
        rb.aggiungiBarca(b3);
        rb.stampaBarche();
        System.out.println();

        rb.aggiungiBarca(b3);
        rb.aggiungiBarca(b2);
        rb.aggiungiBarca(b1);
        rb.stampaBarche();

    }

}

/*Definire la classe Barca:
        La classe Barca dovrebbe avere un attributo per memorizzare il nome della barca, una descrizione, e un tipo di barca (motore, vela).
        Creare un costruttore che accetta il nome della barca come parametro.
        Fornire un metodo per ottenere il nome della barca.
        Aggiungere un metodo astratto descrizione() che restituisca una stringa descrittiva della barca.
    Definire la classe RimessaBarche:
        La classe RimessaBarche dovrebbe gestire una lista di oggetti Barca.
        Creare un metodo per aggiungere una nuova barca alla rimessa.
        Creare un metodo per rimuovere una barca dalla rimessa.
        Implementare un metodo che visualizzi l'elenco completo delle barche presenti nella rimessa con le loro descrizioni.

    Creare una classe GestoreRimessa:
        La classe GestoreRimessa dovrebbe avere un oggetto RimessaBarche come attributo.
        Implementare un metodo per aggiungere una nuova barca alla rimessa attraverso il gestore.
        Implementare un metodo per rimuovere una barca dalla rimessa attraverso il gestore.
        Implementare un metodo che visualizzi l'elenco completo delle barche presenti nella rimessa attraverso il gestore.

    Creare una classe Main (classe principale):
        Nel metodo main, istanziare un oggetto GestoreRimessa.
        Aggiungere alcune barche di diversi tipi alla rimessa utilizzando il gestore.
        Rimuovere una barca dalla rimessa utilizzando il gestore.
        Visualizzare l'elenco aggiornato delle barche nella rimessa utilizzando il gestore.*/
