public class Barca {


    private int id;
    private String nome;
    private String descrizione;
    private TipoBarca tipo;


    public Barca(int id, String nome, String descrizione, TipoBarca tipo) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.tipo = tipo;
    }

    public TipoBarca getTipo() {
        return tipo;
    }

    public void setTipo(TipoBarca tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
