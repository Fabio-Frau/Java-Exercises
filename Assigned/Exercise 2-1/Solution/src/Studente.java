public class Studente {

    private String nome;
    private String cognome;
    private int identificativo;


    public Studente (String nome, String cognome, int identificativo) {
        setNome(nome);
        setCognome(cognome);
        setIdentificativo(identificativo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", identificativo=" + identificativo +
                '}';
    }
}
