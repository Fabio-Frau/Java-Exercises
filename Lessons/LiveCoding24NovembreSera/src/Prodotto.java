import java.math.BigDecimal;

public class Prodotto {

    private int id;
    private String nome;
    private String marca;
    private BigDecimal prezzo;

    public Prodotto(int id, String nome, String marca, BigDecimal prezzo) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }
}
