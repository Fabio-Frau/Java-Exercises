import java.util.ArrayList;

public class Corso {
    private String nome;
    private ArrayList<Studente> studenti;
    private ArrayList<Docente> docenti;

    public Corso(String nome, ArrayList<Studente> studenti, ArrayList<Docente> docenti) {
        this.nome = nome;
        this.studenti = studenti;
        this.docenti = docenti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
