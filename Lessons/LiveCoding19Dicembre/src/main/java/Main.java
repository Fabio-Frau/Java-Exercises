/*// Modellare un sistema di pagamento che abbia diversi tipi di pagamento attivi
(CartaCredito,PayPal,Contanti)
// Definire dei metodi che ti permettano di effettuare un pagamento di un certo
importo e ti definiscano il tipo di pagamento che stai usando.*/


import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        PayPal p = new PayPal("pippo@email.com");
        CartaCredito c = new CartaCredito("0000", "Topolino");
        Contante cont = new Contante();

        p.effettuaPagamento(BigDecimal.valueOf(1000));
        c.effettuaPagamento(BigDecimal.valueOf(50000));
        cont.effettuaPagamento(BigDecimal.valueOf(50));


    }

}
