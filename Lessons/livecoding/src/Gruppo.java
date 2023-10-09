import java.util.ArrayList;

public class Gruppo {

    private String nome;
    private ArrayList<Studente> studenti;

    public Gruppo(String nome, ArrayList<Studente> studenti) {
        this.nome = nome;
        this.studenti = studenti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Studente> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Studente> studenti) {
        this.studenti = studenti;
    }

    public void addStudenti()

    @Override
    public String toString() {
        return "Gruppo{" +
                "nome='" + nome + '\'' +
                ", studenti=" + studenti +
                '}';
    }
}
