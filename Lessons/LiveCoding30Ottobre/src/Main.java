/*Crea un programma per la gestione di un controcorrente gestito dalla classe CC.
Il programma deve essere in grado di effettuare versamenti, prelievi, di restituire
il saldo e di effettuare la lista degli ultimi 5 movimenti .*/

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        ContoCorrente conto1 = new ContoCorrente("Leonardo", "IT36123456789", BigDecimal.valueOf(100.0) , Valuta.EURO);
        ContoCorrente conto2 = new ContoCorrente("Donatello", "IT36987456321", BigDecimal.valueOf(500), Valuta.EURO);
        ContoCorrente conto3 = new ContoCorrente("Raffaello", "IT36000000000", BigDecimal.valueOf(1000), Valuta.DOLLARI);
        ContoCorrente conto4 = new ContoCorrente("Michelangelo", "IT36777777777", BigDecimal.valueOf(50000), Valuta.STERLINE);


        System.out.println(conto1);
        System.out.println(conto2);
        System.out.println(conto3);
        System.out.println(conto4);

        MovimentiBancari.bonifico(conto4,conto3,BigDecimal.valueOf(1000));

    }
}
