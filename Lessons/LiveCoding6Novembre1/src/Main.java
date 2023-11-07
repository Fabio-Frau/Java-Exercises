import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Giocatore g1 = new Giocatore("Cristiano", "Ronaldo", false, 200,50);
        Giocatore g2 = new Giocatore("Leo", "Messi", false, 250,30);
        Giocatore g3 = new Giocatore("Diego Armando", "Maradona", true, 150,40);
        Giocatore g4 = new Giocatore("Ciccio", "Caputo", false, 15,1);

        ArrayList<Giocatore> giocatori = new ArrayList<>(Arrays.asList(g1,g2,g3,g4));

        //System.out.println(new GiocatoreUtils().calcolaGoalTotali("Ciccio", "Caputo", giocatori));
        System.out.println(GiocatoreUtils.calcolaGoalTotali("Ciccio", "Caputo", giocatori));


    }
}
