package Exercise;

import static org.junit.jupiter.api.Assertions.*;

class GiocatoriUtilsTest {

    ArrayList<Giocatore> giocatori = new ArrayList<>();

    @BeforeAll
    public void init() {
        Giocatore g = new Giocatore("Cristiano", "Ronaldo" ,false, 200, 50);
        Giocatore g1 = new Giocatore("Leo", "Messi" , false, 250, 30);
        Giocatore g2 = new Giocatore("Diego Armando", "Maradona" , true, 150, 40);
        Giocatore g3 = new Giocatore("Ciccio", "Caputo" , false, 15, 1);
        giocatori.add(g);
        giocatori.add(g1);
        giocatori.add(g2);
        giocatori.add(g3);
    }

    @Test
    public void calcolaGoalTotali() {
        int goalTotali = GiocatoriUtils.calcolaGoalTotali("Ciccio", "Caputo", giocatori);
        assertEquals(16, goalTotali);
    }

    @Test
    public void calcolaGoalTotaliNull() {
        int goalTotali = GiocatoriUtils.calcolaGoalTotali("Ciccio", "Caputo", null);
        assertEquals(0, goalTotali);
    }


}