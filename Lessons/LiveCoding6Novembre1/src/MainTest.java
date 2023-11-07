import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ArgumentsSource;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    ArrayList<Giocatore> giocatori = new ArrayList<>();

    @BeforeEach
    public void init() {
        Giocatore g1 = new Giocatore("Cristiano", "Ronaldo", false, 200,50);
        Giocatore g2 = new Giocatore("Leo", "Messi", false, 250,30);
        Giocatore g3 = new Giocatore("Diego Armando", "Maradona", true, 150,40);
        Giocatore g4 = new Giocatore("Ciccio", "Caputo", false, 15,1);

        //ArrayList<Giocatore> giocatori = new ArrayList<>(Arrays.asList(g1,g2,g3,g4));

        giocatori.add(g4);
        giocatori.add(g3);
        giocatori.add(g2);
        giocatori.add(g1);
    }

    @Test
    public void calcolaGoalTotaliGiocatoreNonPresente () {
        Exception ex = assertThrows(NullPointerException.class, () -> GiocatoreUtils.calcolaGoalTotali("Pippo", "Paperino", giocatori));
        assertEquals(NullPointerException.class, ex.getClass());
        assertEquals("Giocatore non trovato nel DB", ex.getMessage());
    }

    @Test
    public void calcolaGoalTotaliNullThrowException () {
        Exception ex = assertThrows(NullPointerException.class, () -> GiocatoreUtils.calcolaGoalTotali("Ciccio", "Caputo", null));
        assertEquals(NullPointerException.class, ex.getClass());
        assertEquals("Database not found", ex.getMessage());

    }

    @Test
    public void calcolaGoalTotaliNullNameResult() {
        Exception ex = assertThrows(NullPointerException.class, () ->  GiocatoreUtils.calcolaGoalTotali(null, null, giocatori));
        assertEquals(NullPointerException.class, ex.getClass());
        assertEquals("Errore sui parametri nome/cognome", ex.getMessage());
    }

    @Test
    public void calcolaGoalTotaliBlankEmptyNameResult() {
        Exception ex = assertThrows(NullPointerException.class, () ->  GiocatoreUtils.calcolaGoalTotali(" ", " ", giocatori));
        assertEquals(NullPointerException.class, ex.getClass());
        assertEquals("Errore sui parametri nome/cognome", ex.getMessage());
    }

    @Test
    public void calcolaGoalTotaliNull() {
        int goalTotali = GiocatoreUtils.calcolaGoalTotali("Ciccio", "Caputo", giocatori);
        assertEquals(16, goalTotali);
    }

    @Test
    public void calcolaGoalTotali() {
        int goalTotali = GiocatoreUtils.calcolaGoalTotali("Ciccio","Caputo", giocatori);
        assertEquals(16, goalTotali);
    }

}