import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Giocatore {

    private String nome;
    private String cognome;
    private boolean capitano;
    private int goal;
    private int goalNazionale;




    public Giocatore(String nome, String cognome, boolean capitano, int goal, int goalNazionale) {
        this.nome = nome;
        this.cognome = cognome;
        this.capitano = capitano;
        this.goal = goal;
        this.goalNazionale = goalNazionale;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isCapitano() {
        return capitano;
    }

    public void setCapitano(boolean capitano) {
        this.capitano = capitano;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getGoalNazionale() {
        return goalNazionale;
    }

    public void setGoalNazionale(int goalNazionale) {
        this.goalNazionale = goalNazionale;
    }

    @Override
    public String toString() {
        return "Giocatore{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", capitano=" + capitano +
                ", goal=" + goal +
                ", goalNazionale=" + goalNazionale +
                '}';
    }
}
