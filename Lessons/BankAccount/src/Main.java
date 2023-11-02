/*Crea un programma per la gestione di un controcorrente gestito dalla classe CC.
Il programma deve essere in grado di effettuare versamenti, prelievi, di restituire
il saldo e di effettuare la lista degli ultimi 5 movimenti .*/

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        ContoCorrente conto1 = new ContoCorrente("Fabio", "IT111111", BigDecimal.valueOf(500000), Valuta.EUR);
        ContoCorrente conto2 = new ContoCorrente("Paperino", "PP999999", BigDecimal.valueOf(1), Valuta.EUR);
        ContoCorrente conto3 = new ContoCorrente("Topolino","TP555555", BigDecimal.valueOf(6000), Valuta.EUR );



        Banca.operazioneBonifico(conto1, conto2, BigDecimal.valueOf(500),"Rimborso spese Paperino");
//        System.out.println(conto1.getSaldo());
//        System.out.println(conto2.getSaldo());
        Banca.operazioneBonifico(conto2,conto3,BigDecimal.valueOf(50),"Regalo compleanno Topolino");
        Banca.stampaListaMovimenti();

    }
}
