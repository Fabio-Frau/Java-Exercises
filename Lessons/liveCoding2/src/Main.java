import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaParole = new ArrayList<String>();
        listaParole.add("Ciao");
        listaParole.add("Anguria");
        listaParole.add("Canguro");
        listaParole.add("Gatto");
        listaParole.add("T-rex");
        listaParole.add("Porporatromboticatrombocitopenica");

//        System.out.println(listaParole.toString());
//        ArrayList<String> nuovo = rimuovi(listaParole,"Gatto");
//        System.out.println(listaParole.toString());
//        System.out.println(nuovo.toString());

//        ArrayList<Integer> occorrenze = cerca(listaParole,"Porporatromboticatrombocitopenica");
//        System.out.println(occorrenze.toString());
//
//        System.out.println(contaParola(listaParole,"Gatto"));
//
//        System.out.println(paroleConSequenza(listaParole,"ia").toString());
//        System.out.println(rimuoviParoleConSequenza(listaParole,"ia").toString());
//
//        System.out.println(sostituisciConTrattini(listaParole,"***"));

//        System.out.println(deleteList(listaParole));
//        System.out.println(listaParole.toString());

        System.out.println(listaParole.toString());

        ArrayList<String> nuovoArray = new ArrayList<String>();
        nuovoArray.add("Topolino");
        nuovoArray.add("Paperino");
        nuovoArray.add("Paperino");
        nuovoArray.add("Paperino");
        nuovoArray.add("Paperino");
        nuovoArray.add("Paperino");
        nuovoArray.add("Paperino");
        nuovoArray.add("Paperino");
        nuovoArray.add("Paperino");
        nuovoArray.add("Paperino");
        nuovoArray.add("Paperino");
        nuovoArray.add("Paperino");




        System.out.println(rimpiazzaElementi(listaParole,nuovoArray).toString());


    }


    public static ArrayList<String> rimpiazzaElementi(ArrayList<String> parole, ArrayList<String> rimpiazzi) {
        int limiteSup = Integer.min(parole.size(),rimpiazzi.size());
        for (int i = 0; i < limiteSup; i++) {
            parole.set(i,rimpiazzi.get(i));
        }

        return parole;
    }

    public static boolean deleteList(ArrayList<String> parole) {

        if (parole.size() > 5) {
            parole.clear();
            return true;

        }

        return false;
    }

    public static ArrayList<String> rimuovi(ArrayList<String> parole, String daRimuovere) {

        if (parole.remove(daRimuovere)) {
            System.out.println("Elemento " + daRimuovere + " rimosso");
        } else {
            System.out.println("L'elemento " + daRimuovere + " non è presente nell'ArrayList");
        }
        return parole;

    }


    public static ArrayList<Integer> cerca(ArrayList<String> parole, String daCercare) {

        ArrayList<Integer> indici = new ArrayList<Integer>();

        for (int i = 0; i < parole.size(); ) {

            int risultatoIndici = parole.subList(i, parole.size()).indexOf(daCercare);
            if (risultatoIndici != - 1) {
                indici.add(risultatoIndici);
                i = risultatoIndici + 1;
            } else {
                return indici;
            }
        }

        return  indici;

    }


    public static int contaParola(ArrayList<String> parole, String daContare) {

        return cerca(parole, daContare).size();

    }

    public static ArrayList<String> paroleConSequenza(ArrayList<String> parole, String sequenza) {

        ArrayList<String> risultato = new ArrayList<>();

        for (String parola : parole) {
            if (parola.contains(sequenza)) {
                risultato.add(parola);
            }
        }
        return risultato;

    }

    public static ArrayList<String> rimuoviParoleConSequenza(ArrayList<String> parole, String sequenza) {

            /*Potrei chiamare il metodo precedente e usare remove senza fare il for
            * però così non restituisco un arraylist in uscita ma modifico semplicemente
            * quello che li passo per reference*/
            //parole.removeAll(paroleConSequenza(parole,sequenza));

//
        ArrayList<String> risultato = new ArrayList<String>();

        for (String parola : parole) {
            if (!parola.contains(sequenza)) {
                risultato.add(parola);
            }
        }
        return risultato;
    }


public static ArrayList<String> sostituisciConTrattini(ArrayList<String> parole, String sostituto) {

        int meta = parole.size() / 2;


        for (int i = 0; i < meta; i++) {
            parole.set(i,sostituto);
        }

    return parole;
}




}
