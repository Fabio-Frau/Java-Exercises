import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ContoBancario cb1 = new ContoBancario("blabla", BigDecimal.valueOf(1000));
        ContoBancario cb2 = new ContoBancario("12345", BigDecimal.valueOf(90000));
        ContoBancario cb3 = new ContoBancario("9999", BigDecimal.valueOf(30000));

        Banca banca = new Banca("Bancamia", new ArrayList<ContoBancario>(List.of(cb1)),2);

        banca.visualizzaConti();
        System.out.println(banca.saldoTotale());

        System.out.println();
        banca.aggiungiConto(cb2);
        banca.visualizzaConti();
        System.out.println(banca.saldoTotale());

        System.out.println();
        banca.aggiungiConto(cb3);
        banca.visualizzaConti();
        System.out.println(banca.saldoTotale());



    }

}

/*Classe ContoBancario:
o    Definisci una classe ContoBancario con gli attributi iban (String) e saldo (double).
o    Crea un costruttore che prenda in input l'IBAN e il saldo iniziale del conto.
o    Implementa i metodi getIban, setIban, getSaldo e setSaldo per ottenere e impostare
 i valori degli attributi.
Classe Banca:
o    Definisci una classe Banca con attributi come nomeBanca (String), un array di ContoBancario
e un intero numConti (per tenere traccia del numero attuale di conti).
o    Crea un costruttore che accetti il nome della banca e il numero massimo di conti che la banca può gestire.
o    Implementa un metodo aggiungiConto che aggiunga un conto alla lista dei conti se non si supera
 il numero massimo di conti.
o    Crea un metodo visualizzaInformazioniConti che stampi le informazioni (ad esempio, IBAN e saldo)
 di tutti i conti presenti nella banca.
o    Implementa un metodo saldoTotale che restituisca il saldo totale di tutti i conti presenti nella banca.
Main:
o    Nel metodo main, crea un'istanza della classe Banca.
o    Crea alcuni oggetti ContoBancario e aggiungili alla banca utilizzando il metodo aggiungiConto.
o    Utilizza il metodo visualizzaInformazioniConti per stampare le informazioni sui conti della banca.
o    Utilizza il metodo saldoTotale per stampare il saldo totale della banca.*/
