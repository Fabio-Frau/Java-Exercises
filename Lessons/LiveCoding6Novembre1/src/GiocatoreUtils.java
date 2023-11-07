import java.util.ArrayList;
import java.util.Locale;

public class GiocatoreUtils {

    public static Integer calcolaGoalTotali(String nome, String cognome, ArrayList<Giocatore> database) {
        try {
            Giocatore g = cercaConNomeECognome(nome, cognome, database);
            if (g != null) {
                return g.getGoal() + g.getGoalNazionale();
            } else {
                throw new NullPointerException("Giocatore non trovato nel DB");
            }
        } catch (NullPointerException e) {
            throw e;
        }

    }

    public static Giocatore cercaConNomeECognome(String nome, String cognome, ArrayList<Giocatore> database) {
        if (nome == null || cognome == null || nome.isBlank() || cognome.isBlank()) {
            throw new NullPointerException("Errore sui parametri nome/cognome");
        }
        if (database != null) {
            for (Giocatore g : database) {
                if (g.getNome().toLowerCase(Locale.ROOT).equals(nome.toLowerCase(Locale.ROOT)) &&
                        g.getCognome().toLowerCase(Locale.ROOT).equals(cognome.toLowerCase(Locale.ROOT))
                ) {
                    return g;
                }
            }
        } else {
            throw new NullPointerException("Database not found");
        }
        return null;
    }

    public static ArrayList<Giocatore> cercaNome(String nome, ArrayList<Giocatore> database){
        ArrayList<Giocatore> giocatori = new ArrayList<>();

        for (Giocatore g : giocatori) {
            if( g.getNome().toLowerCase(Locale.ROOT).equals(nome.toLowerCase(Locale.ROOT))) {
                giocatori.add(g);
            }
        }
        return giocatori;
    }
}
