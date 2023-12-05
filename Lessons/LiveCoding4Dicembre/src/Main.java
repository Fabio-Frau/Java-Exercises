import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Prodotto p1 = new Prodotto(1, "Iphone", BigDecimal.valueOf(799));
        Prodotto p2 = new Prodotto(2, "Iphone", BigDecimal.valueOf(799));
        Prodotto p3 = new Prodotto(3, "Galaxy S20", BigDecimal.valueOf(599));

        ArrayList<Prodotto> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        Inventario inv = new Inventario(lista);
        System.out.println("inventario base");
        System.out.println(inv);
        System.out.println("Valore totale: " + inv.calcolaValoreTotale());
        System.out.println("Quanti Iphone? : " + inv.getQuantita("Iphone"));

        inv.aggiungiProdotto(new Prodotto(4, "Huawei", BigDecimal.valueOf(300)));
        System.out.println("Aggiungo huawei");
        System.out.println(inv);
        System.out.println("Valore totale: " + inv.calcolaValoreTotale());
        System.out.println("Quanti Iphone? : " + inv.getQuantita("Iphone"));

        inv.rimuoviProdotto(1);
        System.out.println("Rimuovo id 1");
        System.out.println(inv);
        System.out.println("Valore totale: " + inv.calcolaValoreTotale());
        System.out.println("Quanti Iphone? : " + inv.getQuantita("Iphone"));



    }

}

/*Prodotto => id, nome, prezzo, quantitaDisponibile*/

/*Consegna:
* Parte 1: Definizione delle Classi
Classe Prodotto:

Definire una classe Prodotto con i seguenti attributi:
id (int)
nome (String)
prezzo (double)
quantitaDisponibile (int)
Classe Inventario:

Definire una classe Inventario che rappresenti un inventario di prodotti.
Utilizzare una struttura dati appropriata (ad esempio, HashMap) per memorizzare i prodotti nell'inventario.
Implementare i seguenti metodi nella classe Inventario:
aggiungiProdotto(Prodotto prodotto): Aggiunge un prodotto all'inventario.
rimuoviProdotto(int id): Rimuove un prodotto dall'inventario in base all'ID.
aggiornaQuantita(int id, int nuovaQuantita): Aggiorna la quantità disponibile di un prodotto dato l'ID.
calcolaValoreTotale(): Calcola e restituisce il valore totale dell'inventario.
Parte 2: Implementazione dell'Applicazione
Classe Main:
Creare una classe Main con un metodo main per testare le funzionalità dell'inventario.
Creare un oggetto Inventario e eseguire una serie di operazioni come l'aggiunta di prodotti, la rimozione di prodotti e l'aggiornamento delle quantità.
Stampare il valore totale dell'inventario dopo ogni operazione.
Parte 3: Gestione delle Eccezioni
Eccezioni Personalizzate:

Creare una eccezione personalizzata chiamata QuantitaNegativaException che viene lanciata quando si tenta di impostare una quantità negativa per un prodotto.
Gestione delle Eccezioni:

Modificare i metodi dell'inventario per gestire correttamente l'eccezione QuantitaNegativaException quando viene lanciata. */
