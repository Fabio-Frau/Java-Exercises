import java.math.BigDecimal;

public class Prodotto {

    private int id;
    private String nome;
    private BigDecimal prezzo;




    public Prodotto(int id, String nome, BigDecimal prezzo) {
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
