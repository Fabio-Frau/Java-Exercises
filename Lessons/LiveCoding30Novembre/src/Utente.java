public class Utente {

    private int idUtente;
    private String nome;
    private String email;

    public Utente(int idUtente, String nome, String email) {
        this.idUtente = idUtente;
        this.nome = nome;
        this.email = email;
    }

    public int getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
